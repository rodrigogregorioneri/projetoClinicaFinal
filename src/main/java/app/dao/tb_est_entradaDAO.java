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
@Repository("tb_est_entradaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_est_entradaDAO extends JpaRepository<tb_est_entrada, java.lang.String> {

  /**
   * Obtém a instância de tb_est_entrada utilizando os identificadores
   * 
   * @param id_est_ent
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_est_entrada entity WHERE entity.id_est_ent = :id_est_ent")
  public tb_est_entrada findOne(@Param(value="id_est_ent") java.lang.String id_est_ent);

  /**
   * Remove a instância de tb_est_entrada utilizando os identificadores
   * 
   * @param id_est_ent
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_est_entrada entity WHERE entity.id_est_ent = :id_est_ent")
  public void delete(@Param(value="id_est_ent") java.lang.String id_est_ent);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_est_entrada t")
  public Page<tb_est_entrada> list ( Pageable pageable );
  







}