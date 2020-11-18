package variaveis;

public class Tipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criação de variável declarada por <tipo do dado> <nome da variável/objeto>;
		//String (afanumérico)
		// int[números inteiros] e double[números reais] (numérico)
		
		
		//declaração de variáveis;
		
		String nome = "Ricardo Ruggiero";
		int idade = 28;
		double altura = 1.84;
		double peso = 90;
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
		
		
		/*
		 * Identificador (nome de classe / nome de variável / nome de método)
		 * 
		 * Regras:
		 * 1º Não começarás com números. Exemplo errado: 1berto => h1berto
		 * 2º Não utilizarás palavras reservadas da linguagem. Exemplo errado: public, int, double, class, if
		 * 3º Não farás uso de caracteres especiais. Exemplo errado: @, !, ,, ., %, ', ~, ^
		 * 
		 * Padrões:
		 * 1º Nomes significativos
		 * 2º Utilizar o padrão CamelCase. Exemplo correto: dataDeNascimento ou data_de_nascimento
		 * 3º Respeite as caixas e os padrões dos recursos. Exemplo: Classe SEMPRE começa com letra maiúscula. Variável sempre começa com letra minúscula (substantivo). Método: sempre começa com minúscula e é seguido de parenteses (verbo)
		 *
		 */
		
		
		
		
		
		
		
	}

}
