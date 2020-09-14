import { Component, OnInit } from '@angular/core';
import { ServicoService } from './servico.service'
import { AgendaModel } from './agenda.model';
import { ServicoModel } from './servico.moldel';
import { AgendaService } from './agenda.service'

@Component({
  selector: 'app-agenda',
  templateUrl: './agenda.component.html',
  styleUrls: ['./agenda.component.css']
})
export class AgendaComponent implements OnInit {

  agenda: AgendaModel = new AgendaModel();
  listaServico: ServicoModel[];
  listarAgenda: AgendaModel[];
  salvoComSucesso = false

  constructor(private servicoService: ServicoService, private agendaService: AgendaService) { }

  ngOnInit() {
    this.servicoService.buscarServicos().subscribe(conteudo => {
      this.listaServico = conteudo
    })

  }

  //componenet chamando servico
  salvar() {
    this.agendaService.salvar(this.agenda).subscribe(resposta => {
      this.retornoComSucesso(resposta)
    })
  }

  buscarAgenda() {
    // resposta => function que observa meu metodo buscar
    this.agendaService.buscarAgenda().subscribe(resposta => {
      this.listarAgenda = resposta
    })

  }

  retornoComSucesso(resposta: AgendaModel) {
    if (resposta.idAgenda) {
      this.salvoComSucesso = true
      this.agenda = new AgendaModel()
    }
    else if (resposta.idAgenda) {


    }
  }

  excluir(idAgenda) {
    this.agendaService.excluirAgenda(idAgenda).subscribe(resposta => {
      this.buscarAgenda();
    })

    console.log("entrei");


    // criar um metodo de delete no serviço passando agenda.idAgenda, chamar no componente o metodo de delete e atualizar a lista
  }
}
