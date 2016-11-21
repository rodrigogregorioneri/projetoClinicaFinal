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
@Repository("tb_conta_pagarDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_conta_pagarDAO extends JpaRepository<tb_conta_pagar, java.lang.String> {

  /**
   * Obtém a instância de tb_conta_pagar utilizando os identificadores
   * 
   * @param id_cnt_pag
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_conta_pagar entity WHERE entity.id_cnt_pag = :id_cnt_pag")
  public tb_conta_pagar findOne(@Param(value="id_cnt_pag") java.lang.String id_cnt_pag);

  /**
   * Remove a instância de tb_conta_pagar utilizando os identificadores
   * 
   * @param id_cnt_pag
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_conta_pagar entity WHERE entity.id_cnt_pag = :id_cnt_pag")
  public void delete(@Param(value="id_cnt_pag") java.lang.String id_cnt_pag);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_conta_pagar t")
  public Page<tb_conta_pagar> list ( Pageable pageable );
  







}