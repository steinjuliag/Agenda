package com.julia.agenda.service.usuario;

import com.julia.agenda.domain.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario salvar(Usuario usuario);

    Usuario update(Usuario usuario);

    List<Usuario> listarTodos();

    Usuario listarPorCodigo(Long idUsuario);

    Usuario autenticar(String nome, String senha);

    void delete(Usuario usuario);
}
