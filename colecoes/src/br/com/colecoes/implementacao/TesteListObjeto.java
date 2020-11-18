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
				Magica.s("N�vel"),
				Magica.f("Sal�rio")
				));
		
		// Segunda forma de adicionar
		Cargo objeto = new Cargo();
		objeto.setNivel(Magica.s("N�vel"));
		objeto.setNome(Magica.s("Nome"));
		objeto.setSalario(Magica.f("Salario"));
		lista.add(objeto);
		//Fim da segunda forma
		
		System.out.println("Nome do primeiro cargo: " + lista.get(0).getNome());
		
		//Incluir:
		//Quantos Jr foram armazenados
		// M�dia entre todos o sal�rios
				
		int totalJr =0;
		float totalSalarios=0;
		
		for (int cont=0;cont<lista.size();cont++) {
			System.out.println("Cargo n�mero: " + (cont+1));
			System.out.println("Nome do Cargo: " + lista.get(cont).getNome());
			System.out.println("N�vel do Cargo: " + lista.get(cont).getNivel());
			System.out.println("Sal�rio do Cargo: " + lista.get(cont).getSalario());
			totalSalarios+=lista.get(cont).getSalario();
			
			if (lista.get(cont).getNivel().equals("JR")) {
				totalJr++;
			}
				
		}
		System.out.println("M�dia de Sal�rios: " + (totalSalarios/lista.size()));
		System.out.println("quantidade de JR: " + totalJr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
