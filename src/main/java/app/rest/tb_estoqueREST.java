package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;

import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;

import java.util.*;

import app.entity.*;
import app.business.*;



/**
 * Controller para expor serviços REST de tb_estoque
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/tb_estoque")
public class tb_estoqueREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_estoqueBusiness")
    private tb_estoqueBusiness tb_estoqueBusiness;


    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public tb_estoque post(@Validated @RequestBody final tb_estoque entity) throws Exception {
        return tb_estoqueBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public tb_estoque put(@Validated @RequestBody final tb_estoque entity) throws Exception {
        return tb_estoqueBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id_estoque}")
    public tb_estoque put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final tb_estoque entity) throws Exception {
        return tb_estoqueBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_estoque}")
    public void delete(@PathVariable("id_estoque") java.lang.String id_estoque) throws Exception {
        tb_estoqueBusiness.delete(id_estoque);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<tb_estoque>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(tb_estoqueBusiness.list(pageable   )), HttpStatus.OK);    
  }



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id_estoque}")
    public tb_estoque get(@PathVariable("id_estoque") java.lang.String id_estoque) throws Exception {
        return tb_estoqueBusiness.get(id_estoque);
    }
}
