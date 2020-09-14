import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './agenda/login/login.component';
import { AgendaComponent } from './agenda/agenda.component';

const routes: Routes = [
    { path: 'login', component: LoginComponent },
    { path: 'agenda', component: AgendaComponent }, 
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }