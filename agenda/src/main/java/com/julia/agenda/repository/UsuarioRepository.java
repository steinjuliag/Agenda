package com.julia.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.julia.agenda.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select u from Usuario u where u.nome = :nome and u.senha = :senha")
   	public Usuario existeAutentica(String nome, String senha);

}
