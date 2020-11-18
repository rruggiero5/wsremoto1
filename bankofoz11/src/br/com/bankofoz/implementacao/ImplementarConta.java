package br.com.bankofoz.implementacao;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Endereco;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.util.Magica;

public class ImplementarConta {

	public static void main(String[] args) {
		Conta conta = new Corrente();
		int opcao=Magica.i("Digite <1> Corrente ou <2> Poupanca");
		
		while (opcao!=1 && opcao!=2) {
			opcao=Magica.i("Digite somente 1 ou 2");
		}
		
		if (opcao==1) {
			conta = new Corrente(
					(short) Magica.i("Número da Conta"),
					(byte) Magica.i("Digito da Conta"),
					(short) Magica.i("Número da Agencia"),
					0,
					new Cliente(
							Magica.i("ID"),
							Magica.s("Nome"),
							Magica.s("CPF"),
							new Endereco()
							),
					1000,
					Magica.f("Taxa de manutenção")
					);
		}else {
			conta = new Poupanca(
					(short) Magica.i("Número da Conta"),
					(byte) Magica.i("Digito da Conta"),
					(short) Magica.i("Número da Agencia"),
					0,
					new Cliente(
							Magica.i("ID"),
							Magica.s("Nome"),
							Magica.s("CPF"),
							new Endereco()
							),
					Magica.f("Rendimento")
					);
		}
		System.out.println(conta.depositar(1000));
		System.out.println(conta.getSaldo());
		System.out.println(conta.sacar(2000));
		System.out.println(conta.getSaldo());
		System.out.println(conta.getAll());
		
		
		
		
		
		
		
		
		
		
	}

}
