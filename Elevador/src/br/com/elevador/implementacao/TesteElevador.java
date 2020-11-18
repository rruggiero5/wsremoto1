package br.com.elevador.implementacao;

import br.com.elevador.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador teste = new Elevador();
		
		teste.prepararElevador(10, 0, 5);
		
		teste.subir();
		System.out.println(teste.retornarTudo());
		
		teste.subir();
		teste.subir();
		System.out.println(teste.retornarTudo());
		teste.entrar(2);
		System.out.println(teste.retornarTudo());
		teste.sair(1);
		System.out.println(teste.retornarTudo());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
