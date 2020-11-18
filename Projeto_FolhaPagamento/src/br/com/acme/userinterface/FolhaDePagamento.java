package br.com.acme.userinterface;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		// aqui vou criar uma lista (ArrayList) para simular um BD
		ArrayList<Funcionario> lista;
		
		lista = new ArrayList<Funcionario>();
		
		// adicionando objetos na lista
		lista.add(new Chefe("Regina", 1001, 8000.0f, 12.5f, 350.0f));
		lista.add(new Chefe("Michelle", 1002, 8000.0f, 15.0f, 500.0f));
		lista.add(new Horista("Isidro", 1003, 120, 80.0f));
		lista.add(new Horista("Lucas", 1004, 110, 92.0f));
		lista.add(new Comissionado("Renato Dufloth", 1005, 5000.0f, 14.0f));
		lista.add(new Comissionado("Luiz Fernando", 1006, 4587.0f, 22.0f));
		lista.add(new Empreiteiro("Marcello", 1007, 6543.23f));
		
		// como eu faço para "rodar" a folha e mostrar 1 recibo por linha?
		
		for (int pos = 0; pos < lista.size(); pos++) {
			Funcionario f = lista.get(pos);
			System.out.printf("%d  %-30s  R$ %9.2f%n", f.getNumRegistro(), f.getNome(), f.calcularSalario());
		}
		
	}

}