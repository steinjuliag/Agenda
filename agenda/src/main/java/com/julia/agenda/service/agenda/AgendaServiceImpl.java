package com.julia.agenda.service.agenda;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julia.agenda.domain.Agenda;
import com.julia.agenda.domain.Servico;
import com.julia.agenda.repository.AgendaRepository;

@Service
public class AgendaServiceImpl implements AgendaService {
	@Autowired
	private AgendaRepository agendaRepository;

	@Override
	public List<Agenda> buscarTodos() {
		List<Agenda> retorno = agendaRepository.findAll();
		return retorno;

	}

	@Override
	public Agenda salvar(Agenda agenda) {
   /// guardas os minutos do meu serviço add
		int somaMinutos = 0;
		for (Servico servico : agenda.getServicos()) {
			somaMinutos += servico.getTempoServicoMinutos();
		}
		LocalDateTime dataFinal = agenda.getDataInicial().plusMinutes(somaMinutos);
		agenda.setDataFinal(dataFinal);

		Agenda agendaSalva = this.agendaRepository.save(agenda);
		return agendaSalva;
	}

	@Override
	public void deleteAgenda(Long idAgenda) {
		 this.agendaRepository.deleteById(idAgenda);
		
	}

	

}
