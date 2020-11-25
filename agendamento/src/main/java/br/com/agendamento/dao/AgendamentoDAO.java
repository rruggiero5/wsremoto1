package br.com.agendamento.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamento.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {
	
	//individuais
	public List<Agendamento> findByAgenciaId(int id);
	public List<Agendamento> findByDataAgendamento (Date dataAgendamento);
	public List<Agendamento> findByNomeCli (String nomeCli);
	
	
	//parciais
	public List<Agendamento> findByAgenciaIdAndDataAgendamento (int id, Date dataAgendamento);
	public List<Agendamento> findByAgenciaIdAndNomeCli (int id, String nomeCli);
	public List<Agendamento> findByDataAgendamentoAndNomeCli (Date dataAgendamento, String nomeCli);
	
	//todos
	public List<Agendamento> findByAgenciaIdAndDataAgendamentoAndNomeCli (int id,Date horaAgendamento, String nomeCli);
	
	

}
