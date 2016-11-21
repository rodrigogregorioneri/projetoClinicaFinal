package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela TB_ENDERECO
 * @generated
 */
@Entity
@Table(name = "\"TB_ENDERECO\""


)
@XmlRootElement
public class tb_endereco implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1750134375l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id_endereco", insertable=true, updatable=true)
  private java.lang.String id_endereco = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nm_logradouro", nullable = false, unique = false, length=60, insertable=true, updatable=true)
  private java.lang.String nm_logradouro;
  
  /**
   * @generated
   */
  @Column(name = "nr_residencia", nullable = false, unique = false, length=4, insertable=true, updatable=true)
  private java.lang.Integer nr_residencia;
  
  /**
   * @generated
   */
  @Column(name = "nm_bairro", nullable = false, unique = false, length=45, insertable=true, updatable=true)
  private java.lang.String nm_bairro;
  
  /**
   * @generated
   */
  @Column(name = "nr_cep", nullable = false, unique = false, length=8, insertable=true, updatable=true)
  private java.lang.Integer nr_cep;
  
  /**
   * @generated
   */
  @Column(name = "ds_complemento", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String ds_complemento;
  
  /**
   * @generated
   */
  @Column(name = "nm_cidade", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String nm_cidade;
  
  /**
   * @generated
   */
  @Column(name = "nm_estado", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String nm_estado;
  
  /**
   * @generated
   */
  @Column(name = "nm_pais", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String nm_pais;
  
  
  /**
   * Construtor
   * @generated
   */
  public tb_endereco(){
  }

  
  /**
   * Obtém id_endereco
   * @param id_endereco id_endereco
   * return id_endereco
   * @generated
   */
  public java.lang.String getId_endereco(){
    return this.id_endereco;
  }
  
  /**
   * Define id_endereco
   * @param id_endereco id_endereco
   * @generated
   */
  public tb_endereco setId_endereco(java.lang.String id_endereco){
    this.id_endereco = id_endereco;
    return this;
  }
  
  /**
   * Obtém nm_logradouro
   * @param nm_logradouro nm_logradouro
   * return nm_logradouro
   * @generated
   */
  public java.lang.String getNm_logradouro(){
    return this.nm_logradouro;
  }
  
  /**
   * Define nm_logradouro
   * @param nm_logradouro nm_logradouro
   * @generated
   */
  public tb_endereco setNm_logradouro(java.lang.String nm_logradouro){
    this.nm_logradouro = nm_logradouro;
    return this;
  }
  
  /**
   * Obtém nr_residencia
   * @param nr_residencia nr_residencia
   * return nr_residencia
   * @generated
   */
  public java.lang.Integer getNr_residencia(){
    return this.nr_residencia;
  }
  
  /**
   * Define nr_residencia
   * @param nr_residencia nr_residencia
   * @generated
   */
  public tb_endereco setNr_residencia(java.lang.Integer nr_residencia){
    this.nr_residencia = nr_residencia;
    return this;
  }
  
  /**
   * Obtém nm_bairro
   * @param nm_bairro nm_bairro
   * return nm_bairro
   * @generated
   */
  public java.lang.String getNm_bairro(){
    return this.nm_bairro;
  }
  
  /**
   * Define nm_bairro
   * @param nm_bairro nm_bairro
   * @generated
   */
  public tb_endereco setNm_bairro(java.lang.String nm_bairro){
    this.nm_bairro = nm_bairro;
    return this;
  }
  
  /**
   * Obtém nr_cep
   * @param nr_cep nr_cep
   * return nr_cep
   * @generated
   */
  public java.lang.Integer getNr_cep(){
    return this.nr_cep;
  }
  
  /**
   * Define nr_cep
   * @param nr_cep nr_cep
   * @generated
   */
  public tb_endereco setNr_cep(java.lang.Integer nr_cep){
    this.nr_cep = nr_cep;
    return this;
  }
  
  /**
   * Obtém ds_complemento
   * @param ds_complemento ds_complemento
   * return ds_complemento
   * @generated
   */
  public java.lang.String getDs_complemento(){
    return this.ds_complemento;
  }
  
  /**
   * Define ds_complemento
   * @param ds_complemento ds_complemento
   * @generated
   */
  public tb_endereco setDs_complemento(java.lang.String ds_complemento){
    this.ds_complemento = ds_complemento;
    return this;
  }
  
  /**
   * Obtém nm_cidade
   * @param nm_cidade nm_cidade
   * return nm_cidade
   * @generated
   */
  public java.lang.String getNm_cidade(){
    return this.nm_cidade;
  }
  
  /**
   * Define nm_cidade
   * @param nm_cidade nm_cidade
   * @generated
   */
  public tb_endereco setNm_cidade(java.lang.String nm_cidade){
    this.nm_cidade = nm_cidade;
    return this;
  }
  
  /**
   * Obtém nm_estado
   * @param nm_estado nm_estado
   * return nm_estado
   * @generated
   */
  public java.lang.String getNm_estado(){
    return this.nm_estado;
  }
  
  /**
   * Define nm_estado
   * @param nm_estado nm_estado
   * @generated
   */
  public tb_endereco setNm_estado(java.lang.String nm_estado){
    this.nm_estado = nm_estado;
    return this;
  }
  
  /**
   * Obtém nm_pais
   * @param nm_pais nm_pais
   * return nm_pais
   * @generated
   */
  public java.lang.String getNm_pais(){
    return this.nm_pais;
  }
  
  /**
   * Define nm_pais
   * @param nm_pais nm_pais
   * @generated
   */
  public tb_endereco setNm_pais(java.lang.String nm_pais){
    this.nm_pais = nm_pais;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id_endereco == null) ? 0 : id_endereco.hashCode());

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
      
      if(!(obj instanceof tb_endereco))
        return false;
      
      tb_endereco other = (tb_endereco)obj;
      
    if(this.id_endereco == null && other.id_endereco != null)
        return false;
      else if(!this.id_endereco.equals(other.id_endereco))
        return false;
  

      return true;
      
  }
}
