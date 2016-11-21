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
 * Controller para expor serviços REST de tb_est_entrada
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/tb_est_entrada")
public class tb_est_entradaREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_est_entradaBusiness")
    private tb_est_entradaBusiness tb_est_entradaBusiness;


    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public tb_est_entrada post(@Validated @RequestBody final tb_est_entrada entity) throws Exception {
        return tb_est_entradaBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public tb_est_entrada put(@Validated @RequestBody final tb_est_entrada entity) throws Exception {
        return tb_est_entradaBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id_est_ent}")
    public tb_est_entrada put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final tb_est_entrada entity) throws Exception {
        return tb_est_entradaBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_est_ent}")
    public void delete(@PathVariable("id_est_ent") java.lang.String id_est_ent) throws Exception {
        tb_est_entradaBusiness.delete(id_est_ent);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<tb_est_entrada>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(tb_est_entradaBusiness.list(pageable   )), HttpStatus.OK);    
  }



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id_est_ent}")
    public tb_est_entrada get(@PathVariable("id_est_ent") java.lang.String id_est_ent) throws Exception {
        return tb_est_entradaBusiness.get(id_est_ent);
    }
}
