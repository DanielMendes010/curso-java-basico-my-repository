package com.br.POO.VariaveisEMetodosEstaticos;

public class TesteCalculadoraComVariavelEMetodoEstatico {

    static int resultSoma;

    public static void main(String[] args){

        resultSoma = MinhaCalculadoraComVariavelEMetodoEstatico.soma(1, 1);

        System.out.println(MinhaCalculadoraComVariavelEMetodoEstatico.soma(3,4));
        System.out.println(MinhaCalculadoraComVariavelEMetodoEstatico.soma(1.0, 4.8));
        System.out.println(MinhaCalculadoraComVariavelEMetodoEstatico.soma(5, 5, 3));
        System.out.println(MinhaCalculadoraComVariavelEMetodoEstatico.soma(new int[]{3,4}));

        soma2Valores(53, 32);
    }

    static int soma2Valores(int num1, int num2) {
        return MinhaCalculadoraComVariavelEMetodoEstatico.soma(num1, num2);
    }
}
