import { UsuarioComponent } from "./usuario.component";
import { RouterModule, Routes } from '@angular/router';
import { CadastroComponent } from './cadastro/cadastro.component';

const routes: Routes = [
    {
        path: 'usuario-consulta',
        component: UsuarioComponent
    },
    {
        path: 'usuario-cadastro',
        component: CadastroComponent
    },
    {
        path: 'usuario-edicao/:codigo'
    }
];