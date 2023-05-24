package com.br.POO.ExerciciosComVetoresEArraysMultidimensionais;

import java.util.Scanner;

public class VetorAeBComMesmosElementos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = input.nextInt();

            vetorB[i] = vetorA[i];
        }

        System.out.print("Valores do vetor A: ");
        for (int f = 0; f < vetorA.length; f++){
            System.out.print(vetorA[f] + " ");
        }
        System.out.println();

        System.out.print("Valores do vetor B: ");
        for (int j = 0; j < vetorB.length; j++){
            System.out.print(vetorB[j] + " ");
        }
        System.out.println();
    }
}
