package br.com.xyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementacaoProfessor3 {

	public static void main(String[] args) {
	
		Professor professor = new Professor(
				1,
				"PASCOALLI",
				"DOUTOR",
				"1234-4567",
				new Endereco(
						"AVENIDA PAULISTA",
						"3500",
						"ANDAR 5",
						"CENTRO",
						"SAO PAULO",
						"SP",
						"12345-0000"
						)
				);
		
		System.out.println(professor.getAll());
		
		

	}

}
