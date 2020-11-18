package br.com.bankofoz.beans;

import br.com.bankofoz.util.PadraoConta;
/*
 * Polimorfismo: ocorre quando temos dois metodos com o mesmo nome, fazendo ações diferentes
 * Override (sobrescrita): quando os metodos estão em classes diferentes
 * Overload (sobrecarga): quando os metodos etão na mesma classe
 * (devem possior assinaturas diferentes - parametros)
 */
public class Conta implements PadraoConta {

	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;

	public float verificarSaldo(float limite) {
		if(this instanceof Poupanca) {
			return saldo;
		}
		else if (this instanceof Corrente) {
			return saldo+limite;
		}else {
			return 0;
		}
	}


	
	

	public String getAll() {
		return
				"Número: " + numero + "-" + digito + "\n" +
				"Agência: " + agencia + "\n" +
				"Saldo: " + saldo + "\n" +
				cliente.getAll();
	}


	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}


	public Conta() {
		super();
	}
	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public byte getDigito() {
		return digito;
	}
	public void setDigito(byte digito) {
		this.digito = digito;
	}
	public short getAgencia() {
		return agencia;
	}
	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public boolean sacar(float valor) {

		return false;
	}


	@Override
	public boolean depositar(float valor) {

		return false;
	}















}
