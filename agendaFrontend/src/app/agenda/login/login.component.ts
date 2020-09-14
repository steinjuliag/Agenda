import { Component, OnInit } from '@angular/core';
import { LoginService } from './login.service';
import { LoginModel } from './login.model';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  login: LoginModel = new LoginModel();
  
  constructor(private loginService: LoginService,private router: Router) { }
 
  ngOnInit() {
  
  }

  autautenticarUserenticar() {
    this.loginService.autenticarUser(this.login.nome,this.login.senha).subscribe(resposta => {
      this.retornoComSucesso(resposta)
    })
  }
  retornoComSucesso(resposta: any) {

    if (resposta != null) {
      console.log('ok é usuario')
      this.router.navigate(['/agenda']);
    }
    else { console.log('não é usuario') 
    }
  }

  
}
