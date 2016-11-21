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
@Repository("tb_item_estoqueDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_item_estoqueDAO extends JpaRepository<tb_item_estoque, java.lang.String> {

  /**
   * Obtém a instância de tb_item_estoque utilizando os identificadores
   * 
   * @param id_item
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_item_estoque entity WHERE entity.id_item = :id_item")
  public tb_item_estoque findOne(@Param(value="id_item") java.lang.String id_item);

  /**
   * Remove a instância de tb_item_estoque utilizando os identificadores
   * 
   * @param id_item
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_item_estoque entity WHERE entity.id_item = :id_item")
  public void delete(@Param(value="id_item") java.lang.String id_item);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_item_estoque t")
  public Page<tb_item_estoque> list ( Pageable pageable );
  







}