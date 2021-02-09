package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Validate {
    /**
     * Validar as informacoes de login
     * Quando o usuario for alex e a senha for 147 retornar sucesso
     * Se o usuario for alex mas a senha estiver errada retornar senha invalida
     * Se o usuario for diferente de alex retornar usuario inexistente
     * @return
     * @param uname
     * @param psw
     */
    public String execute(String uname, String psw) {
        if ("alex".equals(uname)&& "147".equals(psw) ){
            return "login realizado com sucesso";
        } else if ("alex".equals(uname)&& !"147".equals(psw)){
            return "usuario ou senha incorreto";
        }else if (!"alex".equals(uname)){
            return "usuario invalido";
        }

        return null;
    }
}
