package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
	
		/*
		 * Capturar: o nome e a idade
		 * Se a idade maior que 70, 16 ou 17 ele é facultativo
		 * Se idade estiver entre 18 e 70 é obrigatorio
		 * Se idade for menor que 16 não pode votar
		 */
		
		// Declaração de variáveis
		
				String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
				short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		
		// Lógica de voto
				
			if (idade>=70) {
				System.out.println(nome + " seu voto é facultativo!");
			}
			
			if (idade>=16 && idade<18) {
				System.out.println(nome + " seu voto é facultativo!");
			}
					
			if (idade<70 && idade >=18) {
				System.out.println(nome + " seu voto é obrigatório!");
			}		
			
			if (idade<16) {
				System.out.println(nome + " você não pode votar!");
			}
		
		
		
		

	}

}
