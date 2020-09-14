import { Injectable } from '@angular/core';

import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { ServicoModel } from './servico.moldel';
import { AgendaModel } from './agenda.model';
import { AgendaComponent } from './agenda.component';

@Injectable({
    providedIn: 'root'
})
export class ServicoService {
     // conectando com servidor
    private readonly API = `${environment.API}/servicos`;

    constructor(private http: HttpClient) { }

    public buscarServicos() {
        return this.http.get<ServicoModel[]>(this.API);
    }

}