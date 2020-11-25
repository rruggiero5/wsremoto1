package br.com.agendamento.model;

import java.sql.Time;
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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name="TB_AGENDAMENTO")
public class Agendamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numSeq")
	private int numSeq;
	
	@Column (name="nomeCli", length = 100)
	private String nomeCli;
	
	@Column (name="emailCli", length = 100)
	private String emailCli;
	
	@Column (name="celularCli", length = 20)
	private String celularCli;
	
	@Column (name="dataAgendamento")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
	private Date dataAgendamento;
	
	@Column (name="horaAgendamento")
	private Time horaAgendamento;
	
	@Column (name="observacao", length = 255)
	private String observacao;
	
	@ManyToOne
	@JsonIgnoreProperties("agendamentos")
	private Agencia agencia;

	public Agendamento(int numSeq, String nomeCli, String emailCli, String celularCli, Date dataAgendamento,
			Time horaAgendamento, String observacao, Agencia agencia) {
		super();
		this.numSeq = numSeq;
		this.nomeCli = nomeCli;
		this.emailCli = emailCli;
		this.celularCli = celularCli;
		this.dataAgendamento = dataAgendamento;
		this.horaAgendamento = horaAgendamento;
		this.observacao = observacao;
		this.agencia = agencia;
	}

	public Agendamento() {
		super();
	}

	public int getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}

	public String getNomeCli() {
		return nomeCli;
	}

	public void setNomeCli(String nomeCli) {
		this.nomeCli = nomeCli;
	}

	public String getEmailCli() {
		return emailCli;
	}

	public void setEmailCli(String emailCli) {
		this.emailCli = emailCli;
	}

	public String getCelularCli() {
		return celularCli;
	}

	public void setCelularCli(String celularCli) {
		this.celularCli = celularCli;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Time getHoraAgendamento() {
		return horaAgendamento;
	}

	public void setHoraAgendamento(Time horaAgendamento) {
		this.horaAgendamento = horaAgendamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	

}
