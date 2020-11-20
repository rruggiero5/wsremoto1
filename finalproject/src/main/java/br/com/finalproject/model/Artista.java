package br.com.finalproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TB_ARTISTA")
public class Artista {

	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nomeartistico", length=50)
	private String nomeartistico;
	
	@Column(name="nacionaldade", length=50)
	private String nacionalidade;
	
		
	
	public Artista() {
		super();
	}
	public Artista(int id, String nomeartistico, String nacionalidade) {
		super();
		this.id = id;
		this.nomeartistico = nomeartistico;
		this.nacionalidade = nacionalidade;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeartistico() {
		return nomeartistico;
	}
	public void setNomeartistico(String nomeartistico) {
		this.nomeartistico = nomeartistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
	
	
	
	
}
