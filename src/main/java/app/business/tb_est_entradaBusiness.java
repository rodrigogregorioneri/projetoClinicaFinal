package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.*;
import app.entity.*;



/**
 * Classe que representa a camada de negócios de tb_est_entradaBusiness
 * 
 * @generated
 **/
@Service("tb_est_entradaBusiness")
public class tb_est_entradaBusiness {


    /**
     * Instância da classe tb_est_entradaDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_est_entradaDAO")
    protected tb_est_entradaDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public tb_est_entrada post(final tb_est_entrada entity) throws Exception {
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
    public tb_est_entrada get(java.lang.String id_est_ent) throws Exception {
      // begin-user-code  
      // end-user-code        
       tb_est_entrada result = repository.findOne(id_est_ent);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public tb_est_entrada put(final tb_est_entrada entity) throws Exception {
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
    public void delete( java.lang.String id_est_ent) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id_est_ent);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<tb_est_entrada> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<tb_est_entrada> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    



}