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
@Repository("tb_funcionarioDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_funcionarioDAO extends JpaRepository<tb_funcionario, java.lang.String> {

  /**
   * Obtém a instância de tb_funcionario utilizando os identificadores
   * 
   * @param id_funcionario
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_funcionario entity WHERE entity.id_funcionario = :id_funcionario")
  public tb_funcionario findOne(@Param(value="id_funcionario") java.lang.String id_funcionario);

  /**
   * Remove a instância de tb_funcionario utilizando os identificadores
   * 
   * @param id_funcionario
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_funcionario entity WHERE entity.id_funcionario = :id_funcionario")
  public void delete(@Param(value="id_funcionario") java.lang.String id_funcionario);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_funcionario t")
  public Page<tb_funcionario> list ( Pageable pageable );
  







}