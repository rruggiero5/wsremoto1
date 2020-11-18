package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
				
		
		//declaração de variáveis solcitando ao usuário para digitar;
		
		// Tipo de referência: quando o tipo se refere a uma classe (começa com letra maiúscula);
		String nome = JOptionPane.showInputDialog("Digite o nome");
		
		// Tipo primitivo: quando o tipo já pertence à linguagem (começa com letra miníscula);
		// Tipo primitivo precisa de um apoio. Esse apoio vem das classes "Wrappers";
		// Classe Wrapper int => Integer;
		// Classe Wrapper double => Double;
		// Classe Wrapper boolean => Boolean;
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double imc = peso/(altura*altura);
		
		// Saídas na tela;
		
		System.out.println("Nome:   " + nome);
		System.out.println("Idade:  " + idade + " anos");
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Peso:   " + peso + " Kg");
		System.out.println("IMC:    " + imc);
		
		
		// Saídas formatadas usando casa decimal no IMC;
		
		System.out.println();
		System.out.println("Nome:   " + nome);
		System.out.println("Idade:  " + idade + " anos");
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Peso:   " + peso + " Kg");
		System.out.printf("IMC:   %.2f\n " , imc);

		// Outra forma printf as variáveis na ordem das %
		
		// Cada /n insere uma linha;
		// %s => para String;
		// %f => para números reais;
		// %d => para números inteiros;
		
		System.out.println();
		System.out.printf("%s seu IMC é: %.2f\n " ,nome, imc);
		
		
		
		
		
		
		
		
		
		
	}

}
