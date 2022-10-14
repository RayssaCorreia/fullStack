package dev.rayssa.socket.configurations;

import dev.rayssa.socket.handler.ChatRoom;
import dev.rayssa.socket.handler.HandshakeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class SocketConfiguration implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.addHandler(chatRoom(), "/chat/*")
                .setAllowedOrigins("*")
                .addInterceptors(handshakeInterceptor());
    }

    @Bean
    public HandshakeInterceptor handshakeInterceptor(){
        return new HandshakeInterceptor();
    }

    @Bean
    public ChatRoom chatRoom(){
        return  new ChatRoom();
    }
}
