package br.com.formula1.implementacao;

import br.com.formula1.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {

		// Instanciar o objeto (criar repartições em memória):

		Carro objeto = new Carro ();
		// ver onde foi alocado em memória
		// System.out.println("Objeto: " + objeto);

		objeto.preencherEscuderia("ferrari");
		System.out.println(objeto.retornarEscuderia());

		objeto.preencherNumero((short)10);
		System.out.println("Número do carro: " + objeto.retornarNumero());

		System.out.println("Status: " + objeto.ligar());
		System.out.println("Status: " + objeto.desligar());


		objeto.preencherValor((float)1000000.0);
		System.out.println(objeto.retornarPromocao());

		objeto.preencherBasico((short)10, "MAC LAREN", 500000);
		System.out.println(objeto.exibirTudo());

		objeto.ligar();
		objeto.acelerar(20);
		System.out.println(objeto.retornarVelocidadeAtual());
		objeto.acelerar(30);
		System.out.println(objeto.retornarVelocidadeAtual());
		objeto.desacelerar(10);
		System.out.println(objeto.retornarVelocidadeAtual());
		objeto.brecar();
		System.out.println(objeto.retornarVelocidadeAtual());
		

		


	}

}
