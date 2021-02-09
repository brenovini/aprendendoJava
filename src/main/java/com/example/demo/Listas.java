package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        String alex;
        int inteiro;
        boolean verdadeiroOuFalso;

        List<String> nomes = new ArrayList<>();
        nomes.add("alex");
        nomes.add("breno");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1) ;
        numeros.add(2) ;
        numeros.add(3) ;
        for (Integer numero : numeros) {
            System.out.println(numero);

        }

    }
}
