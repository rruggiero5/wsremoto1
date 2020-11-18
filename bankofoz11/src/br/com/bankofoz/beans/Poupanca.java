package br.com.bankofoz.beans;

import br.com.bankofoz.util.PadraoConta;

public class Poupanca extends Conta implements PadraoConta{

	private float rendimento;

	public void creditarRendimentos() {
		super.setSaldo(super.getSaldo() + super.getSaldo()*(rendimento/100));
	}
	
	
	
	public String getAll() {
		return 
				super.getAll() + "\n" +
				"Rendimento...: " + rendimento;
	}
	
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}


	@Override
	public boolean sacar(float valor) {
		if (valor>super.getSaldo()) {
			return false;
		}
		setSaldo(super.getSaldo()-valor);
		return true;
	}


	@Override
	public boolean depositar(float valor) {
		if (valor<=0) {
			return false;
		}
		setSaldo(super.getSaldo() + valor);
		return true;
	}
	
	
}
