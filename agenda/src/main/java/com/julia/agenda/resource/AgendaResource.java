package com.julia.agenda.resource;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julia.agenda.domain.Agenda;
import com.julia.agenda.service.agenda.AgendaService;


@RestController
@RequestMapping(value = "agenda")
public class AgendaResource {

	private AgendaService agendaService;

	public AgendaResource(AgendaService agendaService) {
		this.agendaService = agendaService;
	}

	@GetMapping
	public ResponseEntity<List<Agenda>> listarTodos() {
		List<Agenda> response;
		try {
			response = this.agendaService.buscarTodos();
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	
	@PostMapping
	public ResponseEntity<Agenda> saveAgenda(@RequestBody Agenda agenda) {
		Agenda response;
		try {
			response = this.agendaService.salvar(agenda);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	@DeleteMapping("/{idAgenda}")
	public ResponseEntity<Void> deleteAgenda(@PathVariable("idAgenda") Long id) {
		this.agendaService.deleteAgenda(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
}
