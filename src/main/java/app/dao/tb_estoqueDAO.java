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
@Repository("tb_estoqueDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_estoqueDAO extends JpaRepository<tb_estoque, java.lang.String> {

  /**
   * Obtém a instância de tb_estoque utilizando os identificadores
   * 
   * @param id_estoque
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_estoque entity WHERE entity.id_estoque = :id_estoque")
  public tb_estoque findOne(@Param(value="id_estoque") java.lang.String id_estoque);

  /**
   * Remove a instância de tb_estoque utilizando os identificadores
   * 
   * @param id_estoque
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_estoque entity WHERE entity.id_estoque = :id_estoque")
  public void delete(@Param(value="id_estoque") java.lang.String id_estoque);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from tb_estoque c")
  public Page<tb_estoque> list ( Pageable pageable );
  







}