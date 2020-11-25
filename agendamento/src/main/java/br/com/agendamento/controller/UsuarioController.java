package br.com.agendamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendamento.dao.UsuarioDAO;
import br.com.agendamento.model.Usuario;

@RestController
@CrossOrigin ("*")
public class UsuarioController {

	@Autowired
	
	private UsuarioDAO dao;

	@PostMapping("/login")
	
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByEmailOrRacfAndSenha(objeto.getEmail(), objeto.getRacf(), objeto.getSenha());
		
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
}
