package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 	Escreva um código que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.
		 */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		while (numero2 == numero1) {
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número diferente do já digitado"));
		}
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
		while (numero3 == numero1 || numero3 == numero2) {
			numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número diferente do já digitado"));
		}
		
	}
		
		
		
			
		
	
	}