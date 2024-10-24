package com.santana.java.back.end.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // método simples que, quando chamado pelobrowser, retornará uma mensagem para o
                // usuário
public class UserController {
    @GetMapping("/") // que retornará uma mensagem simples para o usuario

    public String getMensagem() {
        return "katty baixinha katty baixinha katty baixinha katty baixinha";
    }
}
