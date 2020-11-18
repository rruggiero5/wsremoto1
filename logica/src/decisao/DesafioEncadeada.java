package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {

		/*
		 * Acrescentar uma captura de dado, perguntando ao usuário
		 * Se é alfabetizado (1) ou não (0)
		 * Se não for alfabetizado não vota
		 * Altere o código abaixo para a melhor estrutura de decisão
		 */

		// Declaração de variáveis

		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog("Informe se é alfabetizado (1) ou não alfabetizado (0)"));

		if (alfabetizado ==1) {	

			short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));

			if (idade>=70) {
				System.out.println(nome + " seu voto é facultativo!");
			}else if (idade>=16 && idade<18) {
				System.out.println(nome + " seu voto é facultativo!");
			}else if (idade<70 && idade >=18) {
				System.out.println(nome + " seu voto é obrigatório!");
			}else {
				System.out.println(nome + " você não pode votar!");
			}

		}else {
			System.out.println(nome + " você não pode votar!");
		}
	}

}
