package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {

		/*
		 * Acrescentar uma captura de dado, perguntando ao usu�rio
		 * Se � alfabetizado (1) ou n�o (0)
		 * Se n�o for alfabetizado n�o vota
		 * Altere o c�digo abaixo para a melhor estrutura de decis�o
		 */

		// Declara��o de vari�veis

		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog("Informe se � alfabetizado (1) ou n�o alfabetizado (0)"));

		if (alfabetizado ==1) {	

			short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));

			if (idade>=70) {
				System.out.println(nome + " seu voto � facultativo!");
			}else if (idade>=16 && idade<18) {
				System.out.println(nome + " seu voto � facultativo!");
			}else if (idade<70 && idade >=18) {
				System.out.println(nome + " seu voto � obrigat�rio!");
			}else {
				System.out.println(nome + " voc� n�o pode votar!");
			}

		}else {
			System.out.println(nome + " voc� n�o pode votar!");
		}
	}

}
