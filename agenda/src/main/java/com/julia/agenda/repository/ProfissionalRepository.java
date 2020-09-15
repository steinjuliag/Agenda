package com.julia.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julia.agenda.domain.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

}
