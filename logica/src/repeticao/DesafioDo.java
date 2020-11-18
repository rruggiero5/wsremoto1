package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * 1ª Parte:
		 * Jogador 1: digita um número inteiro
		 * Jogador 2: tem que advinhar, enquanto ele não acertar, a plicação fica pedindo para ele gigitar um número
		 * 
		 * 2ª Parte:
		 * Implemente dicas para o Jogador 2, informando se o número que
		 * ele tem que advinhar é maior ou menor que o que ele está digitando
		 * 
		 * 3ª Parte:
		 * Exiba no final a quantidade de tentarivas que foram utilizadas
		 * pelo jogador 2 até que ele advinhasse o número
		 * Dica: terão que criar uma variável para contar!!!
		 */

		// Minha solução
		
		//int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1 entre com número inteiro"));
		//int jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2 tente acertar o número inteiro digitado pelo jogador1"));
		//int comparacao = jogador1 - jogador2;
		//int tentativas = 1;

		//while (jogador1 != jogador2) {
			//if (comparacao > 0) {
				//System.out.println("O seu palpite " + jogador2 + " é um número menor que o do correto. Tente um número maior");
			//} else if (comparacao < 0) {
				//System.out.println("O seu palpite " + jogador2 + " é um número maior que o do correto. Tente um número menor");
			//}
			//jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2 tente novamente"));
			//comparacao = jogador1 - jogador2;
			//tentativas = (tentativas + 1);
		//}
		//System.out.println("Parabéns! Você acertou o número " + jogador1 +" na " + tentativas + "ª tentativa");

	//Solução Professor
		
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1 entre com número inteiro"));
		int jogador2 =0;
		int tentativas = 0;

		do {
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2 tente acertar o número inteiro digitado pelo jogador1"));
			tentativas=tentativas + 1;
			
			if (jogador1 > jogador2) {
		System.out.println("tente número maior");
			}else if (jogador1 < jogador2) {
				System.out.println("tente número menor");
			}
						
		}while(jogador1!=jogador2);
			System.out.println("Parabéns! Você acertou o número " + jogador1 +" na " + tentativas + "ª tentativa");
	}

}
