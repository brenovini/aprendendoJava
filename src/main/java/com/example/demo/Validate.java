package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.List;

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
        List<Usuario> usuarios = UsuarioSingleton.getInstance().getUsuarios();

        for (Usuario usuario  : usuarios) {

            if (usuario.getUsername().equals(uname)&& usuario.getPassword().equals(psw) ){
                return "login realizado com sucesso";
            }

        }
        return "usuario nao cadastrado";
    }
}
