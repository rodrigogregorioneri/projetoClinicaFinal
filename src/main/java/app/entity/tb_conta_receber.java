package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_CONTA_RECEBER
 * @generated
 */
@Entity
@Table(name = "\"TB_CONTA_RECEBER\""


)
@XmlRootElement
public class tb_conta_receber implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1499241045l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_cnt_rec", insertable=true, updatable=true)
  private java.lang.String id_cnt_rec = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nr_doc", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  private java.lang.String nr_doc;
  
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_emissao", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_emissao;
  
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_vencimento", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_vencimento;
  
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_recebimento", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_recebimento;
  
  /**
   * @generated
   */
  @Column(name = "vl_conta", nullable = false, unique = false, length=11, insertable=true, updatable=true)
  private java.lang.Double vl_conta;
  
  /**
   * @generated
   */
  @Column(name = "vl_juros", nullable = false, unique = false, length=11, insertable=true, updatable=true)
  private java.lang.Double vl_juros;
  
  /**
   * @generated
   */
  @Column(name = "ds_status", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String ds_status;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_paciente", referencedColumnName = "id_paciente", insertable=true, updatable=true)
  private tb_paciente tb_paciente;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_conta_receber(){
  }

  
  /**
   * Obtém id_cnt_rec
   * @param id_cnt_rec id_cnt_rec
   * return id_cnt_rec
   * @generated
   */
  public java.lang.String getId_cnt_rec(){
    return this.id_cnt_rec;
  }
  
  /**
   * Define id_cnt_rec
   * @param id_cnt_rec id_cnt_rec
   * @generated
   */
  public tb_conta_receber setId_cnt_rec(java.lang.String id_cnt_rec){
    this.id_cnt_rec = id_cnt_rec;
    return this;
  }
  
  /**
   * Obtém nr_doc
   * @param nr_doc nr_doc
   * return nr_doc
   * @generated
   */
  public java.lang.String getNr_doc(){
    return this.nr_doc;
  }
  
  /**
   * Define nr_doc
   * @param nr_doc nr_doc
   * @generated
   */
  public tb_conta_receber setNr_doc(java.lang.String nr_doc){
    this.nr_doc = nr_doc;
    return this;
  }
  
  /**
   * Obtém dt_emissao
   * @param dt_emissao dt_emissao
   * return dt_emissao
   * @generated
   */
  public java.util.Date getDt_emissao(){
    return this.dt_emissao;
  }
  
  /**
   * Define dt_emissao
   * @param dt_emissao dt_emissao
   * @generated
   */
  public tb_conta_receber setDt_emissao(java.util.Date dt_emissao){
    this.dt_emissao = dt_emissao;
    return this;
  }
  
  /**
   * Obtém dt_vencimento
   * @param dt_vencimento dt_vencimento
   * return dt_vencimento
   * @generated
   */
  public java.util.Date getDt_vencimento(){
    return this.dt_vencimento;
  }
  
  /**
   * Define dt_vencimento
   * @param dt_vencimento dt_vencimento
   * @generated
   */
  public tb_conta_receber setDt_vencimento(java.util.Date dt_vencimento){
    this.dt_vencimento = dt_vencimento;
    return this;
  }
  
  /**
   * Obtém dt_recebimento
   * @param dt_recebimento dt_recebimento
   * return dt_recebimento
   * @generated
   */
  public java.util.Date getDt_recebimento(){
    return this.dt_recebimento;
  }
  
  /**
   * Define dt_recebimento
   * @param dt_recebimento dt_recebimento
   * @generated
   */
  public tb_conta_receber setDt_recebimento(java.util.Date dt_recebimento){
    this.dt_recebimento = dt_recebimento;
    return this;
  }
  
  /**
   * Obtém vl_conta
   * @param vl_conta vl_conta
   * return vl_conta
   * @generated
   */
  public java.lang.Double getVl_conta(){
    return this.vl_conta;
  }
  
  /**
   * Define vl_conta
   * @param vl_conta vl_conta
   * @generated
   */
  public tb_conta_receber setVl_conta(java.lang.Double vl_conta){
    this.vl_conta = vl_conta;
    return this;
  }
  
  /**
   * Obtém vl_juros
   * @param vl_juros vl_juros
   * return vl_juros
   * @generated
   */
  public java.lang.Double getVl_juros(){
    return this.vl_juros;
  }
  
  /**
   * Define vl_juros
   * @param vl_juros vl_juros
   * @generated
   */
  public tb_conta_receber setVl_juros(java.lang.Double vl_juros){
    this.vl_juros = vl_juros;
    return this;
  }
  
  /**
   * Obtém ds_status
   * @param ds_status ds_status
   * return ds_status
   * @generated
   */
  public java.lang.String getDs_status(){
    return this.ds_status;
  }
  
  /**
   * Define ds_status
   * @param ds_status ds_status
   * @generated
   */
  public tb_conta_receber setDs_status(java.lang.String ds_status){
    this.ds_status = ds_status;
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
  public tb_conta_receber setTb_paciente(tb_paciente tb_paciente){
    this.tb_paciente = tb_paciente;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_cnt_rec == null) ? 0 : id_cnt_rec.hashCode());

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
      
      if(!(obj instanceof tb_conta_receber))
        return false;
      
      tb_conta_receber other = (tb_conta_receber)obj;
      
    if(this.id_cnt_rec == null && other.id_cnt_rec != null)
        return false;
      else if(!this.id_cnt_rec.equals(other.id_cnt_rec))
        return false;
  

      return true;
      
  }
}
