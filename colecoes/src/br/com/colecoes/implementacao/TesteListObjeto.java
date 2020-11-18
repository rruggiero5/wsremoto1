package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.bean.Cargo;
import br.com.colecoes.util.Magica;

public class TesteListObjeto {

	public static void main(String[] args) {

		List<Cargo> lista = new ArrayList<Cargo>();

		// Primeira forma de adicionar
		lista.add(new Cargo(
				Magica.s("Cargo"), 
				Magica.s("Nível"),
				Magica.f("Salário")
				));
		
		// Segunda forma de adicionar
		Cargo objeto = new Cargo();
		objeto.setNivel(Magica.s("Nível"));
		objeto.setNome(Magica.s("Nome"));
		objeto.setSalario(Magica.f("Salario"));
		lista.add(objeto);
		//Fim da segunda forma
		
		System.out.println("Nome do primeiro cargo: " + lista.get(0).getNome());
		
		//Incluir:
		//Quantos Jr foram armazenados
		// Média entre todos o salários
				
		int totalJr =0;
		float totalSalarios=0;
		
		for (int cont=0;cont<lista.size();cont++) {
			System.out.println("Cargo número: " + (cont+1));
			System.out.println("Nome do Cargo: " + lista.get(cont).getNome());
			System.out.println("Nível do Cargo: " + lista.get(cont).getNivel());
			System.out.println("Salário do Cargo: " + lista.get(cont).getSalario());
			totalSalarios+=lista.get(cont).getSalario();
			
			if (lista.get(cont).getNivel().equals("JR")) {
				totalJr++;
			}
				
		}
		System.out.println("Média de Salários: " + (totalSalarios/lista.size()));
		System.out.println("quantidade de JR: " + totalJr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
