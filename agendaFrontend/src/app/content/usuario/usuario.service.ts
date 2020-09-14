import { Injectable } from '@angular/core';

import { environment } from '../../../environments/environment';
import { HttpClient } from '@angular/common/http';

import { UsuarioModel } from './usuario.model';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private readonly API = `${environment.API}/v1/api/usuario`;

  constructor(private http: HttpClient) { }

  public buscarUsuarios() {
    return this.http.get<UsuarioModel[]>(this.API);
  }

  public salvar(usuario: UsuarioModel) {
    return this.http.post(this.API, usuario);
  }

  public deletar(id: number) {
    return this.http.delete(`${this.API}/${id}`);
  }

}
