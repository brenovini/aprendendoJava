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
    public String post(@RequestParam String uname, @RequestParam String psw){
       Validate validate = new Validate();
       return validate.execute(uname, psw);

    }
}
