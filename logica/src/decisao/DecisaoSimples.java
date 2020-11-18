package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		// Declara��o de vari�veis
		
		String nome = JOptionPane.showInputDialog("Aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1 + nota2)/2;
		
		// Operadores relacionais
		// != (n�o igual)
		// == (igual)
		
		if (media>=6) {
		System.out.println("Parab�ns " + nome + " voc� est� aprovado!");
		}
		
		if (media<4) {
			System.out.println("Infelizmente " + nome + " voc� foi reprovado!");
		}
		
		// Operadores l�gicos
		// && => and => e
		// || => or => ou
		
		if (media<6 && media>=4){
			System.out.println(nome + " voc� ainda tem uma chance no exame!");
		}
		
		System.out.println("Sua m�dia foi: " + media);
	
	} // fecha m�todo

} // fecha classe
