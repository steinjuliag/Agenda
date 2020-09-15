package com.julia.agenda.service.usuario;

import com.julia.agenda.domain.Usuario;
import com.julia.agenda.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario salvar(Usuario usuario) {
		Usuario usuarioSalvo = this.usuarioRepository.save(usuario);
		return usuarioSalvo;
	}

	@Override
	public Usuario update(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> listarTodos() {
		return this.usuarioRepository.findAll();
	}

	@Override
	public Usuario listarPorCodigo(Long idUsuario) {
		Optional<Usuario> optionalUsuario = this.usuarioRepository.findById(idUsuario);
		if (optionalUsuario.isPresent()) {
			return optionalUsuario.get();
		} else {
			return null;
		}
	}

	@Override
	public void delete(Usuario usuario) {
		this.usuarioRepository.delete(usuario);
		
	}
	public Usuario autenticar(String nome, String senha){
		Usuario usuario = usuarioRepository.existeAutentica(nome, senha);
        return usuario;
	}


}
