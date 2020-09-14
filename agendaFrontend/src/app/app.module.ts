import { BrowserModule } from '@angular/platform-browser';
import { NgModule, LOCALE_ID } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';


import { PrimeNgModule } from './prime-ng/primeng.module';
import {PasswordModule} from 'primeng/password';
import {InputTextModule} from 'primeng/inputtext';
import { UsuarioComponent } from './content/usuario/usuario.component';
import { AngularFontAwesomeModule } from 'angular-font-awesome';
import { CurrencyMaskModule } from "ng2-currency-mask";
import { AppRoutingModule } from './app-routing.module';
import { CadastroComponent } from './content/usuario/cadastro/cadastro.component';
import { AgendaComponent } from './agenda/agenda.component';
import localePt from '@angular/common/locales/pt';
import { registerLocaleData } from '@angular/common';
import { LoginComponent } from './agenda/login/login.component';



registerLocaleData(localePt);

@NgModule({
  declarations: [
    AppComponent,
    UsuarioComponent,
    CadastroComponent,
    AgendaComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    PrimeNgModule,
    HttpClientModule,
    FormsModule,
    AngularFontAwesomeModule,
    CurrencyMaskModule,
    AppRoutingModule,
    
  ],
  providers: [
    { provide: LOCALE_ID, useValue: 'pt-BR' }
  ],
  bootstrap: [AppComponent],
  exports: [UsuarioComponent, CadastroComponent],
  entryComponents: [UsuarioComponent]
})
export class AppModule { }
