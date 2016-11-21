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
 * Controller para expor serviços REST de tb_conta_pagar
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/tb_conta_pagar")
public class tb_conta_pagarREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_conta_pagarBusiness")
    private tb_conta_pagarBusiness tb_conta_pagarBusiness;


    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public tb_conta_pagar post(@Validated @RequestBody final tb_conta_pagar entity) throws Exception {
        return tb_conta_pagarBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public tb_conta_pagar put(@Validated @RequestBody final tb_conta_pagar entity) throws Exception {
        return tb_conta_pagarBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id_cnt_pag}")
    public tb_conta_pagar put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final tb_conta_pagar entity) throws Exception {
        return tb_conta_pagarBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_cnt_pag}")
    public void delete(@PathVariable("id_cnt_pag") java.lang.String id_cnt_pag) throws Exception {
        tb_conta_pagarBusiness.delete(id_cnt_pag);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<tb_conta_pagar>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(tb_conta_pagarBusiness.list(pageable   )), HttpStatus.OK);    
  }



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id_cnt_pag}")
    public tb_conta_pagar get(@PathVariable("id_cnt_pag") java.lang.String id_cnt_pag) throws Exception {
        return tb_conta_pagarBusiness.get(id_cnt_pag);
    }
}
