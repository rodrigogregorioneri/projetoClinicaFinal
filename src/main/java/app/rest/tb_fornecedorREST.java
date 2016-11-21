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
 * Controller para expor serviços REST de tb_fornecedor
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/tb_fornecedor")
public class tb_fornecedorREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_fornecedorBusiness")
    private tb_fornecedorBusiness tb_fornecedorBusiness;


    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public tb_fornecedor post(@Validated @RequestBody final tb_fornecedor entity) throws Exception {
        return tb_fornecedorBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public tb_fornecedor put(@Validated @RequestBody final tb_fornecedor entity) throws Exception {
        return tb_fornecedorBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id_fornecedor}")
    public tb_fornecedor put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final tb_fornecedor entity) throws Exception {
        return tb_fornecedorBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_fornecedor}")
    public void delete(@PathVariable("id_fornecedor") java.lang.String id_fornecedor) throws Exception {
        tb_fornecedorBusiness.delete(id_fornecedor);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<tb_fornecedor>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(tb_fornecedorBusiness.list(pageable   )), HttpStatus.OK);    
  }



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id_fornecedor}")
    public tb_fornecedor get(@PathVariable("id_fornecedor") java.lang.String id_fornecedor) throws Exception {
        return tb_fornecedorBusiness.get(id_fornecedor);
    }
}
