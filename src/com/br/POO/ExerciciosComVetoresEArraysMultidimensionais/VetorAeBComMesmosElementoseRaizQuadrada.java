package com.br.POO.ExerciciosComVetoresEArraysMultidimensionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VetorAeBComMesmosElementoseRaizQuadrada {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com os valores da posição: " + i);
            vetorA[i] = input.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Valor do vetor A: ");
        for (int f = 0; f < vetorA.length; f++){
            System.out.print(vetorA[f] + " ");
        }
        System.out.println();

        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");

        System.out.print("Valor do vetor B: ");
        for (int j = 0; j < vetorB.length; j++){
            System.out.print(decimalFormat.format(vetorB[j]) + " ");
        }
        System.out.println();
    }
}
