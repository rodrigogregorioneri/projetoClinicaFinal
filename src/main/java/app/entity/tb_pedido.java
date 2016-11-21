package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_PEDIDO
 * @generated
 */
@Entity
@Table(name = "\"TB_PEDIDO\""


)
@XmlRootElement
public class tb_pedido implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1501730361l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_pedido", insertable=true, updatable=true)
  private java.lang.String id_pedido = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nr_pedido", nullable = false, unique = false, length=11, insertable=true, updatable=true)
  private java.lang.Integer nr_pedido;
  
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "dt_pedido", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dt_pedido;
  
  /**
   * @generated
   */
  @Column(name = "qtd_item", nullable = false, unique = false, length=5, insertable=true, updatable=true)
  private java.lang.String qtd_item;
  
  /**
   * @generated
   */
  @Column(name = "vl_unit_item", nullable = false, unique = false, length=11, insertable=true, updatable=true)
  private java.lang.String vl_unit_item;
  
  /**
   * @generated
   */
  @Column(name = "vl_pedido", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String vl_pedido;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_fornecedor", referencedColumnName = "id_fornecedor", insertable=true, updatable=true)
  private tb_fornecedor tb_fornecedor;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_item_estoque", referencedColumnName = "id_item", insertable=true, updatable=true)
  private tb_item_estoque tb_item_estoque;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_pedido(){
  }

  
  /**
   * Obtém id_pedido
   * @param id_pedido id_pedido
   * return id_pedido
   * @generated
   */
  public java.lang.String getId_pedido(){
    return this.id_pedido;
  }
  
  /**
   * Define id_pedido
   * @param id_pedido id_pedido
   * @generated
   */
  public tb_pedido setId_pedido(java.lang.String id_pedido){
    this.id_pedido = id_pedido;
    return this;
  }
  
  /**
   * Obtém nr_pedido
   * @param nr_pedido nr_pedido
   * return nr_pedido
   * @generated
   */
  public java.lang.Integer getNr_pedido(){
    return this.nr_pedido;
  }
  
  /**
   * Define nr_pedido
   * @param nr_pedido nr_pedido
   * @generated
   */
  public tb_pedido setNr_pedido(java.lang.Integer nr_pedido){
    this.nr_pedido = nr_pedido;
    return this;
  }
  
  /**
   * Obtém dt_pedido
   * @param dt_pedido dt_pedido
   * return dt_pedido
   * @generated
   */
  public java.util.Date getDt_pedido(){
    return this.dt_pedido;
  }
  
  /**
   * Define dt_pedido
   * @param dt_pedido dt_pedido
   * @generated
   */
  public tb_pedido setDt_pedido(java.util.Date dt_pedido){
    this.dt_pedido = dt_pedido;
    return this;
  }
  
  /**
   * Obtém qtd_item
   * @param qtd_item qtd_item
   * return qtd_item
   * @generated
   */
  public java.lang.String getQtd_item(){
    return this.qtd_item;
  }
  
  /**
   * Define qtd_item
   * @param qtd_item qtd_item
   * @generated
   */
  public tb_pedido setQtd_item(java.lang.String qtd_item){
    this.qtd_item = qtd_item;
    return this;
  }
  
  /**
   * Obtém vl_unit_item
   * @param vl_unit_item vl_unit_item
   * return vl_unit_item
   * @generated
   */
  public java.lang.String getVl_unit_item(){
    return this.vl_unit_item;
  }
  
  /**
   * Define vl_unit_item
   * @param vl_unit_item vl_unit_item
   * @generated
   */
  public tb_pedido setVl_unit_item(java.lang.String vl_unit_item){
    this.vl_unit_item = vl_unit_item;
    return this;
  }
  
  /**
   * Obtém vl_pedido
   * @param vl_pedido vl_pedido
   * return vl_pedido
   * @generated
   */
  public java.lang.String getVl_pedido(){
    return this.vl_pedido;
  }
  
  /**
   * Define vl_pedido
   * @param vl_pedido vl_pedido
   * @generated
   */
  public tb_pedido setVl_pedido(java.lang.String vl_pedido){
    this.vl_pedido = vl_pedido;
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
  public tb_pedido setTb_fornecedor(tb_fornecedor tb_fornecedor){
    this.tb_fornecedor = tb_fornecedor;
    return this;
  }
  
  /**
   * Obtém tb_item_estoque
   * @param tb_item_estoque tb_item_estoque
   * return tb_item_estoque
   * @generated
   */
  public tb_item_estoque getTb_item_estoque(){
    return this.tb_item_estoque;
  }
  
  /**
   * Define tb_item_estoque
   * @param tb_item_estoque tb_item_estoque
   * @generated
   */
  public tb_pedido setTb_item_estoque(tb_item_estoque tb_item_estoque){
    this.tb_item_estoque = tb_item_estoque;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_pedido == null) ? 0 : id_pedido.hashCode());

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
      
      if(!(obj instanceof tb_pedido))
        return false;
      
      tb_pedido other = (tb_pedido)obj;
      
    if(this.id_pedido == null && other.id_pedido != null)
        return false;
      else if(!this.id_pedido.equals(other.id_pedido))
        return false;
  

      return true;
      
  }
}
