package variaveis;

public class ManipulaString {

	public static void main(String[] args) {

		// fixar mai�sculo ou min�sculo
		
		String email = "xpto@itAu-unibAnco.com.br";
		System.out.println("Original: " + email);
		System.out.println("Min�scula: " + email.toLowerCase());
		System.out.println("Mai�scula: " + email.toUpperCase());
		
		// limitar quantidade de caracteres
		
	
		System.out.println("Quantidade de Caracters: " + email.length());
		
		// verificar se tem @
		
		System.out.println("Tem @? " + email.contains("@"));
		
		// posi��o do caracter
		
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		
		// Extrair uma parte da string
		
		System.out.println("Do 2� at� 4�: " + email.substring(1,5));
		
		
		// quero que exibam a primeira metade do email
		
		System.out.println("Primeira metade do email: " + email.substring(0,email.length()/2));
		
		// quero que exibam o usu�rio do email
		
		System.out.println("Usu�rio do email: " + email.substring(0,email.indexOf("@")));
		
		// quero que exibam o servidor
		
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1).toLowerCase());
		
		// verificar se uma string � igual a outra
		
		System.out.println("Compara��o: " + email.equals("xpto@itau-unibanco.com.br"));
		System.out.println("Compara��o sem case sensitive: " + email.equalsIgnoreCase("xpto@itau-unibanco.com.br"));
		
	}

}
