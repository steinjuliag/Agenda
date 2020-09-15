package com.julia.agenda.service.profissional;

import java.util.List;

import com.julia.agenda.domain.Profissional;

public interface ProfissionalService  {
     List<Profissional> listarTodos();
     Profissional salvar(Profissional profissional);
     

}
