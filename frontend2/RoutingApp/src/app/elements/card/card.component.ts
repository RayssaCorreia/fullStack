import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit {

  private title: string = '';

  private data: PADOinterface [] = [
    {
      id:1,
      title:'FED-201', 
      imageUrl: 'assets/fde201_grande.png',
      descricao:'FECHADURA DIGITAL DE EMBUTIR',
      especificacao:'gbdbdbg'
    },
    {
      id:2,
      title:'FED-201R', 
      imageUrl: 'assets/fde201r_grande.png',
      descricao: 'FECHADURA DIGITAL DE EMBUTIR ROLLETE',
      especificacao:'gbdbdbg'
    },
    {
      id:3,
      title:'FED-300w', 
      imageUrl: 'assets/fde300w_grande.png',
      descricao: 'FECHADURA DIGITAL DE EMBUTIR',
      especificacao:'gbdbdbg'
    },
    {
      id:4,
      title:'FED-500pro', 
      imageUrl: 'assets/fde500pro_grande.png',
      descricao: 'FECHADURA DIGITAL DE EMBUTIR',
      especificacao:'gbdbdbg'
    },
    {
      id:7,
      title:'FDE-600W', 
      imageUrl: 'assets/unknown.png',
      descricao: 'FECHADURA DIGITAL DE EMBUTIR',
      especificacao:'gbdbdbg'
    },
    {
      id:5,
      title:'FES-10', 
      imageUrl: 'assets/fds10_grande.png',
      descricao: 'FECHADURA DIGITAL DE SOBREPOR',
      especificacao:'gbdbdbg'
    },
    {
      id:6,
      title:'FES-101', 
      imageUrl: 'assets/fds101_grande.png',
      descricao: 'FECHADURA DIGITAL DE SOBREPOR',
      especificacao:'gbdbdbg'
    },
    {
      id:8,
      title:'FEV-200', 
      imageUrl: 'assets/fdv200_grande.png',
      descricao: 'FECHADURA DIGITAL PARA VIDRO',
      especificacao:'gbdbdbg'
    }
  ];

  constructor() { }

  ngOnInit(): void {}

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
  
}

//? INTERFACE
interface PADOinterface{
  id: number;
  title: string;
  imageUrl: string;
  descricao: string;
  especificacao: string;
}
