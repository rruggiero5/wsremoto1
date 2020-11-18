package br.com.xyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor2 {

	public static void main(String[] args) {

		Professor professor = new Professor();
		Endereco endereco = new Endereco();

		professor.setAll(
				1, 
				"PASCOALLI", 
				"DOUTOR", 
				"1234=5678", 
				endereco);

		endereco.setAll(
				"AVENIDA PAULISTA", 
				"3500", 
				"ANDAR 5", 
				"CENTRO", 
				"SAO PAULO", 
				"SP", 
				"12345-000"
				);

		System.out.println(professor.getAll());
		//System.out.println(professor.getEndereco().getAll());
		//System.out.println(professor.getEndereco().getCep());
	}

}
