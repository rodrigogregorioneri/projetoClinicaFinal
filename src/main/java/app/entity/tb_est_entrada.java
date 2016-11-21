package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_EST_ENTRADA
 * @generated
 */
@Entity
@Table(name = "\"TB_EST_ENTRADA\""


)
@XmlRootElement
public class tb_est_entrada implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1501622342l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_est_ent", insertable=true, updatable=true)
  private java.lang.String id_est_ent = UUID.randomUUID().toString().toUpperCase();
  
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
  @Column(name = "dt_entrada", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_entrada;
  
  /**
   * @generated
   */
  @Column(name = "qtd_entrada", nullable = false, unique = false, length=6, insertable=true, updatable=true)
  private java.lang.Integer qtd_entrada;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_est_entrada(){
  }

  
  /**
   * Obtém id_est_ent
   * @param id_est_ent id_est_ent
   * return id_est_ent
   * @generated
   */
  public java.lang.String getId_est_ent(){
    return this.id_est_ent;
  }
  
  /**
   * Define id_est_ent
   * @param id_est_ent id_est_ent
   * @generated
   */
  public tb_est_entrada setId_est_ent(java.lang.String id_est_ent){
    this.id_est_ent = id_est_ent;
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
  public tb_est_entrada setTb_estoque(tb_estoque tb_estoque){
    this.tb_estoque = tb_estoque;
    return this;
  }
  
  /**
   * Obtém dt_entrada
   * @param dt_entrada dt_entrada
   * return dt_entrada
   * @generated
   */
  public java.util.Date getDt_entrada(){
    return this.dt_entrada;
  }
  
  /**
   * Define dt_entrada
   * @param dt_entrada dt_entrada
   * @generated
   */
  public tb_est_entrada setDt_entrada(java.util.Date dt_entrada){
    this.dt_entrada = dt_entrada;
    return this;
  }
  
  /**
   * Obtém qtd_entrada
   * @param qtd_entrada qtd_entrada
   * return qtd_entrada
   * @generated
   */
  public java.lang.Integer getQtd_entrada(){
    return this.qtd_entrada;
  }
  
  /**
   * Define qtd_entrada
   * @param qtd_entrada qtd_entrada
   * @generated
   */
  public tb_est_entrada setQtd_entrada(java.lang.Integer qtd_entrada){
    this.qtd_entrada = qtd_entrada;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_est_ent == null) ? 0 : id_est_ent.hashCode());

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
      
      if(!(obj instanceof tb_est_entrada))
        return false;
      
      tb_est_entrada other = (tb_est_entrada)obj;
      
    if(this.id_est_ent == null && other.id_est_ent != null)
        return false;
      else if(!this.id_est_ent.equals(other.id_est_ent))
        return false;
  

      return true;
      
  }
}
