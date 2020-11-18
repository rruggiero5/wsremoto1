package br.com.excecoes.implementacao;

import br.com.excecoes.tratamento.MinhaExcecao;

public class TesteExcecoes {
/*
 * Dois tipos de escecoes:
 * Checked (AC) antes da compilação => exceções que ocorrem antes da compilação. Normalmente voltadas para acesso à recursos externos (BD, arquivos, etc)
 * Unchecked (DC) depois da compilação => exceções que são disparadas somente após a compilação. Exemplo: NullPointer, NumberFormat, etc)
 * 
 */
	public static void main(String[] args) {

		try {

			int numero = Integer.parseInt("5");
			System.out.println(numero);

			//String nome = null;
			String nome = new String();

			System.out.println("Quantidade de Letras: " + nome.length());
			
			double vetor[] = new double[2];
			vetor[0] = 5.54;
			vetor[1] = 6.12;
			//vetor[2] = 15.8;
			
		
		// Com a classe MinhaExcecao poderia apagar as linhas abaixo	
		//}catch(NullPointerException e) {
		//	System.out.println("Objeto com valor nulo");

		//}catch(NumberFormatException e) {
		//	System.out.println("Número Inválido!");

		}catch(Exception e) {
			//System.out.println("Deu ruim");
			System.out.println(MinhaExcecao.tratar(e));

			//enquanto não termina e valida o codigo coloca essa linha abaixo par ver as mensagens de esceções
			//e.printStackTrace();

		}finally {
			System.out.println("Até logo");
		}



















	}

}
