package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.*;
import app.entity.*;



/**
 * Classe que representa a camada de negócios de tb_especialidadeBusiness
 * 
 * @generated
 **/
@Service("tb_especialidadeBusiness")
public class tb_especialidadeBusiness {


    /**
     * Instância da classe tb_especialidadeDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("tb_especialidadeDAO")
    protected tb_especialidadeDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public tb_especialidade post(final tb_especialidade entity) throws Exception {
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
    public tb_especialidade get(java.lang.String id_esp) throws Exception {
      // begin-user-code  
      // end-user-code        
       tb_especialidade result = repository.findOne(id_esp);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public tb_especialidade put(final tb_especialidade entity) throws Exception {
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
    public void delete( java.lang.String id_esp) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id_esp);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<tb_especialidade> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<tb_especialidade> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    



}