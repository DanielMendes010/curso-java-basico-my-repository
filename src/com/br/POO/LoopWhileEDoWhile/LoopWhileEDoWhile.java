package com.br.POO.LoopWhileEDoWhile;

public class LoopWhileEDoWhile {
    public static void main(String[] args){

        int i = 1; //ou count ou cont para nome de variaveis que são contadores
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++; //i++ é mesma coisa de i = i+1 ou i += 1
        }

        System.out.println(i); //valor de 11

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);

        System.out.println(i);
    }
}
