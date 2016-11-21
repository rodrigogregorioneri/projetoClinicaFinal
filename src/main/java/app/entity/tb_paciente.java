package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_PACIENTE
 * @generated
 */
@Entity
@Table(name = "\"TB_PACIENTE\""


)
@XmlRootElement
public class tb_paciente implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 768252468l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_paciente", insertable=true, updatable=true)
  private java.lang.String id_paciente = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nm_paciente", nullable = false, unique = false, length=30, insertable=true, updatable=true)
  private java.lang.String nm_paciente;
  
  /**
   * @generated
   */
  @Column(name = "nm_sobrenome", nullable = false, unique = false, length=40, insertable=true, updatable=true)
  private java.lang.String nm_sobrenome;
  
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_nascimento", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_nascimento;
  
  /**
   * @generated
   */
  @Column(name = "ds_sexo", nullable = false, unique = false, length=9, insertable=true, updatable=true)
  private java.lang.String ds_sexo;
  
  /**
   * @generated
   */
  @Column(name = "nr_rg", nullable = false, unique = false, length=9, insertable=true, updatable=true)
  private java.lang.String nr_rg;
  
  /**
   * @generated
   */
  @Column(name = "nr_cpf", nullable = false, unique = false, length=11, insertable=true, updatable=true)
  private java.lang.Integer nr_cpf;
  
  /**
   * @generated
   */
  @Column(name = "nr_mtr_conv", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String nr_mtr_conv;
  
  /**
   * @generated
   */
  @Column(name = "ds_paciente", nullable = false, unique = false, length=150, insertable=true, updatable=true)
  private java.lang.String ds_paciente;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_convenio", referencedColumnName = "id_convenio", insertable=true, updatable=true)
  private tb_convenio tb_convenio;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_contato", referencedColumnName = "id_conato", insertable=true, updatable=true)
  private tb_contato tb_contato;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_endereco", referencedColumnName = "id_endereco", insertable=true, updatable=true)
  private tb_endereco tb_endereco;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_paciente(){
  }

  
  /**
   * Obtém id_paciente
   * @param id_paciente id_paciente
   * return id_paciente
   * @generated
   */
  public java.lang.String getId_paciente(){
    return this.id_paciente;
  }
  
  /**
   * Define id_paciente
   * @param id_paciente id_paciente
   * @generated
   */
  public tb_paciente setId_paciente(java.lang.String id_paciente){
    this.id_paciente = id_paciente;
    return this;
  }
  
  /**
   * Obtém nm_paciente
   * @param nm_paciente nm_paciente
   * return nm_paciente
   * @generated
   */
  public java.lang.String getNm_paciente(){
    return this.nm_paciente;
  }
  
  /**
   * Define nm_paciente
   * @param nm_paciente nm_paciente
   * @generated
   */
  public tb_paciente setNm_paciente(java.lang.String nm_paciente){
    this.nm_paciente = nm_paciente;
    return this;
  }
  
  /**
   * Obtém nm_sobrenome
   * @param nm_sobrenome nm_sobrenome
   * return nm_sobrenome
   * @generated
   */
  public java.lang.String getNm_sobrenome(){
    return this.nm_sobrenome;
  }
  
  /**
   * Define nm_sobrenome
   * @param nm_sobrenome nm_sobrenome
   * @generated
   */
  public tb_paciente setNm_sobrenome(java.lang.String nm_sobrenome){
    this.nm_sobrenome = nm_sobrenome;
    return this;
  }
  
  /**
   * Obtém dt_nascimento
   * @param dt_nascimento dt_nascimento
   * return dt_nascimento
   * @generated
   */
  public java.util.Date getDt_nascimento(){
    return this.dt_nascimento;
  }
  
  /**
   * Define dt_nascimento
   * @param dt_nascimento dt_nascimento
   * @generated
   */
  public tb_paciente setDt_nascimento(java.util.Date dt_nascimento){
    this.dt_nascimento = dt_nascimento;
    return this;
  }
  
  /**
   * Obtém ds_sexo
   * @param ds_sexo ds_sexo
   * return ds_sexo
   * @generated
   */
  public java.lang.String getDs_sexo(){
    return this.ds_sexo;
  }
  
  /**
   * Define ds_sexo
   * @param ds_sexo ds_sexo
   * @generated
   */
  public tb_paciente setDs_sexo(java.lang.String ds_sexo){
    this.ds_sexo = ds_sexo;
    return this;
  }
  
  /**
   * Obtém nr_rg
   * @param nr_rg nr_rg
   * return nr_rg
   * @generated
   */
  public java.lang.String getNr_rg(){
    return this.nr_rg;
  }
  
  /**
   * Define nr_rg
   * @param nr_rg nr_rg
   * @generated
   */
  public tb_paciente setNr_rg(java.lang.String nr_rg){
    this.nr_rg = nr_rg;
    return this;
  }
  
  /**
   * Obtém nr_cpf
   * @param nr_cpf nr_cpf
   * return nr_cpf
   * @generated
   */
  public java.lang.Integer getNr_cpf(){
    return this.nr_cpf;
  }
  
  /**
   * Define nr_cpf
   * @param nr_cpf nr_cpf
   * @generated
   */
  public tb_paciente setNr_cpf(java.lang.Integer nr_cpf){
    this.nr_cpf = nr_cpf;
    return this;
  }
  
  /**
   * Obtém nr_mtr_conv
   * @param nr_mtr_conv nr_mtr_conv
   * return nr_mtr_conv
   * @generated
   */
  public java.lang.String getNr_mtr_conv(){
    return this.nr_mtr_conv;
  }
  
  /**
   * Define nr_mtr_conv
   * @param nr_mtr_conv nr_mtr_conv
   * @generated
   */
  public tb_paciente setNr_mtr_conv(java.lang.String nr_mtr_conv){
    this.nr_mtr_conv = nr_mtr_conv;
    return this;
  }
  
  /**
   * Obtém ds_paciente
   * @param ds_paciente ds_paciente
   * return ds_paciente
   * @generated
   */
  public java.lang.String getDs_paciente(){
    return this.ds_paciente;
  }
  
  /**
   * Define ds_paciente
   * @param ds_paciente ds_paciente
   * @generated
   */
  public tb_paciente setDs_paciente(java.lang.String ds_paciente){
    this.ds_paciente = ds_paciente;
    return this;
  }
  
  /**
   * Obtém tb_convenio
   * @param tb_convenio tb_convenio
   * return tb_convenio
   * @generated
   */
  public tb_convenio getTb_convenio(){
    return this.tb_convenio;
  }
  
  /**
   * Define tb_convenio
   * @param tb_convenio tb_convenio
   * @generated
   */
  public tb_paciente setTb_convenio(tb_convenio tb_convenio){
    this.tb_convenio = tb_convenio;
    return this;
  }
  
  /**
   * Obtém tb_contato
   * @param tb_contato tb_contato
   * return tb_contato
   * @generated
   */
  public tb_contato getTb_contato(){
    return this.tb_contato;
  }
  
  /**
   * Define tb_contato
   * @param tb_contato tb_contato
   * @generated
   */
  public tb_paciente setTb_contato(tb_contato tb_contato){
    this.tb_contato = tb_contato;
    return this;
  }
  
  /**
   * Obtém tb_endereco
   * @param tb_endereco tb_endereco
   * return tb_endereco
   * @generated
   */
  public tb_endereco getTb_endereco(){
    return this.tb_endereco;
  }
  
  /**
   * Define tb_endereco
   * @param tb_endereco tb_endereco
   * @generated
   */
  public tb_paciente setTb_endereco(tb_endereco tb_endereco){
    this.tb_endereco = tb_endereco;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_paciente == null) ? 0 : id_paciente.hashCode());

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
      
      if(!(obj instanceof tb_paciente))
        return false;
      
      tb_paciente other = (tb_paciente)obj;
      
    if(this.id_paciente == null && other.id_paciente != null)
        return false;
      else if(!this.id_paciente.equals(other.id_paciente))
        return false;
  

      return true;
      
  }
}
