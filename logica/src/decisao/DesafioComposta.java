package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		/*
		 * Solicite o nome de um produto e a quantidade em estoque
		 * Se a quantidade estiver entre 20 e 40 deve retornar estoque normal
		 * Se a quantidade estiver entre 41 e 60 deve retornar estoque alto
		 * Se a quantidade for maior que 60 deve retornar estoque lotado
		 * Se a quantidade for menor que 20 deve retornar estoque baixo
		 */

		// Declaração de variáveis
		
				String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
				short estoque = Short.parseShort(JOptionPane.showInputDialog("Quantidade em estoque"));
				
				
				// Decisão
				
				if (estoque>=60) {
				System.out.println("Produto " + produto + " está com estoque lotado! ");
				}else if (estoque<20) {
					System.out.println("Produto " + produto + " está com estoque baixo! ");
				}else if (estoque >=20 && estoque<=40) {
					System.out.println("Produto " + produto + " está com estoque normal! ");
				} else
					System.out.println("Produto " + produto + "está com estoque alto! ");
	}
}

