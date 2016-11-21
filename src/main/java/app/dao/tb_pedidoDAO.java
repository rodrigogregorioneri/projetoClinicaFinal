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
@Repository("tb_pedidoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_pedidoDAO extends JpaRepository<tb_pedido, java.lang.String> {

  /**
   * Obtém a instância de tb_pedido utilizando os identificadores
   * 
   * @param id_pedido
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_pedido entity WHERE entity.id_pedido = :id_pedido")
  public tb_pedido findOne(@Param(value="id_pedido") java.lang.String id_pedido);

  /**
   * Remove a instância de tb_pedido utilizando os identificadores
   * 
   * @param id_pedido
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_pedido entity WHERE entity.id_pedido = :id_pedido")
  public void delete(@Param(value="id_pedido") java.lang.String id_pedido);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_pedido t")
  public Page<tb_pedido> list ( Pageable pageable );
  







}