package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_CONVENIO
 * @generated
 */
@Entity
@Table(name = "\"TB_CONVENIO\""


)
@XmlRootElement
public class tb_convenio implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -546369688l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_convenio", insertable=true, updatable=true)
  private java.lang.String id_convenio = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nm_convenio", nullable = false, unique = false, length=30, insertable=true, updatable=true)
  private java.lang.String nm_convenio;
  
  /**
   * @generated
   */
  @Column(name = "nm_plano", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String nm_plano;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_convenio(){
  }

  
  /**
   * Obtém id_convenio
   * @param id_convenio id_convenio
   * return id_convenio
   * @generated
   */
  public java.lang.String getId_convenio(){
    return this.id_convenio;
  }
  
  /**
   * Define id_convenio
   * @param id_convenio id_convenio
   * @generated
   */
  public tb_convenio setId_convenio(java.lang.String id_convenio){
    this.id_convenio = id_convenio;
    return this;
  }
  
  /**
   * Obtém nm_convenio
   * @param nm_convenio nm_convenio
   * return nm_convenio
   * @generated
   */
  public java.lang.String getNm_convenio(){
    return this.nm_convenio;
  }
  
  /**
   * Define nm_convenio
   * @param nm_convenio nm_convenio
   * @generated
   */
  public tb_convenio setNm_convenio(java.lang.String nm_convenio){
    this.nm_convenio = nm_convenio;
    return this;
  }
  
  /**
   * Obtém nm_plano
   * @param nm_plano nm_plano
   * return nm_plano
   * @generated
   */
  public java.lang.String getNm_plano(){
    return this.nm_plano;
  }
  
  /**
   * Define nm_plano
   * @param nm_plano nm_plano
   * @generated
   */
  public tb_convenio setNm_plano(java.lang.String nm_plano){
    this.nm_plano = nm_plano;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_convenio == null) ? 0 : id_convenio.hashCode());

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
      
      if(!(obj instanceof tb_convenio))
        return false;
      
      tb_convenio other = (tb_convenio)obj;
      
    if(this.id_convenio == null && other.id_convenio != null)
        return false;
      else if(!this.id_convenio.equals(other.id_convenio))
        return false;
  

      return true;
      
  }
}
