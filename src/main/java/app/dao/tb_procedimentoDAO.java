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
@Repository("tb_procedimentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_procedimentoDAO extends JpaRepository<tb_procedimento, java.lang.String> {

  /**
   * Obtém a instância de tb_procedimento utilizando os identificadores
   * 
   * @param id_procedimento
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_procedimento entity WHERE entity.id_procedimento = :id_procedimento")
  public tb_procedimento findOne(@Param(value="id_procedimento") java.lang.String id_procedimento);

  /**
   * Remove a instância de tb_procedimento utilizando os identificadores
   * 
   * @param id_procedimento
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_procedimento entity WHERE entity.id_procedimento = :id_procedimento")
  public void delete(@Param(value="id_procedimento") java.lang.String id_procedimento);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_procedimento t")
  public Page<tb_procedimento> list ( Pageable pageable );
  







}