package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * 1� Parte:
		 * Jogador 1: digita um n�mero inteiro
		 * Jogador 2: tem que advinhar, enquanto ele n�o acertar, a plica��o fica pedindo para ele gigitar um n�mero
		 * 
		 * 2� Parte:
		 * Implemente dicas para o Jogador 2, informando se o n�mero que
		 * ele tem que advinhar � maior ou menor que o que ele est� digitando
		 * 
		 * 3� Parte:
		 * Exiba no final a quantidade de tentarivas que foram utilizadas
		 * pelo jogador 2 at� que ele advinhasse o n�mero
		 * Dica: ter�o que criar uma vari�vel para contar!!!
		 */

		// Minha solu��o
		
		//int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1 entre com n�mero inteiro"));
		//int jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2 tente acertar o n�mero inteiro digitado pelo jogador1"));
		//int comparacao = jogador1 - jogador2;
		//int tentativas = 1;

		//while (jogador1 != jogador2) {
			//if (comparacao > 0) {
				//System.out.println("O seu palpite " + jogador2 + " � um n�mero menor que o do correto. Tente um n�mero maior");
			//} else if (comparacao < 0) {
				//System.out.println("O seu palpite " + jogador2 + " � um n�mero maior que o do correto. Tente um n�mero menor");
			//}
			//jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2 tente novamente"));
			//comparacao = jogador1 - jogador2;
			//tentativas = (tentativas + 1);
		//}
		//System.out.println("Parab�ns! Voc� acertou o n�mero " + jogador1 +" na " + tentativas + "� tentativa");

	//Solu��o Professor
		
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1 entre com n�mero inteiro"));
		int jogador2 =0;
		int tentativas = 0;

		do {
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2 tente acertar o n�mero inteiro digitado pelo jogador1"));
			tentativas=tentativas + 1;
			
			if (jogador1 > jogador2) {
		System.out.println("tente n�mero maior");
			}else if (jogador1 < jogador2) {
				System.out.println("tente n�mero menor");
			}
						
		}while(jogador1!=jogador2);
			System.out.println("Parab�ns! Voc� acertou o n�mero " + jogador1 +" na " + tentativas + "� tentativa");
	}

}
