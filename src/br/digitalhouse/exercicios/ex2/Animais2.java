package br.digitalhouse.exercicios.ex2;

import java.util.ArrayList;
import java.util.List;

public class Animais2 {
    public static void main(String[] args) {

        try {
            List<String> animaisDeNovo = new ArrayList<>(null);
            animaisDeNovo.add("Pato");
            animaisDeNovo.add("Cachorro");
            animaisDeNovo.add("Gato");
            System.out.println(animaisDeNovo.get(2));
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro: " + ex.getMessage());
            ex.printStackTrace();
        }

        try {
            List<String> animaisDeNovo = new ArrayList<>();
            animaisDeNovo.add("Pato");
            animaisDeNovo.add("Cachorro");
            animaisDeNovo.add("Gato");
            System.out.println(animaisDeNovo.get(5));
        } catch (Exception ex) {
            System.out.println("Posição inválida na lista! Ocorreu o erro: " + ex.getMessage());
            ex.printStackTrace();
        }


    }
}
