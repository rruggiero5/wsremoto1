package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {



		String nome = JOptionPane.showInputDialog("Aluno").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));

		if(faltas<20) {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
			float media = (nota1 + nota2)/2;

			if (media>=6) {
				System.out.println("Parab�ns " + nome + " voc� est� aprovado!");
			}else if (media<4) {
				System.out.println("Infelizmente " + nome + " voc� foi reprovado!");
			}else {
				System.out.println(nome + " voc� ainda tem uma chance no exame!");
			}

			System.out.println("Sua m�dia foi: " + media);
		}else 
			System.out.println(nome + " voc� reprovou por flaltas.");
		}
}




