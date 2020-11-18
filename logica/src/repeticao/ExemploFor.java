package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		//Sintaxe do comando "for"
		// 1� => valor que come�a o la�o e vari�vel que vai contar 
		// 2� => condi��o (at� quando ir� contar?)
		// 3� => como ele vai contar? de 1 em 1?

		for (int cont=0;cont<500;cont++) {
		System.out.println("Valor " + cont);
		}
		
		byte tabuada = Byte.parseByte(JOptionPane.showInputDialog("Digite um n�mero"));
		for (int cont=0;cont<11;cont++) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}
		
	}

}
