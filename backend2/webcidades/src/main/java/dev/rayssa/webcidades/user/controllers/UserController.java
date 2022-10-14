//#### RETORNOS DAS FUNÇÕES OBJETIVO FINAL ####/
package dev.rayssa.webcidades.user.controllers;
import dev.rayssa.webcidades.user.domains.InfoUsers;
import dev.rayssa.webcidades.user.models.request.RegisterUserRequest;
import dev.rayssa.webcidades.user.models.response.LoginUserResponse;
import dev.rayssa.webcidades.user.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController(value = "/")
public class UserController {

    @Autowired
    private UsersServices usersServices;

    Map<String, InfoUsers> userMap = new HashMap<>();

    @GetMapping ("/login") //Token
    private String Login(@RequestParam String email, String password){ // voltar um 200


        if(email.equals("banco de dados") && password.equals("banco de dados")){
            return  "testo aleatorio";
        }
        
        return "Conferir se o usuario está cadastrado e deixar o acesso ao app"; //fazer a requisição com query
    }

    @PostMapping ("/registro")
    private RegisterUserResponse Registro(@RequestBody RegisterUserRequest userRequest){ // voltar um 201

        return usersServices.saveUser(userRequest); // verificar o email, porque se já estiver não fazer o registro
    }

    @PutMapping("/meuperfio")
    private String AtualizacaoUsername(@RequestBody Object objectToEdit, @PathVariable String token){

        return "Fazer a atualização"; // fazer um LOG onde guardará todos os nomes já utilizado por esse úsuario - O USUARIO NÃO TERA ACESSO A ESSA INFORMAÇÃO
    }
}

