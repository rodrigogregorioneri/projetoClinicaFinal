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
@Repository("tb_contatoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_contatoDAO extends JpaRepository<tb_contato, java.lang.String> {

  /**
   * Obtém a instância de tb_contato utilizando os identificadores
   * 
   * @param id_conato
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_contato entity WHERE entity.id_conato = :id_conato")
  public tb_contato findOne(@Param(value="id_conato") java.lang.String id_conato);

  /**
   * Remove a instância de tb_contato utilizando os identificadores
   * 
   * @param id_conato
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_contato entity WHERE entity.id_conato = :id_conato")
  public void delete(@Param(value="id_conato") java.lang.String id_conato);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_contato t")
  public Page<tb_contato> list ( Pageable pageable );
  







}