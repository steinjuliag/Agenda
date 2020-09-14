import { Injectable } from '@angular/core';

import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';

import { AgendaModel } from './agenda.model';
import { AgendaComponent } from './agenda.component';
import { Observable } from 'rxjs';
import { ServicoModel } from './servico.moldel';
import { analyzeAndValidateNgModules } from '@angular/compiler';

@Injectable({
    providedIn: 'root'
})
export class AgendaService {
    agendaM: AgendaModel;
    // consumir meu rest .
    private readonly API = `${environment.API}/agenda`;

    constructor(private http: HttpClient) { }

    public salvar(agenda: AgendaModel) {
        return this.http.post(this.API, agenda);
    }

    public buscarAgenda() {

        return this.http.get<AgendaModel[]>(this.API);

    }
    public excluirAgenda(idAgenda) {
        return this.http.delete(this.API + "/" + idAgenda)
    }
}