package com.julia.agenda.service.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julia.agenda.domain.Servico;
import com.julia.agenda.repository.ServicosRepository;

@Service
public class ServicosServiceImpl implements ServicosService {
	
	@Autowired
	ServicosRepository servicosRepository;
	
	@Override
	public List<Servico> buscarTodos() {
		List<Servico> retorno = servicosRepository.findAll();
		return retorno;
	}
    

}
