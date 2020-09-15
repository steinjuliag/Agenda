package com.julia.agenda.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julia.agenda.domain.Servico;
import com.julia.agenda.service.servicos.ServicosService;

@RestController
@RequestMapping(value = "servicos")
public class ServicosResource {

	public ServicosService servicosService;
	
	public ServicosResource(ServicosService servicosService) {
		this.servicosService = servicosService;
}
	@GetMapping
	public ResponseEntity<List<Servico>> listarTodos() {
		List<Servico> response;
		try {
			response = this.servicosService.buscarTodos();
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}