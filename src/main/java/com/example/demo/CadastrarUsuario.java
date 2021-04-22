package com.example.demo;

public class CadastrarUsuario {
    /**
     * Validar se o usuario nao esta vazio (usuario nao informado)
     * Validar se a senha nao esta vazia(senha nao informada)
     * Validar se a confirmacaosenha nao esta vazia(confirmacaosenha nao informada)
     * Validar se a senha e igual a confirmacaosenha (a senha deve ser igual a confirmacaosenha)
     * @param usuario
     * @param senha
     * @param confirmarsenha
     * @return
     */
    public String cadastrar(String usuario, String senha, String confirmarsenha){
        String mensagem = "";
        if (usuario==null||"".equals(usuario)){
            mensagem = "usuario nao informado";
        }else if (senha==null||"".equals(senha)){
            mensagem = "senha nao informada";
        }else if (confirmarsenha==null||"".equals(confirmarsenha)){
            mensagem = "confirmarsenha nao informada";

        }else if (!senha.equals(confirmarsenha)){
            mensagem = "senha nao e igual confirmarsenha";
        }else {
            Usuario usuarioClass = new Usuario();
            usuarioClass.setUsername(usuario);
            usuarioClass.setPassword(senha);
            BancoSingleton.getInstance().adicionar(usuarioClass);
            mensagem = "usuario cadasrado com sucesso";
        }
        return mensagem;

    }
}
