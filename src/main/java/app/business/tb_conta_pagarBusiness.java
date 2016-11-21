package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.*;
import app.entity.*;



/**
 * Classe que representa a camada de negócios de tb_conta_pagarBusiness
 * 
 * @generated
 **/
@Service("tb_conta_pagarBusiness")
public class tb_conta_pagarBusiness {


    /**
     * Instância da classe tb_conta_pagarDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_conta_pagarDAO")
    protected tb_conta_pagarDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public tb_conta_pagar post(final tb_conta_pagar entity) throws Exception {
      // begin-user-code  
      // end-user-code  
        repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public tb_conta_pagar get(java.lang.String id_cnt_pag) throws Exception {
      // begin-user-code  
      // end-user-code        
       tb_conta_pagar result = repository.findOne(id_cnt_pag);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public tb_conta_pagar put(final tb_conta_pagar entity) throws Exception {
      // begin-user-code  
      // end-user-code
        repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id_cnt_pag) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id_cnt_pag);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<tb_conta_pagar> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<tb_conta_pagar> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    



}