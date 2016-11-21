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
 * Controller para expor serviços REST de tb_contato
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/tb_contato")
public class tb_contatoREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_contatoBusiness")
    private tb_contatoBusiness tb_contatoBusiness;


    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public tb_contato post(@Validated @RequestBody final tb_contato entity) throws Exception {
        return tb_contatoBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public tb_contato put(@Validated @RequestBody final tb_contato entity) throws Exception {
        return tb_contatoBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id_conato}")
    public tb_contato put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final tb_contato entity) throws Exception {
        return tb_contatoBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_conato}")
    public void delete(@PathVariable("id_conato") java.lang.String id_conato) throws Exception {
        tb_contatoBusiness.delete(id_conato);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<tb_contato>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(tb_contatoBusiness.list(pageable   )), HttpStatus.OK);    
  }



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id_conato}")
    public tb_contato get(@PathVariable("id_conato") java.lang.String id_conato) throws Exception {
        return tb_contatoBusiness.get(id_conato);
    }
}
