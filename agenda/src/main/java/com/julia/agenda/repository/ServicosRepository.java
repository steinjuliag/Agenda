package com.julia.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julia.agenda.domain.Servico;

public interface ServicosRepository extends JpaRepository<Servico, Long> {

}
