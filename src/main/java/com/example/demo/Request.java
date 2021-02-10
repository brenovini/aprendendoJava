package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Request {

    @GetMapping
    public Carro ola(){
        Carro carro = new Carro();
        carro.setAno(2020);
        carro.setModelo("ARGOS");
        return carro;
    }

    @PostMapping
    public String login(@RequestParam String uname, @RequestParam String psw){
       Validate validate = new Validate();
       return validate.execute(uname, psw);

    }

    @PostMapping("/register")
    public String register(@RequestParam String usuario, @RequestParam String senha, @RequestParam String senha2){
        System.out.println(usuario + " - " + senha + " - " + senha2);
        return "sucesso!";
    }
}
