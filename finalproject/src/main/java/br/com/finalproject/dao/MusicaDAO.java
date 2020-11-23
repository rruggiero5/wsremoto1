package br.com.finalproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Musica;

public interface MusicaDAO extends CrudRepository<Musica,Integer>{
	
//A procura pode ser feita por título, por artista ou por ambos. Portanto precisam ser criados três métodos
	
	public List<Musica> findByTitulo(String titulo);
	public List<Musica> findByArtistaId(int id);
	public List<Musica> findByTituloAndArtistaId(String titulo, int id);
	
	
	
}
