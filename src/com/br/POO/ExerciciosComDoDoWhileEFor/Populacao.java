package com.br.POO.ExerciciosComDoDoWhileEFor;

public class Populacao {
    public static void main(String[] args){
        int paisA = 80000;
        int paisB = 200000;
        int cont = 0;

        while (paisA < paisB) {

            paisA += (paisA/100) * 3;
            paisB += (paisB/100) * 1.5;
            cont++;
        }

        System.out.println("População A: " + paisA);
        System.out.println("População B: " + paisB);
        System.out.println("Quantidade de anos: " + cont);

    }
}
