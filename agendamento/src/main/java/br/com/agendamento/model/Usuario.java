package br.com.agendamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	public Usuario(int id, String nome, String racf, String email, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.racf = racf;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}

	@Column(name="id")
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column (name="racf", length = 10)
	private String racf;
	
	@Column (name="email", length = 100)
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="senha",length = 20)
	private String senha;
	
	@Column(name="foto", length = 100)
	private String foto;

	
	
	
	public Usuario() {
		super();
	}

	public Usuario(int id, String nome, String racf, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.racf = racf;
		this.senha = senha;
		this.foto = foto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
