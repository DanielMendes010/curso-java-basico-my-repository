package com.br.POO.ExerciciosComVetoresEArraysMultidimensionais;

import java.util.Random;

public class MaiorNumeroEPosicao {
    public static void main(String[] args){
        int [][] numeroAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < numeroAleatorios.length; i++){
            for (int j = 0; j < numeroAleatorios.length; j++){
                numeroAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int col = 0;
        for (int i = 0; i < numeroAleatorios.length; i++){
            for (int j = 0; j < numeroAleatorios[i].length; j++){
                if (numeroAleatorios[i][j] > maior){
                    maior = numeroAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }

        for (int i = 0; i < numeroAleatorios.length; i++){
            for (int j = 0; j < numeroAleatorios[i].length; j++){
                System.out.print(numeroAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + col);
    }
}
