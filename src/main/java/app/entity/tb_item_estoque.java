package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_ITEM_ESTOQUE
 * @generated
 */
@Entity
@Table(name = "\"TB_ITEM_ESTOQUE\""


)
@XmlRootElement
public class tb_item_estoque implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 147236738l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_item", insertable=true, updatable=true)
  private java.lang.String id_item = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nm_item", nullable = false, unique = false, length=45, insertable=true, updatable=true)
  private java.lang.String nm_item;
  
  /**
   * @generated
   */
  @Column(name = "ds_item", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String ds_item;
  
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_validade", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_validade;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_item_estoque(){
  }

  
  /**
   * Obtém id_item
   * @param id_item id_item
   * return id_item
   * @generated
   */
  public java.lang.String getId_item(){
    return this.id_item;
  }
  
  /**
   * Define id_item
   * @param id_item id_item
   * @generated
   */
  public tb_item_estoque setId_item(java.lang.String id_item){
    this.id_item = id_item;
    return this;
  }
  
  /**
   * Obtém nm_item
   * @param nm_item nm_item
   * return nm_item
   * @generated
   */
  public java.lang.String getNm_item(){
    return this.nm_item;
  }
  
  /**
   * Define nm_item
   * @param nm_item nm_item
   * @generated
   */
  public tb_item_estoque setNm_item(java.lang.String nm_item){
    this.nm_item = nm_item;
    return this;
  }
  
  /**
   * Obtém ds_item
   * @param ds_item ds_item
   * return ds_item
   * @generated
   */
  public java.lang.String getDs_item(){
    return this.ds_item;
  }
  
  /**
   * Define ds_item
   * @param ds_item ds_item
   * @generated
   */
  public tb_item_estoque setDs_item(java.lang.String ds_item){
    this.ds_item = ds_item;
    return this;
  }
  
  /**
   * Obtém dt_validade
   * @param dt_validade dt_validade
   * return dt_validade
   * @generated
   */
  public java.util.Date getDt_validade(){
    return this.dt_validade;
  }
  
  /**
   * Define dt_validade
   * @param dt_validade dt_validade
   * @generated
   */
  public tb_item_estoque setDt_validade(java.util.Date dt_validade){
    this.dt_validade = dt_validade;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_item == null) ? 0 : id_item.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof tb_item_estoque))
        return false;
      
      tb_item_estoque other = (tb_item_estoque)obj;
      
    if(this.id_item == null && other.id_item != null)
        return false;
      else if(!this.id_item.equals(other.id_item))
        return false;
  

      return true;
      
  }
}
