package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
	
		/*
		 * Capturar: o nome e a idade
		 * Se a idade maior que 70, 16 ou 17 ele � facultativo
		 * Se idade estiver entre 18 e 70 � obrigatorio
		 * Se idade for menor que 16 n�o pode votar
		 */
		
		// Declara��o de vari�veis
		
				String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
				short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		
		// L�gica de voto
				
			if (idade>=70) {
				System.out.println(nome + " seu voto � facultativo!");
			}
			
			if (idade>=16 && idade<18) {
				System.out.println(nome + " seu voto � facultativo!");
			}
					
			if (idade<70 && idade >=18) {
				System.out.println(nome + " seu voto � obrigat�rio!");
			}		
			
			if (idade<16) {
				System.out.println(nome + " voc� n�o pode votar!");
			}
		
		
		
		

	}

}
