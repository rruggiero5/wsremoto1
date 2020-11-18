package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 	Elabore uma aplica��o que leia o valor de dois n�meros inteiros 
		 * e a opera��o aritm�tica desejada (+, -, * ou /)
		 * calcule, ent�o, a resposta adequada.
		 * Se optar por uma divis�o, leve em considera��o que n�o podemos ter um n�mero dividido por zero.
		 */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		String operacao = JOptionPane.showInputDialog("Qual opera��o desejada ( +, -, * ou /");


		if (operacao.equalsIgnoreCase("*")){
			System.out.println("O resultado de " + numero1 + " * " + numero2 + " � igual a " + (numero1 * numero2));
		}else if (operacao.equalsIgnoreCase("+")) {
			System.out.println("O resultado de " + numero1 + " + " + numero2 + " � igual a " + (numero1 + numero2));
		}else if (operacao.equalsIgnoreCase("-")) {
			System.out.println("O resultado de " + numero1 + " - " + numero2 + " � igual a " + (numero1 - numero2));
		}else if (operacao.equalsIgnoreCase("/") && numero2 != 0){
			System.out.println("O resultado de " + numero1 + " / " + numero2 + " � igual a " + (numero1 / numero2));
		}else if (operacao.equalsIgnoreCase("/") && numero2 == 0){
			System.out.println("N�o � poss�vel divis�o por 0");
		}else {
			System.out.println("Opera��o solicitada n�o � v�lida");
		}

	}
}