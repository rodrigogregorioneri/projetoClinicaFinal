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
@Repository("tb_consultaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_consultaDAO extends JpaRepository<tb_consulta, java.lang.String> {

  /**
   * Obtém a instância de tb_consulta utilizando os identificadores
   * 
   * @param id_consulta
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_consulta entity WHERE entity.id_consulta = :id_consulta")
  public tb_consulta findOne(@Param(value="id_consulta") java.lang.String id_consulta);

  /**
   * Remove a instância de tb_consulta utilizando os identificadores
   * 
   * @param id_consulta
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_consulta entity WHERE entity.id_consulta = :id_consulta")
  public void delete(@Param(value="id_consulta") java.lang.String id_consulta);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_consulta t")
  public Page<tb_consulta> list ( Pageable pageable );
  







}