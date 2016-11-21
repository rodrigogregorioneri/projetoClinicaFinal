package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_ESPECIALIDADE
 * @generated
 */
@Entity
@Table(name = "\"TB_ESPECIALIDADE\""


)
@XmlRootElement
public class tb_especialidade implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1010597210l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_esp", insertable=true, updatable=true)
  private java.lang.String id_esp = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nm_especialidade", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String nm_especialidade;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_procedimento", referencedColumnName = "id_procedimento", insertable=true, updatable=true)
  private tb_procedimento tb_procedimento;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_especialidade(){
  }

  
  /**
   * Obtém id_esp
   * @param id_esp id_esp
   * return id_esp
   * @generated
   */
  public java.lang.String getId_esp(){
    return this.id_esp;
  }
  
  /**
   * Define id_esp
   * @param id_esp id_esp
   * @generated
   */
  public tb_especialidade setId_esp(java.lang.String id_esp){
    this.id_esp = id_esp;
    return this;
  }
  
  /**
   * Obtém nm_especialidade
   * @param nm_especialidade nm_especialidade
   * return nm_especialidade
   * @generated
   */
  public java.lang.String getNm_especialidade(){
    return this.nm_especialidade;
  }
  
  /**
   * Define nm_especialidade
   * @param nm_especialidade nm_especialidade
   * @generated
   */
  public tb_especialidade setNm_especialidade(java.lang.String nm_especialidade){
    this.nm_especialidade = nm_especialidade;
    return this;
  }
  
  /**
   * Obtém tb_procedimento
   * @param tb_procedimento tb_procedimento
   * return tb_procedimento
   * @generated
   */
  public tb_procedimento getTb_procedimento(){
    return this.tb_procedimento;
  }
  
  /**
   * Define tb_procedimento
   * @param tb_procedimento tb_procedimento
   * @generated
   */
  public tb_especialidade setTb_procedimento(tb_procedimento tb_procedimento){
    this.tb_procedimento = tb_procedimento;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_esp == null) ? 0 : id_esp.hashCode());

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
      
      if(!(obj instanceof tb_especialidade))
        return false;
      
      tb_especialidade other = (tb_especialidade)obj;
      
    if(this.id_esp == null && other.id_esp != null)
        return false;
      else if(!this.id_esp.equals(other.id_esp))
        return false;
  

      return true;
      
  }
}
