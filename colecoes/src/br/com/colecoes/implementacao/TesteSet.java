package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {

		// Set n�o permite ter elementos iguais.



		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("ESTAGI�RIO");
		lista.add("ANALISTA");
		lista.add("SUPORTE");
		lista.add("DBA");
		lista.add("FULL STACK");
		System.out.println(lista);
		System.out.println("Existe DBA? " + lista.contains("DBA"));
		//System.out.println(lista.get(1));    set n�o aceita esse tipo de comando
		//Colections.sort(lista);     set n�o aceita reordenar
	}

}
