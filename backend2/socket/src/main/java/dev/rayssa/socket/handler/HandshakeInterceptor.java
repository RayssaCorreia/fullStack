package dev.rayssa.socket.handler;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;
import java.util.Random;

public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {

//        attributes.put("user", "rayssa");
//        attributes.put("user", getSuperHero());
//        String path = request.getURI().getPath();
//        System.out.println(path);
//        String ticketId = path.substring(path.
//        String ticketId = path.substring(path.substring('/') + 1);

        String uri = request.getURI().toString();
        String username = uri.substring(uri.lastIndexOf('/') + 1);

        if(username.equalsIgnoreCase("")) attributes.put("user", getSuperHero());
        else attributes.put("user", username);

        return super.beforeHandshake(request, response, wsHandler, attributes);
    }

    protected String getSuperHero() {

        String[] superheros = {"Superman", "The Flash", "Wonder Woman", "Hulk", "Batman"};

        Random random = new Random();

        return superheros[random.nextInt(superheros.length)];
    }
}
