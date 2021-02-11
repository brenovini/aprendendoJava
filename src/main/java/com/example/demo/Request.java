package com.example.demo;

import com.example.demo.model.RequestLogin;
import com.example.demo.model.ResponseLogin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ResponseLogin> login(@RequestBody RequestLogin requestLogin){
       Validate validate = new Validate();
        String message = validate.execute(requestLogin.getUsername(), requestLogin.getPassword());
        ResponseLogin responseLogin = new ResponseLogin(message);
        if (!"login realizado com sucesso".equals(message)) {
            return new ResponseEntity<>(responseLogin, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(responseLogin, HttpStatus.OK);

    }

    @PostMapping("/register")
    public String register(@RequestParam String usuario, @RequestParam String senha, @RequestParam String senha2){
        System.out.println(usuario + " - " + senha + " - " + senha2);
        return "sucesso!";
    }
}
