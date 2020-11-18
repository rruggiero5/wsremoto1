package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		//Sintaxe do comando "for"
		// 1º => valor que começa o laço e variável que vai contar 
		// 2º => condição (até quando irá contar?)
		// 3º => como ele vai contar? de 1 em 1?

		for (int cont=0;cont<500;cont++) {
		System.out.println("Valor " + cont);
		}
		
		byte tabuada = Byte.parseByte(JOptionPane.showInputDialog("Digite um número"));
		for (int cont=0;cont<11;cont++) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}
		
	}

}
