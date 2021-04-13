package com.example.demo;

import com.example.demo.model.RequestLogin;
import com.example.demo.model.RequestRegister;
import com.example.demo.model.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Request {

    @GetMapping
    public Carro ola(){
        Carro carro = new Carro();
        carro.setAno(2020);
        carro.setModelo("ARGOS");
        return carro;
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return UsuarioSingleton.getInstance().getUsuarios();
    }

    @PostMapping
    public ResponseEntity<ResponseMessage> login(@RequestBody RequestLogin requestLogin){
       Validate validate = new Validate();
        String message = validate.execute(requestLogin.getUsername(), requestLogin.getPassword());
        ResponseMessage responseMessage = new ResponseMessage(message);
        if (!"login realizado com sucesso".equals(message)) {
            return new ResponseEntity<>(responseMessage, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);

    }

    @PostMapping("/register")
    public ResponseEntity<ResponseMessage> register(@RequestBody RequestRegister requestRegister){
        System.out.println(requestRegister.getUsername() + " - " + requestRegister.getPassword() + " - " + requestRegister.getPassword2());
        CadastrarUsuario cadastrarusuario = new CadastrarUsuario();
        String mensagem = cadastrarusuario.cadastrar(requestRegister.getUsername(),requestRegister.getPassword(),requestRegister.getPassword2());
        ResponseMessage responseMessage = new ResponseMessage(mensagem);
        return new ResponseEntity<>(responseMessage, HttpStatus.CREATED);
    }

    @GetMapping("/livros")
    public List<Livro> getLivros(){
        return new ArrayList<>();
    }
}
