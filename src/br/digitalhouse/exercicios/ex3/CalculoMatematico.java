package br.digitalhouse.exercicios.ex3;

public class CalculoMatematico {

    private Integer dividendo;
    private Integer divisor;

    public Integer getDividendo() {
        return dividendo;
    }

    public Integer getDivisor() {
        return divisor;
    }

    public void setDividendo(Integer dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(Integer divisor) {
        this.divisor = divisor;
    }

    public Integer divisao(Integer dividendo, Integer divisor) throws ArithmeticException {
        Integer divisao = 0;

        if (divisor == 0){
        throw new ArithmeticException("Estou usando do ArithmeticException");
    } else {
        divisao = dividendo/divisor;
    }
        return divisao;
    }
}
