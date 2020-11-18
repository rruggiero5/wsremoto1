package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
				
		
		//declara��o de vari�veis solcitando ao usu�rio para digitar;
		
		// Tipo de refer�ncia: quando o tipo se refere a uma classe (come�a com letra mai�scula);
		String nome = JOptionPane.showInputDialog("Digite o nome");
		
		// Tipo primitivo: quando o tipo j� pertence � linguagem (come�a com letra min�scula);
		// Tipo primitivo precisa de um apoio. Esse apoio vem das classes "Wrappers";
		// Classe Wrapper int => Integer;
		// Classe Wrapper double => Double;
		// Classe Wrapper boolean => Boolean;
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double imc = peso/(altura*altura);
		
		// Sa�das na tela;
		
		System.out.println("Nome:   " + nome);
		System.out.println("Idade:  " + idade + " anos");
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Peso:   " + peso + " Kg");
		System.out.println("IMC:    " + imc);
		
		
		// Sa�das formatadas usando casa decimal no IMC;
		
		System.out.println();
		System.out.println("Nome:   " + nome);
		System.out.println("Idade:  " + idade + " anos");
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Peso:   " + peso + " Kg");
		System.out.printf("IMC:   %.2f\n " , imc);

		// Outra forma printf as vari�veis na ordem das %
		
		// Cada /n insere uma linha;
		// %s => para String;
		// %f => para n�meros reais;
		// %d => para n�meros inteiros;
		
		System.out.println();
		System.out.printf("%s seu IMC �: %.2f\n " ,nome, imc);
		
		
		
		
		
		
		
		
		
		
	}

}
