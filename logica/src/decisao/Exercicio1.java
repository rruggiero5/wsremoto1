package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 	Elabore uma aplicação que leia o valor de dois números inteiros 
		 * e a operação aritmética desejada (+, -, * ou /)
		 * calcule, então, a resposta adequada.
		 * Se optar por uma divisão, leve em consideração que não podemos ter um número dividido por zero.
		 */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		String operacao = JOptionPane.showInputDialog("Qual operação desejada ( +, -, * ou /");


		if (operacao.equalsIgnoreCase("*")){
			System.out.println("O resultado de " + numero1 + " * " + numero2 + " é igual a " + (numero1 * numero2));
		}else if (operacao.equalsIgnoreCase("+")) {
			System.out.println("O resultado de " + numero1 + " + " + numero2 + " é igual a " + (numero1 + numero2));
		}else if (operacao.equalsIgnoreCase("-")) {
			System.out.println("O resultado de " + numero1 + " - " + numero2 + " é igual a " + (numero1 - numero2));
		}else if (operacao.equalsIgnoreCase("/") && numero2 != 0){
			System.out.println("O resultado de " + numero1 + " / " + numero2 + " é igual a " + (numero1 / numero2));
		}else if (operacao.equalsIgnoreCase("/") && numero2 == 0){
			System.out.println("Nâo é possível divisão por 0");
		}else {
			System.out.println("Operação solicitada não é válida");
		}

	}
}