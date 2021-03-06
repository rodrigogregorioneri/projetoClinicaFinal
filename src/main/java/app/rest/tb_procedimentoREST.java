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
 * Controller para expor serviços REST de tb_procedimento
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/tb_procedimento")
public class tb_procedimentoREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_procedimentoBusiness")
    private tb_procedimentoBusiness tb_procedimentoBusiness;


    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public tb_procedimento post(@Validated @RequestBody final tb_procedimento entity) throws Exception {
        return tb_procedimentoBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public tb_procedimento put(@Validated @RequestBody final tb_procedimento entity) throws Exception {
        return tb_procedimentoBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id_procedimento}")
    public tb_procedimento put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final tb_procedimento entity) throws Exception {
        return tb_procedimentoBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_procedimento}")
    public void delete(@PathVariable("id_procedimento") java.lang.String id_procedimento) throws Exception {
        tb_procedimentoBusiness.delete(id_procedimento);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<tb_procedimento>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(tb_procedimentoBusiness.list(pageable   )), HttpStatus.OK);    
  }



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id_procedimento}")
    public tb_procedimento get(@PathVariable("id_procedimento") java.lang.String id_procedimento) throws Exception {
        return tb_procedimentoBusiness.get(id_procedimento);
    }
}
