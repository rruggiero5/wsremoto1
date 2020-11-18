package br.com.acme.tratamento;

import java.sql.SQLException;

public class MinhaExcecao {

	public static String tratar(Exception e) {
		if(e instanceof NullPointerException) {
			return "Objeto está nulo.";

		}else if (e instanceof NumberFormatException) {
			return "Número inválido";
		}else if (e instanceof SQLException) {
			return "Erro no banco de dados";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			//e.printStackTrace();
			//throw new RuntimeException ();
			return "Exceção não tratada";
		}

		//criando e instanciando pela classe filha
		//Corrente objeto = new Corrente();

		//criando pela classe pai e instanciando pela classe filha
		//Conta objeto = new Corrente();

		//NullPointerException objeto = new NullPointerException();
		//Exception objeto = new NullPointerException();





	}	


}
