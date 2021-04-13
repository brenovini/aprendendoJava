package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CadastrarLivros {
    public List<Livro> cadastrar(String titulo, int paginas, String autor){
        List<Livro>livros= new ArrayList<>();
        for (int i = 0; i<= 10; i++) {
            Livro livro = new Livro();
            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setPaginas(paginas);
            livros.add(livro);
        }

        return livros;
    }

}
