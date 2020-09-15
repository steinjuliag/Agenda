package com.julia.agenda.service.agenda;

import java.util.List;

import com.julia.agenda.domain.Agenda;

public interface AgendaService {

	List<Agenda> buscarTodos();

	Agenda salvar(Agenda agenda);
    void deleteAgenda(Long idAgenda);
}
