import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { PageNotFoundComponent } from './error/page-not-found/page-not-found.component';
import { ChildAComponent } from './first/children/child-a/child-a.component';
import { ChildBComponent } from './first/children/child-b/child-b.component';

const routes: Routes = [
  {path: 'first-component', title: 'First Component', component: FirstComponent, children:[
    {path: 'child-a', title: 'Child A Component', component: ChildAComponent},
    {path: 'child-b', title: 'Child B Component', component: ChildBComponent}
  ]},
  {path: 'second-component', component: SecondComponent},
  {path: '**', component: PageNotFoundComponent},
  {path: '', redirectTo: '/first-component', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
