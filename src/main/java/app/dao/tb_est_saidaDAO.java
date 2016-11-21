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
@Repository("tb_est_saidaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_est_saidaDAO extends JpaRepository<tb_est_saida, java.lang.String> {

  /**
   * Obtém a instância de tb_est_saida utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_est_saida entity WHERE entity.id = :id")
  public tb_est_saida findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de tb_est_saida utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_est_saida entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_est_saida t")
  public Page<tb_est_saida> list ( Pageable pageable );
  







}