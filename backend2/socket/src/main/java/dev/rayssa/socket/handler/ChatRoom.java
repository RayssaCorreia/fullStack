package dev.rayssa.socket.handler;

import com.google.gson.Gson;
import dev.rayssa.socket.models.PADOLabsMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.util.*;

public class ChatRoom extends AbstractWebSocketHandler {

    public final static List<WebSocketSession> sessionList = Collections.synchronizedList(new ArrayList<>());

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        System.out.println("NEW SESSION CREATED...");
        sessionList.add(session);

//        session.sendMessage((new TextMessage(("Voce Logouuu " + "seu usuário é o: " + session.getAttributes().get("user").toString()))));

        for(WebSocketSession webSocketSession: sessionList) {
            webSocketSession.sendMessage(new TextMessage("{\"user\":\" " + session.getAttributes().get("user").toString() + "\",\"message\":\" " + "OPA CHEGUEI !!" +" \"}"));
        }

        session.sendMessage(new TextMessage("{\"user\":\" " + session.getAttributes().get("user").toString() + "\",\"message\":\" " + getRandomMessage() +" \"}"));

        //TODO CHECK IF NEEDED
        super.afterConnectionEstablished(session);
    }

        private String getRandomMessage()
    {
        String[] messages = {"Cai de paraquedas no servidor!", "To na area", "É hora do jogo!"};
        Random random = new Random();
        return messages[random.nextInt(messages.length)];
    }

    @Override
    protected void handleTextMessage(WebSocketSession mySession, TextMessage message) throws Exception {

        Gson gson = new Gson();
        PADOLabsMessage padoLabsMessage = gson.fromJson(message.getPayload(), PADOLabsMessage.class);

        System.out.println(padoLabsMessage);
        if(padoLabsMessage.getUser().equalsIgnoreCase(""))
        {
            for(WebSocketSession targetSession: sessionList)
            {
                targetSession.sendMessage(new TextMessage("{\"user\":\" "
                        + mySession.getAttributes().get("user").toString()
                        + "\",\"message\":\" " + padoLabsMessage.getMessage() +" \"}"));            }
        }

        for(WebSocketSession targetSession: sessionList)
        {
            if(targetSession.getAttributes().get("user").toString().equalsIgnoreCase(padoLabsMessage.getUser()))
            {
                targetSession.sendMessage(new TextMessage("{\"user\":\" "
                        + mySession.getAttributes().get("user").toString()
                        + "\",\"message\":\" " + padoLabsMessage.getMessage() +" \"}"));
            }
        }
        super.handleTextMessage(mySession, message);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {

        sessionList.remove(session);
        System.out.println("SESSION: ");
        sessionList.forEach(webSocketSession ->
                System.out.println(webSocketSession.getAttributes().get("user").toString())
        );

        System.out.println("#####################################################");

        for (WebSocketSession webSocketSession : sessionList) {
            webSocketSession.sendMessage(new TextMessage("{\"user\":\" " + session.getAttributes().get("user").toString() + "\",\"message\":\" " + "FUI!!" +" \"}"));
        }
        super.afterConnectionClosed(session, status);

    }
}



