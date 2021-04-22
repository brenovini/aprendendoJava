package com.example.demo;

public class CadastrarLivros {
    public void cadastrar(String titulo, int paginas, String autor){
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setPaginas(paginas);
        BancoSingleton.getInstance().salvarLivro(livro);
    }

}
