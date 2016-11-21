package app.dao;

import app.entity.*;



import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*;



/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("tb_especialidadeDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_especialidadeDAO extends JpaRepository<tb_especialidade, java.lang.String> {

  /**
   * Obtém a instância de tb_especialidade utilizando os identificadores
   * 
   * @param id_esp
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_especialidade entity WHERE entity.id_esp = :id_esp")
  public tb_especialidade findOne(@Param(value="id_esp") java.lang.String id_esp);

  /**
   * Remove a instância de tb_especialidade utilizando os identificadores
   * 
   * @param id_esp
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_especialidade entity WHERE entity.id_esp = :id_esp")
  public void delete(@Param(value="id_esp") java.lang.String id_esp);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_especialidade t")
  public Page<tb_especialidade> list ( Pageable pageable );
  







}