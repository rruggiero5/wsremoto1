package br.com.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.finalproject.dao.MusicaDAO;
import br.com.finalproject.model.Musica;

@RestController
@CrossOrigin("*")
public class MusicaController {

	@Autowired
	private MusicaDAO dao;
	
	@GetMapping("/musica/{cod}")
	public ResponseEntity<Musica> getMusica(@PathVariable int cod){
		Musica resposta = dao.findById(cod).orElse(null);
		if(resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	// Outra forma via post
	
	@PostMapping("/musicapost")
	public ResponseEntity<Musica> getMusicaPost(@RequestBody Musica objeto){
		Musica resposta = dao.findById(objeto.getId()).orElse(null);
		if(resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	@PostMapping("/novamusica")
	public ResponseEntity<Musica> gravar(@RequestBody Musica objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
		
	}
	
	
}
