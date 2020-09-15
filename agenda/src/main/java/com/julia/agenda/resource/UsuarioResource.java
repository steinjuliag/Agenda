package com.julia.agenda.resource;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.julia.agenda.domain.Usuario;
import com.julia.agenda.service.usuario.UsuarioService;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioResource {

	private final Logger log = LoggerFactory.getLogger(UsuarioResource.class);

	@Autowired
	private UsuarioService userService;

	@PostMapping
	public ResponseEntity<Usuario> saveUser(@RequestBody Usuario usuario) {
		log.debug("REST para salvar o usuario : {}", usuario);
		Usuario response;
		try {
			response = this.userService.salvar(usuario);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Usuario>> listarTodos() {
		List<Usuario> response;
		try {
			response = this.userService.listarTodos();
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Usuario> updateUser(@RequestBody Usuario usuario) {
		Usuario respostaUpdate;
		try {
			respostaUpdate = this.userService.update(usuario);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(respostaUpdate, HttpStatus.CREATED);

	}

	@DeleteMapping
	public ResponseEntity<Usuario> deleteUser(@RequestBody Usuario usuario) {

		try {
			this.userService.delete(usuario);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> listarPorId(@PathVariable(value = "id") long idUsuario) {
		Usuario responseid;
		try {
			responseid = this.userService.listarPorCodigo(idUsuario);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(responseid, HttpStatus.OK);
	}

	@GetMapping("/autenticar/{nome}/{senha}")
	public ResponseEntity<Usuario> autenticar(@PathVariable(value = "nome") String nome, @PathVariable(value = "senha") String senha) {
		Usuario responseid;
		try {
			responseid = this.userService.autenticar(nome, senha);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(responseid, HttpStatus.OK);
	}
}
