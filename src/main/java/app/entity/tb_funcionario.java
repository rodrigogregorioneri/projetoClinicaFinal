package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_FUNCIONARIO
 * @generated
 */
@Entity
@Table(name = "\"TB_FUNCIONARIO\""


)
@XmlRootElement
public class tb_funcionario implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -774611590l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_funcionario", insertable=true, updatable=true)
  private java.lang.String id_funcionario = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nm_funcionario", nullable = false, unique = false, length=30, insertable=true, updatable=true)
  private java.lang.String nm_funcionario;
  
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
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_admissao", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_admissao;
  
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_demissao", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_demissao;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_endereco", referencedColumnName = "id_endereco", insertable=true, updatable=true)
  private tb_endereco tb_endereco;
  
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
  @JoinColumn(name="fk_tb_especialidade", referencedColumnName = "id_esp", insertable=true, updatable=true)
  private tb_especialidade tb_especialidade;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_funcionario(){
  }

  
  /**
   * Obtém id_funcionario
   * @param id_funcionario id_funcionario
   * return id_funcionario
   * @generated
   */
  public java.lang.String getId_funcionario(){
    return this.id_funcionario;
  }
  
  /**
   * Define id_funcionario
   * @param id_funcionario id_funcionario
   * @generated
   */
  public tb_funcionario setId_funcionario(java.lang.String id_funcionario){
    this.id_funcionario = id_funcionario;
    return this;
  }
  
  /**
   * Obtém nm_funcionario
   * @param nm_funcionario nm_funcionario
   * return nm_funcionario
   * @generated
   */
  public java.lang.String getNm_funcionario(){
    return this.nm_funcionario;
  }
  
  /**
   * Define nm_funcionario
   * @param nm_funcionario nm_funcionario
   * @generated
   */
  public tb_funcionario setNm_funcionario(java.lang.String nm_funcionario){
    this.nm_funcionario = nm_funcionario;
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
  public tb_funcionario setNm_sobrenome(java.lang.String nm_sobrenome){
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
  public tb_funcionario setDt_nascimento(java.util.Date dt_nascimento){
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
  public tb_funcionario setDs_sexo(java.lang.String ds_sexo){
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
  public tb_funcionario setNr_rg(java.lang.String nr_rg){
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
  public tb_funcionario setNr_cpf(java.lang.Integer nr_cpf){
    this.nr_cpf = nr_cpf;
    return this;
  }
  
  /**
   * Obtém dt_admissao
   * @param dt_admissao dt_admissao
   * return dt_admissao
   * @generated
   */
  public java.util.Date getDt_admissao(){
    return this.dt_admissao;
  }
  
  /**
   * Define dt_admissao
   * @param dt_admissao dt_admissao
   * @generated
   */
  public tb_funcionario setDt_admissao(java.util.Date dt_admissao){
    this.dt_admissao = dt_admissao;
    return this;
  }
  
  /**
   * Obtém dt_demissao
   * @param dt_demissao dt_demissao
   * return dt_demissao
   * @generated
   */
  public java.util.Date getDt_demissao(){
    return this.dt_demissao;
  }
  
  /**
   * Define dt_demissao
   * @param dt_demissao dt_demissao
   * @generated
   */
  public tb_funcionario setDt_demissao(java.util.Date dt_demissao){
    this.dt_demissao = dt_demissao;
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
  public tb_funcionario setTb_endereco(tb_endereco tb_endereco){
    this.tb_endereco = tb_endereco;
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
  public tb_funcionario setTb_contato(tb_contato tb_contato){
    this.tb_contato = tb_contato;
    return this;
  }
  
  /**
   * Obtém tb_especialidade
   * @param tb_especialidade tb_especialidade
   * return tb_especialidade
   * @generated
   */
  public tb_especialidade getTb_especialidade(){
    return this.tb_especialidade;
  }
  
  /**
   * Define tb_especialidade
   * @param tb_especialidade tb_especialidade
   * @generated
   */
  public tb_funcionario setTb_especialidade(tb_especialidade tb_especialidade){
    this.tb_especialidade = tb_especialidade;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_funcionario == null) ? 0 : id_funcionario.hashCode());

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
      
      if(!(obj instanceof tb_funcionario))
        return false;
      
      tb_funcionario other = (tb_funcionario)obj;
      
    if(this.id_funcionario == null && other.id_funcionario != null)
        return false;
      else if(!this.id_funcionario.equals(other.id_funcionario))
        return false;
  

      return true;
      
  }
}
