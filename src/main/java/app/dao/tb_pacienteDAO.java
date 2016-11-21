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
@Repository("tb_pacienteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_pacienteDAO extends JpaRepository<tb_paciente, java.lang.String> {

  /**
   * Obtém a instância de tb_paciente utilizando os identificadores
   * 
   * @param id_paciente
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_paciente entity WHERE entity.id_paciente = :id_paciente")
  public tb_paciente findOne(@Param(value="id_paciente") java.lang.String id_paciente);

  /**
   * Remove a instância de tb_paciente utilizando os identificadores
   * 
   * @param id_paciente
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_paciente entity WHERE entity.id_paciente = :id_paciente")
  public void delete(@Param(value="id_paciente") java.lang.String id_paciente);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select t from tb_paciente t")
  public Page<tb_paciente> list ( Pageable pageable );
  







}