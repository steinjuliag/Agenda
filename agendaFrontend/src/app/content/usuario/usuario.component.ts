import { Component, OnInit } from '@angular/core';
import { UsuarioService } from './usuario.service';
import { UsuarioModel, Divida } from './usuario.model'
import { MessageService } from 'primeng/api';
import {Validators,FormControl,FormGroup,FormBuilder} from '@angular/forms';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

  public displayDialog: boolean;
  public usuario: UsuarioModel = new UsuarioModel();
  public selectedUsuario: UsuarioModel;
  public newUsuario: boolean;
  public usuarios: UsuarioModel[];
  public cols: any[];
  

  constructor(private usuarioService: UsuarioService, private messageService: MessageService) { }

  ngOnInit() {
    this.buscarUsuarios();
    this.cols = [
      { field: 'name', header: 'Nome' },
      { field: 'email', header: 'Email' },
      { field: 'possuiDivida', header: 'Possui divida' }
    ];
  }

  public buscarUsuarios(): void {
    this.usuarioService.buscarUsuarios()
      .subscribe(data => {
        this.usuarios = data;

        this.usuarios.forEach(usuario => {
          if (usuario.divida) {
            usuario.divida.data = new Date(usuario.divida.data);
          }
        });

        console.log(data)
      });
  }

  public showDialogToAdd(): void {
    this.newUsuario = true;
    this.usuario = {};
    this.displayDialog = true;
  }

  public save(): void {
    this.usuario.divida.usuarioId = this.usuario.id;
    let msg = "Dívida cadastrada";
    if (this.usuario.divida.id) {
      msg = "Dívida alterada"
    }
    this.usuarioService.salvar(this.usuario).subscribe(data => {
      this.usuario = data;
      this.messageService.add({ severity: 'success', summary: 'Sucesso', detail: msg });
      this.buscarUsuarios();
    })
    this.usuario = null;
    this.displayDialog = false;
  }

  public delete(): void {
    // let index = this.usuarios.indexOf(this.selectedUsuario);
    // this.usuarios = this.usuarios.filter((val, i) => i != index);
    this.usuarioService.deletar(this.selectedUsuario.divida.id).subscribe(res => {
      this.messageService.add({ severity: 'success', summary: 'Sucesso', detail: "Dívida deletada" });
    });
    this.buscarUsuarios();
    this.usuario = new UsuarioModel();
    this.displayDialog = false;
  }

  public onRowSelect(event): void {
    this.newUsuario = false;
    this.usuario = this.cloneUsuario(event.data);
    if (!this.usuario.divida) {
      this.usuario.divida = new Divida();
    }
    this.displayDialog = true;
  }

  public cloneUsuario(c: UsuarioModel): UsuarioModel {
    let usuario = {};
    for (let prop in c) {
      usuario[prop] = c[prop];
    }
    return usuario;
  }
}
