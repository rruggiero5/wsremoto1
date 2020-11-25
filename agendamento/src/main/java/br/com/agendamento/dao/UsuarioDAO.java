package br.com.agendamento.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamento.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	
	public Usuario findByRacfAndSenha (String racf,String senha);	
	
	public Usuario findByEmailAndSenha (String email,String senha);	
	
	public Usuario findByEmailOrRacfAndSenha (String email,String racf, String senha);	


}
