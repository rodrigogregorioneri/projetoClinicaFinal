package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_FORNECEDOR
 * @generated
 */
@Entity
@Table(name = "\"TB_FORNECEDOR\""


)
@XmlRootElement
public class tb_fornecedor implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1805828135l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_fornecedor", insertable=true, updatable=true)
  private java.lang.String id_fornecedor = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nm_razao_social", nullable = false, unique = false, length=45, insertable=true, updatable=true)
  private java.lang.String nm_razao_social;
  
  /**
   * @generated
   */
  @Column(name = "nr_cnpj", nullable = false, unique = false, length=14, insertable=true, updatable=true)
  private java.lang.Integer nr_cnpj;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_endereco", referencedColumnName = "id_endereco", insertable=true, updatable=true)
  private tb_endereco tb_endereco;
  
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_tb_contato", referencedColumnName = "id_conato", insertable=true, updatable=true)
  private tb_contato tb_contato;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_fornecedor(){
  }

  
  /**
   * Obtém id_fornecedor
   * @param id_fornecedor id_fornecedor
   * return id_fornecedor
   * @generated
   */
  public java.lang.String getId_fornecedor(){
    return this.id_fornecedor;
  }
  
  /**
   * Define id_fornecedor
   * @param id_fornecedor id_fornecedor
   * @generated
   */
  public tb_fornecedor setId_fornecedor(java.lang.String id_fornecedor){
    this.id_fornecedor = id_fornecedor;
    return this;
  }
  
  /**
   * Obtém nm_razao_social
   * @param nm_razao_social nm_razao_social
   * return nm_razao_social
   * @generated
   */
  public java.lang.String getNm_razao_social(){
    return this.nm_razao_social;
  }
  
  /**
   * Define nm_razao_social
   * @param nm_razao_social nm_razao_social
   * @generated
   */
  public tb_fornecedor setNm_razao_social(java.lang.String nm_razao_social){
    this.nm_razao_social = nm_razao_social;
    return this;
  }
  
  /**
   * Obtém nr_cnpj
   * @param nr_cnpj nr_cnpj
   * return nr_cnpj
   * @generated
   */
  public java.lang.Integer getNr_cnpj(){
    return this.nr_cnpj;
  }
  
  /**
   * Define nr_cnpj
   * @param nr_cnpj nr_cnpj
   * @generated
   */
  public tb_fornecedor setNr_cnpj(java.lang.Integer nr_cnpj){
    this.nr_cnpj = nr_cnpj;
    return this;
  }
  
  /**
   * Obtém tb_endereco
   * @param tb_endereco tb_endereco
   * return tb_endereco
   * @generated
   */
  public tb_endereco getTb_endereco(){
    return this.tb_endereco;
  }
  
  /**
   * Define tb_endereco
   * @param tb_endereco tb_endereco
   * @generated
   */
  public tb_fornecedor setTb_endereco(tb_endereco tb_endereco){
    this.tb_endereco = tb_endereco;
    return this;
  }
  
  /**
   * Obtém tb_contato
   * @param tb_contato tb_contato
   * return tb_contato
   * @generated
   */
  public tb_contato getTb_contato(){
    return this.tb_contato;
  }
  
  /**
   * Define tb_contato
   * @param tb_contato tb_contato
   * @generated
   */
  public tb_fornecedor setTb_contato(tb_contato tb_contato){
    this.tb_contato = tb_contato;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_fornecedor == null) ? 0 : id_fornecedor.hashCode());

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
      
      if(!(obj instanceof tb_fornecedor))
        return false;
      
      tb_fornecedor other = (tb_fornecedor)obj;
      
    if(this.id_fornecedor == null && other.id_fornecedor != null)
        return false;
      else if(!this.id_fornecedor.equals(other.id_fornecedor))
        return false;
  

      return true;
      
  }
}
