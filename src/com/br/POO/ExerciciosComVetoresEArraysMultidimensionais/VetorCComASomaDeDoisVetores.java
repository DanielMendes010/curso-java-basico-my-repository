package com.br.POO.ExerciciosComVetoresEArraysMultidimensionais;

public class VetorCComASomaDeDoisVetores {
    public static void main(String[] args){
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        vetorA[0] = 22;
        vetorA[1] = 6;
        vetorA[2] = 9;
        vetorA[3] = 2;
        vetorA[4] = 52;
        vetorA[5] = 1;
        vetorA[6] = 5;
        vetorA[7] = 90;
        vetorA[8] = 12;
        vetorA[9] = 23;

        vetorB[0] = 24;
        vetorB[1] = 8;
        vetorB[2] = 10;
        vetorB[3] = 33;
        vetorB[4] = 5;
        vetorB[5] = 1;
        vetorB[6] = 66;
        vetorB[7] = 90;
        vetorB[8] = 12;
        vetorB[9] = 99;

        vetorC[0] = vetorA[0] + vetorB[0];
        vetorC[1] = vetorA[1] + vetorB[1];
        vetorC[2] = vetorA[2] + vetorB[2];
        vetorC[3] = vetorA[3] + vetorB[3];
        vetorC[4] = vetorA[4] + vetorB[4];
        vetorC[5] = vetorA[5] + vetorB[5];
        vetorC[6] = vetorA[6] + vetorB[6];
        vetorC[7] = vetorA[7] + vetorB[7];
        vetorC[8] = vetorA[8] + vetorB[8];
        vetorC[9] = vetorA[9] + vetorB[9];

        System.out.println("Valor de vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i]);
        }

        System.out.println("Valor de vetor B: ");
        for (int j = 0; j < vetorB.length; j++){
            System.out.println(vetorB[j]);
        }

        System.out.println("Valor de vetor C: ");
        for (int k = 0; k < vetorC.length; k++){
            System.out.println(vetorC[k]);
        }
    }
}
