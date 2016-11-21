package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_ESTOQUE
 * @generated
 */
@Entity
@Table(name = "\"TB_ESTOQUE\""


)
@XmlRootElement
public class tb_estoque implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1447890544l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_estoque", insertable=true, updatable=true)
  private java.lang.String id_estoque = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "qtd_item", nullable = false, unique = false, length=2, insertable=true, updatable=true)
  private java.lang.Integer qtd_item;
  
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
  public tb_estoque(){
  }

  
  /**
   * Obtém id_estoque
   * @param id_estoque id_estoque
   * return id_estoque
   * @generated
   */
  public java.lang.String getId_estoque(){
    return this.id_estoque;
  }
  
  /**
   * Define id_estoque
   * @param id_estoque id_estoque
   * @generated
   */
  public tb_estoque setId_estoque(java.lang.String id_estoque){
    this.id_estoque = id_estoque;
    return this;
  }
  
  /**
   * Obtém qtd_item
   * @param qtd_item qtd_item
   * return qtd_item
   * @generated
   */
  public java.lang.Integer getQtd_item(){
    return this.qtd_item;
  }
  
  /**
   * Define qtd_item
   * @param qtd_item qtd_item
   * @generated
   */
  public tb_estoque setQtd_item(java.lang.Integer qtd_item){
    this.qtd_item = qtd_item;
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
  public tb_estoque setTb_item_estoque(tb_item_estoque tb_item_estoque){
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

        result = prime * result + ((id_estoque == null) ? 0 : id_estoque.hashCode());

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
      
      if(!(obj instanceof tb_estoque))
        return false;
      
      tb_estoque other = (tb_estoque)obj;
      
    if(this.id_estoque == null && other.id_estoque != null)
        return false;
      else if(!this.id_estoque.equals(other.id_estoque))
        return false;
  

      return true;
      
  }
}
