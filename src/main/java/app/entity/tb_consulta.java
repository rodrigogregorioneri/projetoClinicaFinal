package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_CONSULTA
 * @generated
 */
@Entity
@Table(name = "\"TB_CONSULTA\""


)
@XmlRootElement
public class tb_consulta implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -548665173l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_consulta", insertable=true, updatable=true)
  private java.lang.String id_consulta = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_consulta", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_consulta;
  
  /**
   * @generated
   */
  @Column(name = "nm_acompanhante", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String nm_acompanhante;
  
  /**
   * @generated
   */
  @Column(name = "nr_rg_acomp", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String nr_rg_acomp;
  
  /**
   * @generated
   */
  @Column(name = "ds_consulta", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String ds_consulta;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_paciente", referencedColumnName = "id_paciente", insertable=true, updatable=true)
  private tb_paciente tb_paciente;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_procedimento", referencedColumnName = "id_procedimento", insertable=true, updatable=true)
  private tb_procedimento tb_procedimento;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_funcionario", referencedColumnName = "id_funcionario", insertable=true, updatable=true)
  private tb_funcionario tb_funcionario;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_consulta(){
  }

  
  /**
   * Obtém id_consulta
   * @param id_consulta id_consulta
   * return id_consulta
   * @generated
   */
  public java.lang.String getId_consulta(){
    return this.id_consulta;
  }
  
  /**
   * Define id_consulta
   * @param id_consulta id_consulta
   * @generated
   */
  public tb_consulta setId_consulta(java.lang.String id_consulta){
    this.id_consulta = id_consulta;
    return this;
  }
  
  /**
   * Obtém dt_consulta
   * @param dt_consulta dt_consulta
   * return dt_consulta
   * @generated
   */
  public java.util.Date getDt_consulta(){
    return this.dt_consulta;
  }
  
  /**
   * Define dt_consulta
   * @param dt_consulta dt_consulta
   * @generated
   */
  public tb_consulta setDt_consulta(java.util.Date dt_consulta){
    this.dt_consulta = dt_consulta;
    return this;
  }
  
  /**
   * Obtém nm_acompanhante
   * @param nm_acompanhante nm_acompanhante
   * return nm_acompanhante
   * @generated
   */
  public java.lang.String getNm_acompanhante(){
    return this.nm_acompanhante;
  }
  
  /**
   * Define nm_acompanhante
   * @param nm_acompanhante nm_acompanhante
   * @generated
   */
  public tb_consulta setNm_acompanhante(java.lang.String nm_acompanhante){
    this.nm_acompanhante = nm_acompanhante;
    return this;
  }
  
  /**
   * Obtém nr_rg_acomp
   * @param nr_rg_acomp nr_rg_acomp
   * return nr_rg_acomp
   * @generated
   */
  public java.lang.String getNr_rg_acomp(){
    return this.nr_rg_acomp;
  }
  
  /**
   * Define nr_rg_acomp
   * @param nr_rg_acomp nr_rg_acomp
   * @generated
   */
  public tb_consulta setNr_rg_acomp(java.lang.String nr_rg_acomp){
    this.nr_rg_acomp = nr_rg_acomp;
    return this;
  }
  
  /**
   * Obtém ds_consulta
   * @param ds_consulta ds_consulta
   * return ds_consulta
   * @generated
   */
  public java.lang.String getDs_consulta(){
    return this.ds_consulta;
  }
  
  /**
   * Define ds_consulta
   * @param ds_consulta ds_consulta
   * @generated
   */
  public tb_consulta setDs_consulta(java.lang.String ds_consulta){
    this.ds_consulta = ds_consulta;
    return this;
  }
  
  /**
   * Obtém tb_paciente
   * @param tb_paciente tb_paciente
   * return tb_paciente
   * @generated
   */
  public tb_paciente getTb_paciente(){
    return this.tb_paciente;
  }
  
  /**
   * Define tb_paciente
   * @param tb_paciente tb_paciente
   * @generated
   */
  public tb_consulta setTb_paciente(tb_paciente tb_paciente){
    this.tb_paciente = tb_paciente;
    return this;
  }
  
  /**
   * Obtém tb_procedimento
   * @param tb_procedimento tb_procedimento
   * return tb_procedimento
   * @generated
   */
  public tb_procedimento getTb_procedimento(){
    return this.tb_procedimento;
  }
  
  /**
   * Define tb_procedimento
   * @param tb_procedimento tb_procedimento
   * @generated
   */
  public tb_consulta setTb_procedimento(tb_procedimento tb_procedimento){
    this.tb_procedimento = tb_procedimento;
    return this;
  }
  
  /**
   * Obtém tb_funcionario
   * @param tb_funcionario tb_funcionario
   * return tb_funcionario
   * @generated
   */
  public tb_funcionario getTb_funcionario(){
    return this.tb_funcionario;
  }
  
  /**
   * Define tb_funcionario
   * @param tb_funcionario tb_funcionario
   * @generated
   */
  public tb_consulta setTb_funcionario(tb_funcionario tb_funcionario){
    this.tb_funcionario = tb_funcionario;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_consulta == null) ? 0 : id_consulta.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof tb_consulta))
        return false;
      
      tb_consulta other = (tb_consulta)obj;
      
    if(this.id_consulta == null && other.id_consulta != null)
        return false;
      else if(!this.id_consulta.equals(other.id_consulta))
        return false;
  

      return true;
      
  }
}
