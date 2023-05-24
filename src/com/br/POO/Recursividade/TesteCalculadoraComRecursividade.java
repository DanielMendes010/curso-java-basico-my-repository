package com.br.POO.Recursividade;

public class TesteCalculadoraComRecursividade {

    public static void main(String[] args){

        int fatorialNR = CalculdadoraComRecursividade.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorial = CalculdadoraComRecursividade.fatorial(5);
        System.out.println(fatorial);
    }
}
