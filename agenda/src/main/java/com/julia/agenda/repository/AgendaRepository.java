package com.julia.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julia.agenda.domain.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
