angular.module('datasourcejs', [])

/**
* Global factory responsible for managing all datasets
*/
.factory('DatasetManager', ['$http','$q', '$timeout','$rootScope', 'Notification', function($http, $q, $timeout, $rootScope, Notification) {
   // Global dataset List
  this.datasets = {};

  /**
  * Class representing a single dataset
  */
  var DataSet = function(name, scope) {
    // Publiic members
    this.Notification = Notification;
    this.$scope = scope;
    this.$apply = function(fc) { scope.$apply(fc); }.bind(scope);
    this.data = [];
    this.name = name;
    this.keys = [];
    this.enabled = true;
    this.endpoint = null;
    this.active = {};
    this.inserting = false; 
    this.editing = false;
    this.fetchSize = 2;
    this.observers = [];
    this.rowsPerPage = null;
    this.append = true;
    this.headers = null;
    this._activeValues = null;
    this.errorMessage = "";
    this.onError = null;
    this.links = null;
    this.loadedFinish = null;

    // Private members
    var cursor = 0;
    var service = null;
    var _savedProps;
    var hasMoreResults = false;
    var busy = false;
    var loaded = false;
    var _self = this;
    var unregisterDataWatch = null;
    
    // Public methods
    /**
    * Initialize a single datasource
    */
    this.init = function() {

      var dsScope = this;

      // Get the service resource
      service = {
        save : function(object) {
          var response = this.call(_self.entity, "POST", object, true);
          return response;
        },
        update : function(url, object) {
          var response = this.call(url, "PUT", object);
          return response;
        },
        remove : function(url) {
          var response = this.call(url, "DELETE", null, true);
          return response;
        },
        call: function(url, verb, object, applyScope) {
          var _callback;
          busy = true;
          
          // Get an ajax promise
          this.$promise = $http({
            method: verb,
            url: url,
            data : (object) ? JSON.stringify(object) : null,
            headers: _self.headers
          }).success(function(data, status, headers, config) {
              busy = false;
              if(_callback) _callback(data);
          }).error(function(data, status, headers, config) {
              busy = false;
              _self.handleError(data);
          });
          
          this.$promise.then = function(callback) {
            _callback = callback;
          }
          
          return this;
        }
      }
      
     /**
      * Check if the datasource is waiting for any request response
      */
      this.isBusy = function() {
        return busy;
      }
      
     /**
      * Check if the datasource was loaded by service
      */
      this.isLoaded = function() {
        return loaded;
      }
      
      this.toString = function() {
        return "[Datasource]"
      }

      this.handleAfterCallBack = function(callBackFunction){
        
        if(callBackFunction){
        
            try {
              var indexFunc = callBackFunction.indexOf('(')==-1 ? callBackFunction.length: callBackFunction.indexOf('(');
              var func = eval( callBackFunction.substring(0,indexFunc) );
              var isFunc = typeof(func) === 'function';
              if(isFunc) func.call(this, this);
            }catch(e){
              this.handleError(e);
            }
      
        }

      }
      
      this.handleBeforeCallBack = function(callBackFunction){
        var isValid = true;
        if(callBackFunction){
          
          try {
            var indexFunc = callBackFunction.indexOf('(')==-1 ? callBackFunction.length: callBackFunction.indexOf('(');
            var func = eval( callBackFunction.substring(0,indexFunc) );
            var isFunc = typeof(func) === 'function';
            if(isFunc) func.call(this, this.active);
          }catch(e){
              isValid = false;
              this.handleError(e);
          }
  
        }
        return isValid;
 
      }

      
      /**
     * Error Handler function
     */
      /**
     * Error Handler function
     */
      this.handleError = function(data) {
        console.log(data);
        var error = ""; 
        
        if(data) {
          if (Object.prototype.toString.call(data) === "[object String]") {
            error = data;
          } else {
            var errorMsg = (data.msg||data.desc||data.error||data.message||data.responseText);
            if (errorMsg) {
              error = errorMsg;
            }
          }
        } 
        
        if (!error) {
          error = this.defaultNotSpecifiedErrorMessage;
        }
                 
        var regex = /<h1>(.*)<\/h1>/gmi;
        result = regex.exec(error);
        
        if(result && result.length >= 2) {
          error = result[1];
        }

        this.errorMessage = error;
        
        if (this.onError &&  this.onError != '') {
          if(typeof(this.onError) === 'string'){
            try {
              var indexFunc = this.onError.indexOf('(')==-1 ? this.onError.length: this.onError.indexOf('(');
              var func = eval( this.onError.substring(0,indexFunc) );
              if(typeof(func) === 'function'){
                this.onError = func;
              }
            }catch(e){
                isValid = false;
                Notification.error(e);
            }
          }
        }else{
          this.onError = function(error) {
                Notification.error(error);
              };
        }
        this.onError.call(this, error);
      }
      
      // Start watching for changes in
      // activeRow to notify observers
      if(this.observers && this.observers.length > 0) {
        $rootScope.$watch(function() {
          return this.active;
        }.bind(this), function ( activeRow ) {
          if(activeRow) {
            this.notifyObservers(activeRow);         
          }
        }.bind(this), true);
      }
    }

    //Public methods
    /**
    * Append a new value to the end of this dataset.
    */ 
    this.insert = function (obj, callback) {
      if(this.handleBeforeCallBack(this.onBeforeCreate))
        service.save(obj).$promise.then(callback);
    };

    /**
    * Uptade a value into this dataset by using the dataset key to compare
    * the objects
    */ 
    this.update = function (obj, callback) {
      // Get the keys values
      var keyObj = getKeyValues(obj);
      
      var url = this.entity;
      
      var suffixPath = "";
      for(var key in keyObj) {
        if(keyObj.hasOwnProperty(key)) {
          suffixPath += "/" + keyObj[key];
        }
      }
      
      url = url + suffixPath;
      
      if(this.handleBeforeCallBack(this.onBeforeUpdate))
        service.update(url, obj).$promise.then(callback);        
    };

    /**
     * Valid if required field is valid 
     */
    this.missingRequiredField = function() {
      return $('input[required]').hasClass('ng-invalid-required') || $('input[required]').hasClass('ng-invalid')
      ||  $('input[required]').hasClass('ng-empty');
    }
    
    /**
    * Insert or update based on the the datasource state
    */ 
    this.post = function () {
      
      if (this.missingRequiredField())
        return;
      
      if(this.inserting) {
        // Make a new request to persist the new item
        this.insert(this.active, function(obj) {
          // In case of success add the new inserted value at
          // the end of the array
          this.data.push(obj);
          // The new object is now the active
          this.active = obj;
          this.handleAfterCallBack(this.onAfterCreate);
        }.bind(this));
        
      } else if(this.editing) {
        // Make a new request to update the modified item
        this.update(this.active, function(obj) {
          // Get the list of keys
          var keyObj = getKeyValues(obj);
          
          // For each row data
          this.data.forEach(function(currentRow) {
            // Iterate all keys checking if the 
            // current object match with the
            // extracted key values
            var found;
            for(var key in keyObj) {
              if(currentRow[key] && currentRow[key] === keyObj[key]) {
                found = true;
              } else {
                found = false;
              }
            }
            if(found) {
              this.copy(obj,currentRow);
            }
            this.handleAfterCallBack(this.onAfterUpdate);
          }.bind(this));
        }.bind(this));
      }
      
      // Set this datasource back to the normal state
      this.editing = false;
      this.inserting = false;
    };

  /**
  * Cancel the editing or inserting state
  */
    this.cancel = function() {
      if(this.inserting) {
        this.active = this.data[0];
      }
      this.inserting = false;
      this.editing = false;
    };
    
  /**
  * Put the datasource into the inserting state
  */
   this.startInserting = function () {
     this.inserting = true;
     this.active = {};
     if(this.onStartInserting){
       this.onStartInserting();
     }
   };
   
   /**
  * Put the datasource into the editing state
  */
   this.startEditing = function (item) {
     if(item) this.active = this.copy(item);
     this.editing = true;
   };

    /**
    * Remove an object from this dataset by using the given id.
    * the objects
    */
    this.remove = function (object, callback) {
      var _remove = function(object, callback) {
        if(!object) {
            object = this.active;
          }
          
          var keyObj = getKeyValues(object);
          
          var suffixPath = "";
          for(var key in keyObj) {
            if(keyObj.hasOwnProperty(key)) {
              suffixPath += "/" + keyObj[key];
            }
          }
          
          callback = callback || function() {
            // For each row data
            for(var i = 0; i < this.data.length; i++) {
              // Iterate all keys checking if the 
              // current object match with the same
              // vey values
              // Check all keys
              var found;
              for(var key in keyObj) {
                if(keyObj.hasOwnProperty(key)) {
                  if(this.data[i][key] && this.data[i][key] === keyObj[key]) {
                    found = true;
                  } else {
                    // There's a difference between the current object
                    // and the key values extracted from the object
                    // that we want to remove
                    found = false;
                  }
                }
              }
              if(found) {
                // If it's the object we're loking for
                // remove it from the array
                this.data.splice(i,1)
                this.active = (i > 0) ? this.data[i - 1] : null;
              }
              
            }
          }.bind(this)
          
          if(this.handleBeforeCallBack(this.onBeforeDelete))
            service.remove(this.entity + suffixPath).$promise.then(callback); 
      }.bind(this);
      
      if(this.deleteMessage && this.deleteMessage.length > 0) {
        if(confirm(this.deleteMessage)) {
          _remove(object, callback); 
        }else{
          this.filter();
        }
      } else {
        _remove(object, callback);
      }
      this.handleAfterCallBack(this.onAfterDelete);
    };
    
    /**
     * Get the object keys values from the datasource keylist
     * PRIVATE FUNCTION
     */
    var getKeyValues = function(rowData) {
        var keys = this.keys;
        var keyValues = {};
        for(var i = 0; i < this.keys.length; i++) {
          keyValues[this.keys[i]] = rowData[this.keys[i]];
        }
        
        return keyValues;
    }.bind(this);
    
  /**
     * Check if two objects are equals by comparing their keys
     * PRIVATE FUNCTION
     */
    var objectIsEquals = function(object1, object2) {
        var keys1 = getKeyValues(object1);
        var keys2 = getKeyValues(object2);
        for(var key in keys1) {
          if(keys1.hasOwnProperty(key)) {
            if(!keys2.hasOwnProperty(key)) return false;
            if(keys1[key] !== keys2[key]) return false;
          }
        }
        return true;
    }

    /**
    * Check if the object has more itens to iterate
    */
    this.hasNext = function () {
      return this.data && (cursor < this.data.length - 1);
    };
  
  /**
    * Check if the cursor is not at the beginning of the datasource
    */
    this.hasPrevious = function () {
      return this.data && (cursor > 0);
    };

    /**
    * Check if the object has more itens to iterate
    */
    this.order = function (order) {
      _savedProps.order = order;
    };
  
    /**
    * Get the values of the active row as an array.
    * This method will ignore any keys and only return the values
    */
    this.getActiveValues = function() {
      if(this.active && !this._activeValues) {
        $rootScope.$watch(function(scope) { 
          return this.active; 
        }.bind(this),
        function(newValue, oldValue) {
            this._activeValues = this.getRowValues(this.active);
        }.bind(this), true);
      }
      return this._activeValues;
    }
    
    this.__defineGetter__('activeValues', function() { return _self.getActiveValues(); });
    
    /**
    * Get the values of the given row
    */
    this.getRowValues = function(rowData) {
    var arr = [];
    for( var i in rowData ) {
      if (rowData.hasOwnProperty(i)){
         arr.push(rowData[i]);
      }
    }
    return arr;
    }
  
    /**
    *  Get the current item moving the cursor to the next element
    */
    this.next = function () {
      if(!this.hasNext()) {
        this.nextPage();
      }
      this.active = this.copy(this.data[++cursor],{});
      return this.active;
    };
    
    /**
    *  Try to fetch the previous page
    */
    this.nextPage = function () {
      if(!this.hasNextPage()) {
        return;
      }
      if (this.apiVersion == 1) {
        this.offset = parseInt(this.offset) + parseInt(this.rowsPerPage); 
      } else {
        this.offset = parseInt(this.offset) + 1; 
      }
      this.fetch(_savedProps, { 
        success: function(data) {
          if(!data || data.length < parseInt(this.rowsPerPage)) {
            if (this.apiVersion == 1) {
              this.offset = parseInt(this.offset) - this.data.length; 
            }
          }
        }
      }, true);
    };
    
    /**
    *  Try to fetch the previous page
    */
    this.prevPage = function () {
      if(!this.append && !this.preppend) {
        this.offset = parseInt(this.offset) - this.data.length; 
        
        if(this.offset < 0) {
          this.offset = 0;
        } else if(this.offset >= 0) {
          this.fetch(_savedProps, {
            success: function(data) {
              if(!data || data.length === 0) {
                this.offset = 0; 
              }
            } 
          }, true); 
        }
      }
    };
    
    /**
    *  Check if has more pages
    */
    this.hasNextPage = function () {
      return hasMoreResults && (this.rowsPerPage != -1);
    };
    
    /**
    *  Check if has previews pages
    */
    this.hasPrevPage = function () {
      return this.offset > 0 && !this.append && !this.prepend;
    };      

    /**
    *  Get the previous item
    */
    this.previous = function () {
      if(!this.hasPrevious()) throw "Dataset Overflor Error";
      this.active = this.copy(this.data[--cursor],{});
      return this.active;
    };

    /**
    *  Moves the cursor to the specified item
    */
    this.goTo = function (rowId) {
      for(var i = 0; i < this.data.length; i++) {
        if(this.data[i][this.key] === rowId) {
          cursor = i;
          this.active = this.copy(this.data[cursor],{});
          return this.active;
        }
      }
    };

    /**
    *  Get the current cursor index
    */
    this.getCursor = function () {
      return cursor;
    };
    
    /**
    *  filter dataset by URL
    */
    this.filter = function ( url ) {
      var oldoffset = this.offset;
      this.offset = 0;
      this.fetch({ path: url }, { beforeFill: function(oldData) {
        this.cleanup(); 
      }, error : function(error) {
        this.offset = oldoffset;  
      }});
    };
    
    /**
     *  refresh dataset by URL and queryParams, 
     */
  this.refresh = function(query, url, minChar){
    this.cleanup();
    if(minChar === undefined){
      minChar = 0;
    }
    if(query.length >= minChar){
      this.filter(url+"/"+query);
    }
  };
    
    /**
     * Cleanup datasource  
     */
    this.cleanup = function () {
      this.offset = 0;
      this.data.length = 0;
      this.cursor = -1;
      this.active = {};
      hasMoreResults = false;
    }

    /**
    *  Get the current row data
    */
    this.current = function () {
      return this.active || this.data[0];
    };
    
    this.getLink = function(rel) {
      if (this.links) {
        for (var i=0;i<this.links.length;i++) {
          if (this.links[i].rel == rel) {
            return this.links[i].href;
          }
        }
      }
    }

    /**
    *  Fetch all data from the server
    */
    this.fetch = function (properties, callbacksObj, isNextOrPrev) {
      
      // Ignore any call if the datasource is busy (fetching another request)
      if(this.busy) return;
      
      if(!this.enabled) {
        this.cleanup();
        return;
      }
      
      var props = properties || {};
      var callbacks = callbacksObj || {};

      // Adjust property parameters and the endpoint url
      props.params = props.params || {};
      var resourceURL = this.entity + (props.path || "");
      
      // Set Limit and offset
      if(this.rowsPerPage > 0) {
        if (this.apiVersion == 1) {
          props.params.limit = this.rowsPerPage;
          props.params.offset = this.offset;
        } else {
          props.params.size = this.rowsPerPage;
          props.params.page = this.offset;
        }
      }

      // Stop auto post for awhile
      this.stopAutoPost();
              
      // Store the last configuration for late use
      _savedProps = props;
      
      // Make the datasource busy
      busy = true;
      
      // Get an ajax promise
      this.$promise = $http({
        method: "GET",
        url: resourceURL,
        params : props.params,
        headers: this.headers
      }).success(function(data, status, headers, config) {
            busy = false;
            sucessHandler(data)
      }.bind(this)).error(function(data, status, headers, config){
            busy = false;
            this.handleError(data);
            if(callbacks.error) callbacks.error.call(this, data);
      }.bind(this));
      
        // Success Handler
        var sucessHandler = function (data) {
          if(data) {
            
            if(Object.prototype.toString.call( data ) !== '[object Array]' ) {
              if (data && data.links && Object.prototype.toString.call(data.content) === '[object Array]') {
                this.links = data.links;
                data = data.content;
              } else {
                data = [data];
              }
            }
            
            // Call the before fill callback
            if(callbacks.beforeFill) callbacks.beforeFill.apply(this, this.data);

            if (isNextOrPrev) {
              // If prepend property was set. 
              // Add the new data before the old one
              if(this.prepend) Array.prototype.unshift.apply(this.data, data);  
  
              // If append property was set. 
              // Add the new data after the old one
              if(this.append) Array.prototype.push.apply(this.data, data);
  
              // When neither  nor preppend was set
              // Just replace the current data
              if(!this.prepend && !this.append) {
                Array.prototype.push.apply(this.data, data);
                if (this.data.length > 0) {
                  this.active = data[0];
                  cursor = 0;
                } else {
                  this.active = {};
                  cursor = -1;
                }
              }
              
              
            } else {
              this.cleanup();
              Array.prototype.push.apply(this.data, data);
              if (this.data.length > 0) {
                this.active = data[0];
                cursor = 0;
              }
            }
             
            if(callbacks.success) callbacks.success.call(this, data);
            hasMoreResults = (data.length >= this.rowsPerPage);
            if (this.apiVersion == 2) {
              hasMoreResults = this.getLink("next") != null;
            }
            /* 
            *  Register a watcher for data
            *  if the autopost property was set
            *  It means that any change on dataset items will
            *  generate a new request on the server
            */
            if(this.autoPost) {
              this.startAutoPost();
            }
            loaded= true;
            this.loadedFinish = true;
            this.handleAfterCallBack(this.onAfterFill);
          } 
        }.bind(this);
    };
    
    /**
    * Asynchronously notify observers 
    */
    this.notifyObservers = function () {
      for(var key in this.observers) {
        if(this.observers.hasOwnProperty(key)) {
          var dataset = this.observers[key];
          $timeout(function() {
            dataset.notify.call(dataset, this.active);
          }.bind(this),1);  
        }
      }
    };

    this.notify = function (activeRow) {
      if(activeRow) {
        // Parse the filter using regex
        // to identify {params}
        var filter = this.watchFilter;
        var pattern = /\{([A-z][A-z|0-9]*)\}/gim;

        // replace all params found by the 
        // respectiveValues in activeRow
        filter = filter.replace(pattern,function(a,b) {
          return activeRow.hasOwnProperty(b) ? activeRow[b] : "";
        });
        
        this.fetch({ 
          params : {
            q: filter
          }
        });
      }
    };
    
    this.addObserver = function(observer) {
      this.observers.push(observer);
    };

    /**
    * Clone a JSON Object
    */
    this.copy = function (from,to) {
      if(from === null || Object.prototype.toString.call(from) !== '[object Object]')
          return from;

      to = to || {}; 

      for(var key in from) {
          if(from.hasOwnProperty(key) && key.indexOf('$')==-1) {
              to[key] = this.copy(from[key]);
          }
      }
      return to;
    };
    
    /**
     * Used to monitore the this datasource data for change (insertion and deletion)
     */
    this.startAutoPost = function() {
      unregisterDataWatch = $rootScope.$watch(function() {
        return this.data;
      }.bind(this), function (newData, oldData) {
        
        if(!this.enabled) {
          unregisterDataWatch();
          return;
        }
        
        // Get the difference between both arrays
        var difSize = newData.length - oldData.length;
        
        if(difSize > 0) {
          // If the value is positive
          // Some item was added
          for(var i = 1; i <= difSize; i++) {
            // Make a new request
            this.insert(newData[newData.length - i], function() {
            });
          }
        } else if(difSize < 0) {
          // If it is negative
          // Some item was removed
          var removedItems = oldData.filter(function(oldItem){
              return newData.filter(function(newItem){
                  return objectIsEquals(oldItem, newItem);
              }).length == 0;
          });
          
          for(var i = 0; i < removedItems.length; i++) {
              this.remove(removedItems[i], function() {});
          }
      
        }
      }.bind(this));
    }
    
    /**
     * Unregister the data watcher
     */
    this.stopAutoPost = function() {
      // Unregister any defined watcher on data variable
      if(unregisterDataWatch) {
        unregisterDataWatch();
        unregisterDataWatch = undefined;
      }
    }
    
    this.init();
    
  };

  /**
    * Dataset Manager Methods
    */
  this.storeDataset = function (dataset) {
      this.datasets[dataset.name] = dataset;
  },

  /**
  * Initialize a new dataset
  */
  this.initDataset = function (props, scope) {
      var endpoint = (props.endpoint) ? props.endpoint : "";

      var dts = new DataSet(props.name, scope);
      dts.entity = props.entity;
      var defaultApiVersion = 1;
      if (app && app.config && app.config.datasourceApiVersion) {
        defaultApiVersion = app.config.datasourceApiVersion;
      }
      dts.apiVersion = props.apiVersion ? parseInt(props.apiVersion) : defaultApiVersion;
      dts.keys = (props.keys && props.keys.length > 0) ? props.keys.split(",") : [];
      dts.rowsPerPage = props.rowsPerPage ? props.rowsPerPage : 100; // Default 100 rows per page
      dts.append = props.append;
      dts.prepend = props.prepend;
      dts.endpoint = props.endpoint;
      dts.filterURL = props.filterURL;
      dts.autoPost = props.autoPost;
      dts.deleteMessage = props.deleteMessage;
      dts.enabled = props.enabled;
      dts.offset = (props.offset) ? props.offset : 0; // Default offset is 0
      dts.onError = props.onError;
      dts.defaultNotSpecifiedErrorMessage = props.defaultNotSpecifiedErrorMessage;

      dts.onAfterFill = props.onAfterFill;
      
      dts.onBeforeCreate = props.onBeforeCreate;
      dts.onAfterCreate  = props.onAfterCreate;
      dts.onBeforeUpdate = props.onBeforeUpdate;
      dts.onAfterUpdate  = props.onAfterUpdate;
      dts.onBeforeDelete = props.onBeforeDelete;
      dts.onAfterDelete  = props.onAfterDelete;
      
      dts.dependentBy = props.dependentBy;

      // Check for headers
      if(props.headers && props.headers.length > 0) {
        dts.headers = {};
        var headers = props.headers.trim().split(";");
        var header;
        for(var i = 0; i < headers.length; i++) {
           header = headers[i].split(":");
           if(header.length === 2) {
            dts.headers[header[0]] = header[1];  
           }
        }
      }
      
      this.storeDataset(dts);
      dts.allowFetch = true;
      
      if(dts.dependentBy){
        dts.allowFetch = (Object.prototype.toString.call(props.dependentBy) === "[object Object]")? dts.dependentBy.data.length>0 : false;
      }
      
      if(!props.lazy && dts.allowFetch && (Object.prototype.toString.call(props.watch) !== "[object String]") && !props.filterURL) {
        // Query string object
        var queryObj = {};

        // Fill the dataset
        dts.fetch({params: queryObj}, {success: function(data) {
          if (data && data.length > 0) {
            this.active = data[0];
            this.cursor = 0;
          }
        }});
      }
      
      if(props.lazy && props.autoPost) {
        dts.startAutoPost();
      }

      if(props.watch && Object.prototype.toString.call(props.watch) === "[object String]") {
        this.registerObserver(props.watch, dts);
        dts.watchFilter = props.watchFilter;
      }
      
      // Filter the dataset if the filter property was set
      if(props.filterURL && props.filterURL.length > 0) { 
        dts.filter(props.filterURL);
      }

      // Add this instance into the root scope
      // This will expose the dataset name as a
      // global variable
      $rootScope[dts.name] = dts;
      window[dts.name] = dts;
      
      return dts;
  };

  /**
  * Register a dataset as an observer to another one
  */
  this.registerObserver = function (targetName, dataset) {
    this.datasets[targetName].addObserver(dataset);
  };

  return this;
}])

/**
* Cronus Dataset Directive
*/
.directive('datasource',['DatasetManager','$timeout','$parse', 'Notification', '$translate', '$location', function (DatasetManager,$timeout,$parse,Notification,$translate,$location) {
  return {
    restrict: 'E',
    scope: true,
    template: '',
    link: function( scope, element, attrs ) {
      var init = function () {
      
      //Add in header the path from the request was executed
      var originPath = "origin-path:" + $location.path();
        if(attrs.headers === undefined || attrs.headers === null){
          attrs.headers = originPath;
        }else{
          attrs.headers = attrs.headers.concat(";", originPath);
        }
        
        var props = {
          name: attrs.name,
          entity: attrs.entity,
          apiVersion : attrs.apiVersion,
          enabled: (attrs.hasOwnProperty('enabled')) ? (attrs.enabled === "true") : true,
          keys: attrs.keys,
          endpoint: attrs.endpoint,
          lazy: (attrs.hasOwnProperty('lazy') && attrs.lazy === "") || attrs.lazy === "true",
          append: !attrs.hasOwnProperty('append') || attrs.append === "true",
          prepend: (attrs.hasOwnProperty('prepend') && attrs.prepend === "") || attrs.prepend === "true",
          watch: attrs.watch,
          rowsPerPage: attrs.rowsPerPage,
          offset: attrs.offset,
          filterURL : attrs.filter,
          watchFilter: attrs.watchFilter,
          deleteMessage: attrs.deleteMessage||attrs.deleteMessage === ""?attrs.deleteMessage:$translate.instant('General.RemoveData'),
          headers : attrs.headers,
          autoPost : (attrs.hasOwnProperty('autoPost') && attrs.autoPost === "") || attrs.autoPost === "true",
          onError : attrs.onError,
          onAfterFill : attrs.onAfterFill,
          onBeforeCreate : attrs.onBeforeCreate,
          onAfterCreate  : attrs.onAfterCreate,
          onBeforeUpdate : attrs.onBeforeUpdate,
          onAfterUpdate  : attrs.onAfterUpdate,
          onBeforeDelete : attrs.onBeforeDelete,
          onAfterDelete  : attrs.onAfterDelete,
          defaultNotSpecifiedErrorMessage: $translate.instant('General.ErrorNotSpecified'),
          dependentBy : attrs.dependentBy,
        }
        
        var firstLoad = {
          filter: true,
          entity: true,
          enabled: true
        }
        var datasource = DatasetManager.initDataset(props, scope);
        
        var timeoutPromise;
          
        attrs.$observe('filter', function( value ){
          if (!firstLoad.filter) {
              // Stop the pending timeout
              $timeout.cancel(timeoutPromise);
              
              // Start a timeout
              timeoutPromise = $timeout(function() {
                 datasource.filter(value);
              }, 200);
          } else {    
              $timeout(function() { firstLoad.filter = false; });
          }
        });
        
        attrs.$observe('enabled', function( value ){
          if (!firstLoad.enabled) {
                 datasource.enabled = (value === "true");
                 datasource.fetch({params:{}});
          } else {    
              $timeout(function() { firstLoad.enabled = false; });
          }
        });
        
        attrs.$observe('entity', function( value ){
              datasource.entity = value;
              if (!firstLoad.entity) {
                // Only fetch if it's not the first load
                datasource.fetch({params:{}});
              } else {
                $timeout(function() { firstLoad.entity = false; });
              }
        });
        
        attrs.$observe('dependentBy', function( value ){
          datasource.dependentBy = JSON.parse(value);
          if(datasource.dependentBy !== null && Object.prototype.toString.call(datasource.dependentBy) !== "[object String]" ){
            if(datasource.dependentBy.data.length > 0 || datasource.dependentBy.loadedFinish){
              datasource.enabled = true;
              datasource.fetch({params:{}});
            }
          }
        });
      };
      init();
    }
  };
}])

.directive('crnDatasource',['DatasetManager','$parse', function(DatasetManager,$parse) {
    return {
      restrict: 'A',
      scope: true,
      link: function(scope, element, attrs) {
          scope.data = DatasetManager.datasets;
          if(scope.data[attrs.crnDatasource]) {
            scope.datasource = scope.data[attrs.crnDatasource];
          } else {
            scope.datasource = {};
            scope.datasource.data = $parse(attrs.crnDatasource)(scope);
          }
      }
    };
}]);