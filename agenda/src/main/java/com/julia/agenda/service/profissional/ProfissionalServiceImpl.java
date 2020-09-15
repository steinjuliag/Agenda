package com.julia.agenda.service.profissional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julia.agenda.domain.Profissional;
import com.julia.agenda.repository.ProfissionalRepository;
@Service
public class ProfissionalServiceImpl implements ProfissionalService{
@Autowired 
public ProfissionalRepository profissionalRepository;

 @Override
  public List<Profissional> listarTodos(){
	 List<Profissional> retornoListaProfissional = profissionalRepository.findAll();
	return retornoListaProfissional;
	 
 }
 @Override
 public Profissional salvar(Profissional profissional) {
	Profissional profissionalSalvo = profissionalRepository.save(profissional);
	return profissionalSalvo;
	 
 }



}
