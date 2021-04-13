package com.example.demo;

public class Revisao {

    public static void main(String[] args) {
        String tipoAlfanumerico = "letras como numeros 1234";
        int inteiro = 1234;
        boolean verdadeiroOuFalso = true;

        System.out.println(tipoAlfanumerico);
        System.out.println(inteiro);
        System.out.println(verdadeiroOuFalso);

        String valor = nomeMetodo(3);
        System.out.println(valor);

    }

    private static String nomeMetodo(int numero) {
        if (numero == 1) {
            return "um";
        } else if (numero == 2) {
            return "dois";
        } else {
            return "outro numero";
        }
    }
}
