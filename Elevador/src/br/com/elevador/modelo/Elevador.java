package br.com.elevador.modelo;

public class Elevador {

	private int andarAtual;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private String nome;


	// Sintaxe do método no Java
	// <modificador> <Tipo do Retorno> <nome do método> (<Tipo do Param> <nome do Param>){

	
	public void prepararElevador(int pAndarMaximo, int pAndarMinimo, int pCapacidade) {
	andarMaximo = pAndarMaximo;
	andarMinimo = pAndarMinimo;
	capacidadePessoas = pCapacidade;
	}
	

public void entrar(int pQtde) {
	if (capacidadePessoas>=(qtdePessoas+pQtde)) {
		qtdePessoas = (qtdePessoas + pQtde);
	}
}

public void sair(int pQtde) {
	if (qtdePessoas>=pQtde) {
		qtdePessoas = (qtdePessoas - pQtde);
	}
}

public void subir() {
	if(andarMaximo>andarAtual) {
		andarAtual= (andarAtual+1);
		
	}
}

public void descer() {
	if(andarMinimo<andarAtual) {
		andarAtual= (andarAtual-1);
		
	}
}

public String retornarTudo() {
	return 
			"Andar Atual: " + andarAtual + "\n" +
			"Andar Máximo: " + andarMaximo + "\n" + 
			"Andar Mínimo: " + andarMinimo + "\n" +
			"Capacidade de Pessoas: " + capacidadePessoas + "\n" +
			"Quantidade de Pessoas: " + qtdePessoas + "\n" +
			"Nome: " + nome;
}





















}
