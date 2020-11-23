package br.com.finalproject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_MUSICA")

public class Musica {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="titulo", length=40)
	private String titulo;

	@Column(name="lancamento")
	private int lancamento;

	@Column(name="cadastro")
	@Temporal(TemporalType.DATE)
	private Date cadastro;

	@ManyToOne
	private Artista artista;
	
		

	public Musica() {
		super();
	}

	public Musica(int id, String titulo, int lancamento, Date cadastro, Artista artista) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.lancamento = lancamento;
		this.cadastro = cadastro;
		this.artista = artista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getLancamento() {
		return lancamento;
	}

	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}

	public Date getCadastro() {
		return cadastro;
	}

	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}



	




}
