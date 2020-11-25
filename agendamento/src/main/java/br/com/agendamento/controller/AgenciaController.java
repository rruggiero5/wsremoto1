package br.com.agendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendamento.dao.AgenciaDAO;
import br.com.agendamento.model.Agencia;

@RestController
@CrossOrigin ("*")
public class AgenciaController {
	@Autowired
	private AgenciaDAO dao;
	
	@GetMapping ("/agencia")
	public ResponseEntity<List<Agencia>> getAll() {
		List <Agencia> lista = (List<Agencia>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}	
		return ResponseEntity.ok(lista);
	}

}
