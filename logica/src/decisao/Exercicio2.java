package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 	Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente.
		 */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		while (numero2 == numero1) {
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero diferente do j� digitado"));
		}
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero"));
		while (numero3 == numero1 || numero3 == numero2) {
			numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero diferente do j� digitado"));
		}
		
	}
		
		
		
			
		
	
	}