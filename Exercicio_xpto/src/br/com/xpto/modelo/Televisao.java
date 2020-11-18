package br.com.xpto.modelo;

public class Televisao {

	private String marca;
	private float valorVenda;
	private float valorCompra;
	private int volume;
	private int canal;
	private boolean status;

	// Sintaxe do método no Java
	// <modificador> <Tipo do Retorno> <nome do método> (<Tipo do Param> <nome do Param>){

	public void preencherMarca(String pMarca) {
		marca = pMarca;
	}

	public void preencherValorCompra (float pValor) {
		valorCompra=pValor;
	}

	public String definirValorVenda() {
		valorVenda = ((float)1.2 * valorCompra);
		return "O valor de venda é: " + valorVenda;
	}

	public String ligar() {
		if (status= true) {
			return "Ligada";
		}else 
			return "Desligada";
	}

	public void aumentarVolume() {
		if (status=true && volume<=20) {
			volume= volume+1;
		}
	}

	public void diminuirVolume() {
		if (status=true && volume>0) {
			volume= volume-1;
		}
	}

	public void mudarCanal(int pCanal) {
		if(status=true && canal>0 && canal<999) {
			canal=pCanal;
		}
	}

	public String retornarResumo() {
		String statusTV = "Ligada";
		if(status = false) {
			statusTV= "Desligada";
		}

		return 
				"Status da TV: " + statusTV + "\n" +
				"Canal: " + canal + "\n" + 
				"Volume: " + volume + "\n" +
				"Valor de venda: " + valorVenda + "\n" +
				"Valor de compra: " + valorCompra;

	}



































}
