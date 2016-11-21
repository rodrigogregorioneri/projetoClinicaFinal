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
 * Controller para expor serviços REST de tb_conta_receber
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/tb_conta_receber")
public class tb_conta_receberREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_conta_receberBusiness")
    private tb_conta_receberBusiness tb_conta_receberBusiness;


    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public tb_conta_receber post(@Validated @RequestBody final tb_conta_receber entity) throws Exception {
        return tb_conta_receberBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public tb_conta_receber put(@Validated @RequestBody final tb_conta_receber entity) throws Exception {
        return tb_conta_receberBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id_cnt_rec}")
    public tb_conta_receber put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final tb_conta_receber entity) throws Exception {
        return tb_conta_receberBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_cnt_rec}")
    public void delete(@PathVariable("id_cnt_rec") java.lang.String id_cnt_rec) throws Exception {
        tb_conta_receberBusiness.delete(id_cnt_rec);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<tb_conta_receber>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(tb_conta_receberBusiness.list(pageable   )), HttpStatus.OK);    
  }



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id_cnt_rec}")
    public tb_conta_receber get(@PathVariable("id_cnt_rec") java.lang.String id_cnt_rec) throws Exception {
        return tb_conta_receberBusiness.get(id_cnt_rec);
    }
}
