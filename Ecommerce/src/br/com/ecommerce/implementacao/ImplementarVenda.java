package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarVenda {

	
	
	public static void main(String[] args) {
		Venda venda = new Venda(
				Magica.f("Total"),
				Magica.s("Data"),
				new Cliente(
						Magica.i("ID"),
						Magica.s("Nome"),
						Magica.s("CPF"),
						new Endereco()
						),
				new Produto(
						Magica.s("Descrição"),
						Magica.f("Valor Venda"),
						Magica.f("Valor Compra"),
						Magica.i("ID"),
						Magica.i("Quantidade")
						)
				);

		System.out.println(venda.getAll());
	}

}
