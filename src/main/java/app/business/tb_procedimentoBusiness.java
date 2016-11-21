package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.*;
import app.entity.*;



/**
 * Classe que representa a camada de negócios de tb_procedimentoBusiness
 * 
 * @generated
 **/
@Service("tb_procedimentoBusiness")
public class tb_procedimentoBusiness {


    /**
     * Instância da classe tb_procedimentoDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_procedimentoDAO")
    protected tb_procedimentoDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public tb_procedimento post(final tb_procedimento entity) throws Exception {
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
    public tb_procedimento get(java.lang.String id_procedimento) throws Exception {
      // begin-user-code  
      // end-user-code        
       tb_procedimento result = repository.findOne(id_procedimento);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public tb_procedimento put(final tb_procedimento entity) throws Exception {
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
    public void delete( java.lang.String id_procedimento) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id_procedimento);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<tb_procedimento> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<tb_procedimento> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    



}