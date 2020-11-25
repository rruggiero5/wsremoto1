package br.com.agendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendamento.dao.AgendamentoDAO;
import br.com.agendamento.model.Agendamento;

@RestController
@CrossOrigin("*")
public class AgendamentoController {
	@Autowired
	private AgendamentoDAO dao;
	
	 @PostMapping ("/agendamento")
	 
	public ResponseEntity<List<Agendamento>> getAgendamento (@RequestBody Agendamento objeto) {
		List <Agendamento> lista = (List <Agendamento>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	 
	 @PostMapping ("/agendamentodata")
	 public ResponseEntity<List<Agendamento>> getDataAgendamento (@RequestBody Agendamento objeto) {
		 List <Agendamento> lista =  dao.findByDataAgendamento(objeto.getDataAgendamento());
		 if (lista.size()==0) {
			 return ResponseEntity.status(404).build();
		 }
			return ResponseEntity.ok(lista);
	 }
	 @PostMapping("/agendamentocliente")
	 public ResponseEntity <List<Agendamento>> getNomeCli (@RequestBody Agendamento objeto) {
		 List <Agendamento> lista = dao.findByNomeCli(objeto.getNomeCli());
		 if (lista.size()==0) {
			 return ResponseEntity.status(404).build();
			 
		 }
		 return ResponseEntity.ok(lista);
	 }
	 
	 @PostMapping("/agendamentoagenciadata")
	 public ResponseEntity <List <Agendamento>> getAgenciaData (@RequestBody Agendamento objeto){
		 List <Agendamento> lista = dao.findByAgenciaIdAndDataAgendamento(objeto.getAgencia().getId(),objeto.getDataAgendamento());
		 if (lista.size()==0) {
			 return ResponseEntity.status(404).build();
			 
		 }
		 return ResponseEntity.ok(lista);
	 }
	 
	 
	 @PostMapping ("/agendamentoclientedata")
	 public ResponseEntity <List<Agendamento>> getDataAgendamentoCliente (@RequestBody Agendamento objeto) {
		 List <Agendamento> lista = dao.findByDataAgendamentoAndNomeCli(objeto.getDataAgendamento(), objeto.getNomeCli());
		 if (lista.size()==0) {
			 return ResponseEntity.status(404).build();
			 
		 }
		 return ResponseEntity.ok(lista);
	 }
	 
	 @PostMapping ("/agendamentoclienteagencia")
	 public ResponseEntity <List<Agendamento>> getAgendamentoClienteAgencia (@RequestBody Agendamento objeto) {
		 List <Agendamento> lista = (List<Agendamento>) dao.findByAgenciaIdAndNomeCli(objeto.getAgencia().getId(), objeto.getNomeCli());
		 if (lista.size()==0) {
			 return ResponseEntity.status(404).build();
		 }
		 return ResponseEntity.ok(lista);
	 }
	 
	 @PostMapping ("/agendamentoclienteagenciadata")
	 public ResponseEntity <List<Agendamento>> getAgendamentoClienteAgenciaData (@RequestBody Agendamento objeto) {
		 List <Agendamento> lista = (List<Agendamento>) dao.findByAgenciaIdAndDataAgendamentoAndNomeCli(objeto.getAgencia().getId(), objeto.getDataAgendamento(), objeto.getNomeCli());
		 if (lista.size()==0) {
			 return ResponseEntity.status(404).build();
		 }
		 return ResponseEntity.ok(lista);
	 }
	
	 
	 @PostMapping("/agendamentoagencia")
	 public ResponseEntity <List<Agendamento>> getAgendamentoAgencia (@RequestBody Agendamento objeto) {
		 List <Agendamento> lista = (List<Agendamento>) dao.findByAgenciaId(objeto.getAgencia().getId());
		 if (lista.size()==0) {
			 return ResponseEntity.status(404).build();
		 }
		 return ResponseEntity.ok(lista);
	 }
	
	
	
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Agendamento> cadastrar(@RequestBody Agendamento objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	

}
