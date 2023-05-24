package com.br.POO.ExerciciosComVetoresEArraysMultidimensionais;

import java.util.Scanner;

public class CapturaDeNumerosParesEImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] valores = new int[3][3];

        System.out.println("Digites os valores do Array: ");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.printf(valores[i][j] + " ");
            }
        }

        System.out.println();

        int quantidadePares = 0;
        int quantidadeImpares = 0;
        System.out.println("Números pares: ");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (valores[i][j] % 2 == 0) {
                    System.out.print(valores[i][j] + " ");
                    quantidadePares++;
                }
            }
        }
        System.out.println();

        System.out.println("Números impares: ");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (valores[i][j] % 2 != 0) {
                    System.out.print(valores[i][j] + " ");
                    quantidadeImpares++;
                }
            }
        }

        System.out.println();

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números impares: " + quantidadeImpares);
    }
}
