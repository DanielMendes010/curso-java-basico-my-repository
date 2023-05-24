package com.br.POO.ExerciciosComDoDoWhileEFor;

public class NumerosImpares {
    public static void main(String[] args){
        int i;
        int numero = 50;

        System.out.println("Liste todos os números impares de 1 até " + numero);

        System.out.println("O números são: ");
        for(i = 1; i <= numero; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
