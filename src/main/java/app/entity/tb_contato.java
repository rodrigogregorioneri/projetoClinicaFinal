package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_CONTATO
 * @generated
 */
@Entity
@Table(name = "\"TB_CONTATO\""


)
@XmlRootElement
public class tb_contato implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 952145203l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_conato", insertable=true, updatable=true)
  private java.lang.String id_conato = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nr_ddd", nullable = false, unique = false, length=2, insertable=true, updatable=true)
  private java.lang.Integer nr_ddd;
  
  /**
   * @generated
   */
  @Column(name = "nr_cel", nullable = false, unique = false, length=9, insertable=true, updatable=true)
  private java.lang.Integer nr_cel;
  
  /**
   * @generated
   */
  @Column(name = "nr_tel", nullable = false, unique = false, length=8, insertable=true, updatable=true)
  private java.lang.Integer nr_tel;
  
  /**
   * @generated
   */
  @Column(name = "nm_email", nullable = false, unique = false, length=30, insertable=true, updatable=true)
  private java.lang.String nm_email;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_contato(){
  }

  
  /**
   * Obtém id_conato
   * @param id_conato id_conato
   * return id_conato
   * @generated
   */
  public java.lang.String getId_conato(){
    return this.id_conato;
  }
  
  /**
   * Define id_conato
   * @param id_conato id_conato
   * @generated
   */
  public tb_contato setId_conato(java.lang.String id_conato){
    this.id_conato = id_conato;
    return this;
  }
  
  /**
   * Obtém nr_ddd
   * @param nr_ddd nr_ddd
   * return nr_ddd
   * @generated
   */
  public java.lang.Integer getNr_ddd(){
    return this.nr_ddd;
  }
  
  /**
   * Define nr_ddd
   * @param nr_ddd nr_ddd
   * @generated
   */
  public tb_contato setNr_ddd(java.lang.Integer nr_ddd){
    this.nr_ddd = nr_ddd;
    return this;
  }
  
  /**
   * Obtém nr_cel
   * @param nr_cel nr_cel
   * return nr_cel
   * @generated
   */
  public java.lang.Integer getNr_cel(){
    return this.nr_cel;
  }
  
  /**
   * Define nr_cel
   * @param nr_cel nr_cel
   * @generated
   */
  public tb_contato setNr_cel(java.lang.Integer nr_cel){
    this.nr_cel = nr_cel;
    return this;
  }
  
  /**
   * Obtém nr_tel
   * @param nr_tel nr_tel
   * return nr_tel
   * @generated
   */
  public java.lang.Integer getNr_tel(){
    return this.nr_tel;
  }
  
  /**
   * Define nr_tel
   * @param nr_tel nr_tel
   * @generated
   */
  public tb_contato setNr_tel(java.lang.Integer nr_tel){
    this.nr_tel = nr_tel;
    return this;
  }
  
  /**
   * Obtém nm_email
   * @param nm_email nm_email
   * return nm_email
   * @generated
   */
  public java.lang.String getNm_email(){
    return this.nm_email;
  }
  
  /**
   * Define nm_email
   * @param nm_email nm_email
   * @generated
   */
  public tb_contato setNm_email(java.lang.String nm_email){
    this.nm_email = nm_email;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_conato == null) ? 0 : id_conato.hashCode());

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
      
      if(!(obj instanceof tb_contato))
        return false;
      
      tb_contato other = (tb_contato)obj;
      
    if(this.id_conato == null && other.id_conato != null)
        return false;
      else if(!this.id_conato.equals(other.id_conato))
        return false;
  

      return true;
      
  }
}
