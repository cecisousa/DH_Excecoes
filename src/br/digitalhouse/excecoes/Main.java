package br.digitalhouse.excecoes;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("João");
            lista.add("Jessica");
            lista.add("Tarantino");

            System.out.println(lista.get(2));
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro: " + ex.getMessage());
//            ex.printStackTrace();
        }

        Integer soma = 0;

        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setRg(123456);
//            System.out.println(pessoa.getRg() + 1000);
            soma = pessoa.getRg() + 1000;
            System.out.println(soma);
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
//            System.out.println("Obrigamos o código a printar esse texto");
            if (soma > 2) {
                System.out.println("A soma é maior que 2");
            } else {
                System.out.println("A soma é menor que 2");
            }
        }

        System.out.println("Printamos após o finally porque ainda estamos no  método main");
    }
}
