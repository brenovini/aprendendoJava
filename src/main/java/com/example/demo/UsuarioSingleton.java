package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioSingleton {

    private static UsuarioSingleton INSTANCE;
    private List<Usuario> usuarios = new ArrayList<>();

    private UsuarioSingleton() {
    }

    public static UsuarioSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UsuarioSingleton();
        }
        return INSTANCE;

    }

    public void adicionar(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
