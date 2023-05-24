package com.br.POO.OverloadOuSobrecargaDeMetodosEConstrutores;

public class TesteCalculadora {
    public static void main(String[] args){

        MinhaCalculadora minhaCalculadora = new MinhaCalculadora();

        System.out.println(minhaCalculadora.soma(3,4));
        System.out.println(minhaCalculadora.soma(1.0, 4.8));
        System.out.println(minhaCalculadora.soma(5, 5, 3));
        System.out.println(minhaCalculadora.soma(new int[]{3,4}));
    }
}
