package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CadastrarLivros {
    public void cadastrar(String titulo,int paginas,String autor){
            Livro livro = new Livro();
            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setPaginas(paginas);
        List<Livro>livros= new ArrayList<>();
        livros.add(livro);
    }
}
