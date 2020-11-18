package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {

		char resposta=0;
		int quantidade=0;
		float valor=0;
		
		do{
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
			valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
			System.out.println("Total: " + (quantidade*valor));
			resposta = JOptionPane.showInputDialog("Digite S para continuar").toUpperCase().charAt(0);
		}while(resposta =='S');

		
	}
}