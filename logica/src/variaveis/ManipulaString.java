package variaveis;

public class ManipulaString {

	public static void main(String[] args) {

		// fixar maiúsculo ou minúsculo
		
		String email = "xpto@itAu-unibAnco.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minúscula: " + email.toLowerCase());
		System.out.println("Maiúscula: " + email.toUpperCase());
		
		// limitar quantidade de caracteres
		
	
		System.out.println("Quantidade de Caracters: " + email.length());
		
		// verificar se tem @
		
		System.out.println("Tem @? " + email.contains("@"));
		
		// posição do caracter
		
		System.out.println("Posição do @: " + email.indexOf("@"));
		
		// Extrair uma parte da string
		
		System.out.println("Do 2º até 4º: " + email.substring(1,5));
		
		
		// quero que exibam a primeira metade do email
		
		System.out.println("Primeira metade do email: " + email.substring(0,email.length()/2));
		
		// quero que exibam o usuário do email
		
		System.out.println("Usuário do email: " + email.substring(0,email.indexOf("@")));
		
		// quero que exibam o servidor
		
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1).toLowerCase());
		
		// verificar se uma string é igual a outra
		
		System.out.println("Comparação: " + email.equals("xpto@itau-unibanco.com.br"));
		System.out.println("Comparação sem case sensitive: " + email.equalsIgnoreCase("xpto@itau-unibanco.com.br"));
		
	}

}
