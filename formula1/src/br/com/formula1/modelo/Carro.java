package br.com.formula1.modelo;

public class Carro {

	private String escuderia;
	private short numero;
	private String cor;
	private float velocidadeAtual;
	private float valor;
	private boolean status;

	// Sintaxe do método no Java
	// <modificador> <Tipo do Retorno> <nome do método> (<Tipo do Param> <nome do Param>){


	public boolean retornarStatus() {
		return status;
	}
	
	public float retornarVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void brecar() {
		if (status=true) {
			velocidadeAtual = 0;
		}
	}

	public void desacelerar(float param) {
		if (status=true && velocidadeAtual>param) {
			velocidadeAtual = (velocidadeAtual - param);
		}
	}

	public void acelerar(float param) {
		if (status=true) {
			velocidadeAtual = (velocidadeAtual + param);
		}
	}	


	public String exibirTudo () {
		String variavel = "DESLIGADO";
		if (status==true) {
			variavel="LIGADO";
		}

		return 
				"Escuderia: " + escuderia + "\n" +
				"Número: " + numero + "\n" + 
				"Cor: " + cor + "\n" +
				"Velocidade: " + velocidadeAtual + "\n" +
				"Valor: " + valor + "\n" +
				"Status: " + variavel;
	}



	public void preencherBasico(short param1, String param2, float param3) {
		numero=param1;
		escuderia=param2;
		valor=param3;
	}	

	public void preencherValor(float param) {
		if (param >0) {
			valor=param;
		}
	}

	public float retornarPromocao () {
		return valor*(float)0.9;
	}	

	public String ligar() {
		status=true;
		return "Ligado";
	}

	public String desligar() {
		status=false;
		velocidadeAtual=0;
		return "Desligado";
	}	


	public String retornarEscuderia () {
		return escuderia;
	}

	public void preencherEscuderia(String param) {
		escuderia=param.toUpperCase();
	}

	public void preencherNumero(short param) {
		if (param >0) {
			numero=param;
		}
	}

	public short retornarNumero () {
		return numero;
	}


}
