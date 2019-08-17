package br.digitalhouse.exercicios.ex1;

import java.util.ArrayList;
import java.util.List;

public class Animais {
    public static void main(String[] args) {

        List<String> animais = new ArrayList<>();

        try {
            animais.add("Pato");
            animais.add("Cachorro");
            animais.add("Gato");
            System.out.println(animais.get(3));
        } catch (Exception ex) {
            System.out.println("Posição inválida na lista! Ocorreu o erro: " + ex.getMessage());
            ex.printStackTrace();
        }


    }
}
