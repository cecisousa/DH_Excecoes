package br.digitalhouse.exercicios.ex3;

public class Teste {
    public static void main(String[] args) {

        CalculoMatematico conta = new CalculoMatematico();

        try {
            conta.divisao(4, 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
