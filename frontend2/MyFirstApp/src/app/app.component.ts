import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  private title: string = '';

  private data: PADOinterface [] = [
    {
      id:1,
      title:'Test PADO ', 
      imageUrl: 'assets/pado.png'
    },
    {
      id:2,
      title:'Test PADO 2', 
      imageUrl: 'assets/pado.png'
    },
    {
      id:3,
      title:'Test PADO 3', 
      imageUrl: 'assets/pado.png'
    }
  ];

  private lista: Receita [] = [
    {
      foto: 'assets/Bolinho-de-pobre.png',
      nome: 'Bolinho de pobre',
      ingredientes:'1 xícara (chá) de farinha de trigo 1 pitada de sal<br>1 ovo ´\n´<br>1 xícara (chá) de água<br>1 colher (sopa) de queijo ralado<br>Óleo para fritar',
      preparo:'Em uma vasilha misture a farinha de trigo, o sal, o ovo, a água e o queijo ralado.<br>Misture bem até a massa ficar homogênea.<br>Em uma frigideira coloque 2 dedos de óleo, quando estiver bem quente, despeje colheradas da massa para fritar.<br>Pode ser frito em fogo alto.'
    }, 
    {
      foto: 'assets/Bolinho-de-pobre.png',
      nome: 'Bolinho de pobre',
      ingredientes:"1 xícara (chá) de farinha de trigo 1 pitada de sal<br>1 ovo<br>1 xícara (chá) de água<br>1 colher (sopa) de queijo ralado<br>Óleo para fritar",
      preparo: 'Em uma vasilha misture a farinha de trigo, o sal, o ovo, a água e o queijo ralado.<br>Misture bem até a massa ficar homogênea.<br>Em uma frigideira coloque 2 dedos de óleo, quando estiver bem quente, despeje colheradas da massa para fritar.<br>Pode ser frito em fogo alto.'
    }
  ] 


  constructor(){}

  //? geters & setters
  protected getTitle(){
    return this.title;
  }

  protected setTitle(event: any){
    // console.log(event.target.value);
    this.title = event.target.value;
  }

  protected getData(): PADOinterface []{
    return this.data;
  }

  protected getLista(): Receita []{
    return this.lista;
  }
}

//? INTERFACE
interface PADOinterface{
  id: number;
  title: string;
  imageUrl: string;
}

interface Receita{
  foto: string;
  nome: string;
  ingredientes: string;
  preparo:string;
}
