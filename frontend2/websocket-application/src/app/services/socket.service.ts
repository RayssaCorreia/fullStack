import { Injectable } from '@angular/core';
import { PADOLabsMessage } from '../models/padolabsMessage'


@Injectable({
  providedIn: 'root'
})
export class SocketService 
{

  private padolabsMessages: PADOLabsMessage[] = []; 
  private socket: WebSocket | undefined; 

  constructor() {}

  public getMessage(): PADOLabsMessage[] {
    return this.padolabsMessages;
  }

  public openConnection(){

    this.socket = new WebSocket("ws://172.16.107.194:7000/chat/")
    this.socket.onopen = (event) => {
      console.log(event);
    }

    this.socket.onmessage = (event) => {
      console.log(event.data);
      JSON.parse(event.data)
      const padoMessage = JSON.parse(event.data)
      this.padolabsMessages.push(padoMessage);
    }

    this.socket.onclose = (event) => {
      console.log(event);
    }
  }


  public sendMessage(padolabsMessage: PADOLabsMessage)
  {
     this.socket?.send(JSON.stringify(padolabsMessage)) 
  }

  public closeConnection()
  {
    this.socket?.close();
  }
}