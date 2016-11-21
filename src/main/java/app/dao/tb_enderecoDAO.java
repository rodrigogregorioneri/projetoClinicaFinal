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
@Repository("tb_enderecoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_enderecoDAO extends JpaRepository<tb_endereco, java.lang.String> {

  /**
   * Obtém a instância de tb_endereco utilizando os identificadores
   * 
   * @param id_endereco
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_endereco entity WHERE entity.id_endereco = :id_endereco")
  public tb_endereco findOne(@Param(value="id_endereco") java.lang.String id_endereco);

  /**
   * Remove a instância de tb_endereco utilizando os identificadores
   * 
   * @param id_endereco
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_endereco entity WHERE entity.id_endereco = :id_endereco")
  public void delete(@Param(value="id_endereco") java.lang.String id_endereco);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from tb_endereco c")
  public Page<tb_endereco> list ( Pageable pageable );
  







}