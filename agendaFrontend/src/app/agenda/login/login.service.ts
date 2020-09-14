import { Injectable } from '@angular/core';

import { environment } from '../../../environments/environment';
import { HttpClient } from '@angular/common/http';

import { LoginModel } from './login.model';

import { LoginComponent } from './login.component';
import { Observable } from 'rxjs';
import { analyzeAndValidateNgModules } from '@angular/compiler';

@Injectable({
    providedIn: 'root'
})
export class LoginService {
    loginM: LoginModel;
    // consumir meu rest .
    private readonly API = `${environment.API}/usuario/autenticar`;

    constructor(private http: HttpClient) { }

    public autenticarUser(nome: any, senha: any) {
        var url = this.API + '/' + nome + '/' + senha
        return this.http.get<LoginModel>(url);
    }

}