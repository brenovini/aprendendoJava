package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class BancoSingleton {

    private static BancoSingleton INSTANCE;
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();

    private BancoSingleton() {
    }

    public static BancoSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BancoSingleton();
        }
        return INSTANCE;

    }

    public void adicionar(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void salvarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
