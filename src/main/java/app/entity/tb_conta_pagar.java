package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_CONTA_PAGAR
 * @generated
 */
@Entity
@Table(name = "\"TB_CONTA_PAGAR\""


)
@XmlRootElement
public class tb_conta_pagar implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 2097035810l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_cnt_pag", insertable=true, updatable=true)
  private java.lang.String id_cnt_pag = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="tb_fornecedor", referencedColumnName = "id_fornecedor", insertable=true, updatable=true)
  private tb_fornecedor tb_fornecedor;
  
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
  @Column(name = "dt_pgto", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_pgto;
  
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
  @Column(name = "nr_doc", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  private java.lang.String nr_doc;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_conta_pagar(){
  }

  
  /**
   * Obtém id_cnt_pag
   * @param id_cnt_pag id_cnt_pag
   * return id_cnt_pag
   * @generated
   */
  public java.lang.String getId_cnt_pag(){
    return this.id_cnt_pag;
  }
  
  /**
   * Define id_cnt_pag
   * @param id_cnt_pag id_cnt_pag
   * @generated
   */
  public tb_conta_pagar setId_cnt_pag(java.lang.String id_cnt_pag){
    this.id_cnt_pag = id_cnt_pag;
    return this;
  }
  
  /**
   * Obtém tb_fornecedor
   * @param tb_fornecedor tb_fornecedor
   * return tb_fornecedor
   * @generated
   */
  public tb_fornecedor getTb_fornecedor(){
    return this.tb_fornecedor;
  }
  
  /**
   * Define tb_fornecedor
   * @param tb_fornecedor tb_fornecedor
   * @generated
   */
  public tb_conta_pagar setTb_fornecedor(tb_fornecedor tb_fornecedor){
    this.tb_fornecedor = tb_fornecedor;
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
  public tb_conta_pagar setDt_emissao(java.util.Date dt_emissao){
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
  public tb_conta_pagar setDt_vencimento(java.util.Date dt_vencimento){
    this.dt_vencimento = dt_vencimento;
    return this;
  }
  
  /**
   * Obtém dt_pgto
   * @param dt_pgto dt_pgto
   * return dt_pgto
   * @generated
   */
  public java.util.Date getDt_pgto(){
    return this.dt_pgto;
  }
  
  /**
   * Define dt_pgto
   * @param dt_pgto dt_pgto
   * @generated
   */
  public tb_conta_pagar setDt_pgto(java.util.Date dt_pgto){
    this.dt_pgto = dt_pgto;
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
  public tb_conta_pagar setVl_conta(java.lang.Double vl_conta){
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
  public tb_conta_pagar setVl_juros(java.lang.Double vl_juros){
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
  public tb_conta_pagar setDs_status(java.lang.String ds_status){
    this.ds_status = ds_status;
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
  public tb_conta_pagar setNr_doc(java.lang.String nr_doc){
    this.nr_doc = nr_doc;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_cnt_pag == null) ? 0 : id_cnt_pag.hashCode());

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
      
      if(!(obj instanceof tb_conta_pagar))
        return false;
      
      tb_conta_pagar other = (tb_conta_pagar)obj;
      
    if(this.id_cnt_pag == null && other.id_cnt_pag != null)
        return false;
      else if(!this.id_cnt_pag.equals(other.id_cnt_pag))
        return false;
  

      return true;
      
  }
}
