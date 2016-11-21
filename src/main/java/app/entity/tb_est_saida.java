package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_EST_SAIDA
 * @generated
 */
@Entity
@Table(name = "\"TB_EST_SAIDA\""


)
@XmlRootElement
public class tb_est_saida implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -312161005l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_estoque", referencedColumnName = "id_estoque", insertable=true, updatable=true)
  private tb_estoque tb_estoque;
  
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_saida", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_saida;
  
  /**
   * @generated
   */
  @Column(name = "qtd_saida", nullable = false, unique = false, length=6, insertable=true, updatable=true)
  private java.lang.Integer qtd_saida;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_est_saida(){
  }

  
  /**
   * Obtém id
   * @param id id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public tb_est_saida setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém tb_estoque
   * @param tb_estoque tb_estoque
   * return tb_estoque
   * @generated
   */
  public tb_estoque getTb_estoque(){
    return this.tb_estoque;
  }
  
  /**
   * Define tb_estoque
   * @param tb_estoque tb_estoque
   * @generated
   */
  public tb_est_saida setTb_estoque(tb_estoque tb_estoque){
    this.tb_estoque = tb_estoque;
    return this;
  }
  
  /**
   * Obtém dt_saida
   * @param dt_saida dt_saida
   * return dt_saida
   * @generated
   */
  public java.util.Date getDt_saida(){
    return this.dt_saida;
  }
  
  /**
   * Define dt_saida
   * @param dt_saida dt_saida
   * @generated
   */
  public tb_est_saida setDt_saida(java.util.Date dt_saida){
    this.dt_saida = dt_saida;
    return this;
  }
  
  /**
   * Obtém qtd_saida
   * @param qtd_saida qtd_saida
   * return qtd_saida
   * @generated
   */
  public java.lang.Integer getQtd_saida(){
    return this.qtd_saida;
  }
  
  /**
   * Define qtd_saida
   * @param qtd_saida qtd_saida
   * @generated
   */
  public tb_est_saida setQtd_saida(java.lang.Integer qtd_saida){
    this.qtd_saida = qtd_saida;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

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
      
      if(!(obj instanceof tb_est_saida))
        return false;
      
      tb_est_saida other = (tb_est_saida)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}
