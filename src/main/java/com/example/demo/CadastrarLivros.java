package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CadastrarLivros {
    public List<Livro>livros= new ArrayList<>();
    public List<Livro> cadastrar(String titulo, int paginas, String autor){
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setPaginas(paginas);
        livros.add(livro);
        return livros;
    }

    public void gerarLivros() {
        for (int i = 0; i<= 10; i++) {
            Livro livro = new Livro();
            livro.setTitulo("titulo");
            livro.setAutor("autor");
            livro.setPaginas(1);
            livros.add(livro);
        }
    }

}
