package com.julia.agenda.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julia.agenda.domain.Profissional;
import com.julia.agenda.service.profissional.ProfissionalService;

@RestController
@RequestMapping(value = "profissional")
public class ProfissionalResource {
	// referencia classe service
	public ProfissionalService profissionalservice;

	// passando por parametro no meu construtor a interface profissionalService
	public ProfissionalResource(ProfissionalService profissionalService) {
		this.profissionalservice = profissionalService;

	}

	// mapeamento métodos do HTTP:
	@GetMapping
	public ResponseEntity<List<Profissional>> listarTodos() {
		List<Profissional> response;
		try {
			response = this.profissionalservice.listarTodos();

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<Profissional> saveProfissional(@RequestBody Profissional profissional) {
		Profissional response;
		try {
			response = this.profissionalservice.salvar(profissional);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
