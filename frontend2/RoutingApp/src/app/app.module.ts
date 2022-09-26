import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ElementsModule } from './elements/elements.module';
import { HomeComponentComponent } from './home-component/home-component.component';
import { NotFoutComponent } from './not-fout/not-fout.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponentComponent,
    NotFoutComponent,
  
  ],
  imports: [
    BrowserModule,
    ElementsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
