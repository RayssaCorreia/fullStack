import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CardComponent } from './elements/card/card.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { NotFoutComponent } from './not-fout/not-fout.component';

const routes: Routes = [
  { path: "home", component: HomeComponentComponent},
  { path: "card", component: CardComponent},
  { path: "", redirectTo: "/home", pathMatch: "full"},
  { path: "**", component: NotFoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
