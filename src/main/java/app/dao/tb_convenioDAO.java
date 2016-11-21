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
@Repository("tb_convenioDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface tb_convenioDAO extends JpaRepository<tb_convenio, java.lang.String> {

  /**
   * Obtém a instância de tb_convenio utilizando os identificadores
   * 
   * @param id_convenio
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM tb_convenio entity WHERE entity.id_convenio = :id_convenio")
  public tb_convenio findOne(@Param(value="id_convenio") java.lang.String id_convenio);

  /**
   * Remove a instância de tb_convenio utilizando os identificadores
   * 
   * @param id_convenio
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM tb_convenio entity WHERE entity.id_convenio = :id_convenio")
  public void delete(@Param(value="id_convenio") java.lang.String id_convenio);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from tb_convenio c")
  public Page<tb_convenio> list ( Pageable pageable );
  







}