package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	/*
	 * Solicitar um nome de aluno e duas notas, calcular a média
	 * e exibir uma mensagem para o aluno da seguinte forma:
	 * "Aluno xxxxx, sua média obtida foi: xxxx para 10 faltaramm: xxx pontos"
	 * 	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaração de variáveis solcitando ao usuário para digitar;
		
			String nome = JOptionPane.showInputDialog("Digite o nome");
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
			double media = (nota1 + nota2)/2;
			double faltam = 10 - media;
				
		// Saídas na tela;
			
			System.out.printf("Aluno %s, sua média obtida foi: %.2f. Para 10 faltaram: %.2f pontos.\n " ,nome, media, faltam);
		
		// Tipos primitivos:
		// boolean => Boolean => true ou false
		// char => Character => 1 caracter qualquer ('a')
			
		// São os inteiros (variam em função de capacidade e alocação de memória):
		// byte => Byte (de -127 a + 128)
		// short => Short (de -32k a + 32k)
		// int => Integer (de -2bi a + 2bi)
 		// long => Long (número científico)
			
		// São os reais:	
		// float => Float (para poucas casas decimais. Até 5 casas)
		// double => Double (para muitas casas decimais)
			
			
	}

}
