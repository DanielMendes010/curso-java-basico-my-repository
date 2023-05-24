package com.br.POO.ExerciciosComVetoresEArraysMultidimensionais;

public class VetorAeBComMesmosElementosMulplicadoPelaSuaPosicao {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

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
        vetorA[10] = 15;
        vetorA[11] = 3;
        vetorA[12] = 72;
        vetorA[13] = 80;
        vetorA[14] = 8;

        vetorB[0] = vetorA[0] * 0;
        vetorB[1] = vetorA[1] * 1;
        vetorB[2] = vetorA[2] * 2;
        vetorB[3] = vetorA[3] * 3;
        vetorB[4] = vetorA[4] * 4;
        vetorB[5] = vetorA[5] * 5;
        vetorB[6] = vetorA[6] * 6;
        vetorB[7] = vetorA[7] * 7;
        vetorB[8] = vetorA[8] * 8;
        vetorB[9] = vetorA[9] * 9;
        vetorB[10] = vetorA[10] * 10;
        vetorB[11] = vetorA[11] * 11;
        vetorB[12] = vetorA[12] * 12;
        vetorB[13] = vetorA[13] * 13;
        vetorB[14] = vetorA[14] * 14;

        System.out.println("Valor do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("Valor do vetor B: ");
        for (int j = 0; j < vetorB.length; j++) {
            System.out.println(vetorB[j]);
        }
    }
}

