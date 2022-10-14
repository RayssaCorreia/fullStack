package dev.rayssa.webcidades.Geo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class GeoController {

    @GetMapping("/regioes/{token}")
    public String Regioes(@PathVariable String token){ // retornar um 200
        return "Retornar as cidades por região"; // Adicionar no banco de dados essa opção, para fazer uma filtragem
    }

    @GetMapping("/home/{token") // Arrrumar o nome paginas no arquivo do Henrique
    public String Cidades(@PathVariable String token){
        return "Retornar as regiõe com a descrição completa 2° página de cidades"; // Carregar só uma vez a tela
    }
}