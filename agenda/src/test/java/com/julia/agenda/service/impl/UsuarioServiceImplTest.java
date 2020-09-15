package com.julia.agenda.service.impl;


import com.julia.agenda.domain.Usuario;
import com.julia.agenda.repository.UsuarioRepository;
import com.julia.agenda.service.usuario.UsuarioService;
import com.julia.agenda.service.usuario.UsuarioServiceImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class UsuarioServiceImplTest {

//    @Mock
//    private UsuarioRepository usuarioRepository;
//
//    @InjectMocks
//    private UsuarioService usuarioService = new UsuarioServiceImpl();
//
//    @Autowired
//    private UsuarioService usuarioService2;
//
//    @BeforeEach
//    void setMockOutput() {
//        // when(usuarioService.listarTodos()).thenReturn(getListUsuario());
//    }
//
//    @Test
//    @DisplayName("Teste listar todos os usuarios")
//    void listarTodos() {
//        List<Usuario> lista = usuarioService2.listarTodos();
//        Assertions.assertNotNull(lista);
//        Assertions.assertTrue(lista.size() > 0 || lista.isEmpty());
//    }

 /*   @Test
    @DisplayName("Teste de salvar usuario")
    void salvar() {
        Usuario usuario = getListUsuario().get(0);
        usuario.setIdUsuario(null);
        usuario = usuarioService2.salvar(usuario);
        Assertions.assertNotNull(usuario);
        Assertions.assertNotNull(usuario.getIdUsuario());
    }*/

/*
    @Test
    @DisplayName("Teste de atualizar usuario")
    void atualizar() {
        Usuario usuario = getListUsuario().get(0);
        usuario.setIdUsuario(null);
        usuario = usuarioService2.salvar(usuario);
        Assertions.assertNotNull(usuario);
        Assertions.assertNotNull(usuario.getIdUsuario());
        usuario.setNome("Murilo alterado");
        usuario = usuarioService2.update(usuario);
        Assertions.assertNotNull(usuario);
        Assertions.assertNotNull(usuario.getIdUsuario());
        Assertions.assertNotNull(usuario.getNome());
        Assertions.assertEquals("Murilo alterado", usuario.getNome());
    }
*/

/*    @Test
    @DisplayName("Teste de listar por codigo usuario")
    void listarPorCodigo() {
        Usuario usuario = getListUsuario().get(0);
        usuario.setIdUsuario(null);
        usuario = usuarioService2.salvar(usuario);
        Assertions.assertNotNull(usuario);
        Assertions.assertNotNull(usuario.getIdUsuario());
        usuario = usuarioService2.listarPorCodigo(usuario.getIdUsuario());
        Assertions.assertNotNull(usuario);
    }*/

/*    @Test
    @DisplayName("Teste de deletar o usuario")
    void delete() {
        Usuario usuario = getListUsuario().get(0);
        usuario.setIdUsuario(null);
        usuario = usuarioService2.salvar(usuario);
        Assertions.assertNotNull(usuario);
        Assertions.assertNotNull(usuario.getIdUsuario());
        usuarioService2.delete(usuario);
        usuario = usuarioService2.listarPorCodigo(usuario.getIdUsuario());
        Assertions.assertNull(usuario);
    }*/

    private List<Usuario> getListUsuario() {
        List<Usuario> lista = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1L);
        usuario.setNome("Murilo");
        usuario.setSenha("123");
        lista.add(usuario);
        return lista;
    }

}