package br.com.finalproject.dao;
/*
 * DAO => Data Access Object (Design Pattern):
 * Classes que contêm os métodos que irão manipular os dados = CRUD
 * C: Create (inserir o dado na tabel)
 * R: Read (consultar o dado na tabela)
 * U: Update (alterar um dado na tabela)
 * D: Delete (apagar um dado na tabela)
 */

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Usuario;

/* Classe CrudRepository<1ºClasseBeans,2ºTipoDadoPK>
 * 
 * os métodos já existem dentro do CrudRepository e não precisa ficar criando métodos
 * save() => gravar/alterar
 * findAll() => consultar
 * deleteAll() => apagar
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);
		
}
