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
@Repository("tb_fornecedorDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_fornecedorDAO extends JpaRepository<tb_fornecedor, java.lang.String> {

  /**
   * Obtém a instância de tb_fornecedor utilizando os identificadores
   * 
   * @param id_fornecedor
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_fornecedor entity WHERE entity.id_fornecedor = :id_fornecedor")
  public tb_fornecedor findOne(@Param(value="id_fornecedor") java.lang.String id_fornecedor);

  /**
   * Remove a instância de tb_fornecedor utilizando os identificadores
   * 
   * @param id_fornecedor
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_fornecedor entity WHERE entity.id_fornecedor = :id_fornecedor")
  public void delete(@Param(value="id_fornecedor") java.lang.String id_fornecedor);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_fornecedor t")
  public Page<tb_fornecedor> list ( Pageable pageable );
  







}