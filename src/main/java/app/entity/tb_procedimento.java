package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_PROCEDIMENTO
 * @generated
 */
@Entity
@Table(name = "\"TB_PROCEDIMENTO\""


)
@XmlRootElement
public class tb_procedimento implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -34341684l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_procedimento", insertable=true, updatable=true)
  private java.lang.String id_procedimento = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "ds_procedimento", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  private java.lang.String ds_procedimento;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_procedimento(){
  }

  
  /**
   * Obtém id_procedimento
   * @param id_procedimento id_procedimento
   * return id_procedimento
   * @generated
   */
  public java.lang.String getId_procedimento(){
    return this.id_procedimento;
  }
  
  /**
   * Define id_procedimento
   * @param id_procedimento id_procedimento
   * @generated
   */
  public tb_procedimento setId_procedimento(java.lang.String id_procedimento){
    this.id_procedimento = id_procedimento;
    return this;
  }
  
  /**
   * Obtém ds_procedimento
   * @param ds_procedimento ds_procedimento
   * return ds_procedimento
   * @generated
   */
  public java.lang.String getDs_procedimento(){
    return this.ds_procedimento;
  }
  
  /**
   * Define ds_procedimento
   * @param ds_procedimento ds_procedimento
   * @generated
   */
  public tb_procedimento setDs_procedimento(java.lang.String ds_procedimento){
    this.ds_procedimento = ds_procedimento;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_procedimento == null) ? 0 : id_procedimento.hashCode());

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
      
      if(!(obj instanceof tb_procedimento))
        return false;
      
      tb_procedimento other = (tb_procedimento)obj;
      
    if(this.id_procedimento == null && other.id_procedimento != null)
        return false;
      else if(!this.id_procedimento.equals(other.id_procedimento))
        return false;
  

      return true;
      
  }
}
