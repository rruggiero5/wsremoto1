package variaveis;

public class Tipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cria��o de vari�vel declarada por <tipo do dado> <nome da vari�vel/objeto>;
		//String (afanum�rico)
		// int[n�meros inteiros] e double[n�meros reais] (num�rico)
		
		
		//declara��o de vari�veis;
		
		String nome = "Ricardo Ruggiero";
		int idade = 28;
		double altura = 1.84;
		double peso = 90;
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
		
		
		/*
		 * Identificador (nome de classe / nome de vari�vel / nome de m�todo)
		 * 
		 * Regras:
		 * 1� N�o come�ar�s com n�meros. Exemplo errado: 1berto => h1berto
		 * 2� N�o utilizar�s palavras reservadas da linguagem. Exemplo errado: public, int, double, class, if
		 * 3� N�o far�s uso de caracteres especiais. Exemplo errado: @, !, ,, ., %, ', ~, ^
		 * 
		 * Padr�es:
		 * 1� Nomes significativos
		 * 2� Utilizar o padr�o CamelCase. Exemplo correto: dataDeNascimento ou data_de_nascimento
		 * 3� Respeite as caixas e os padr�es dos recursos. Exemplo: Classe SEMPRE come�a com letra mai�scula. Vari�vel sempre come�a com letra min�scula (substantivo). M�todo: sempre come�a com min�scula e � seguido de parenteses (verbo)
		 *
		 */
		
		
		
		
		
		
		
	}

}
