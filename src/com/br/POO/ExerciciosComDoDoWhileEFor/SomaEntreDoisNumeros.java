package com.br.POO.ExerciciosComDoDoWhileEFor;

import java.util.Scanner;

public class SomaEntreDoisNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int ultimoNumero = input.nextInt();
        int soma = 0;

        for (i = primeiroNumero; i < ultimoNumero; i++) {
            soma += i;
        }

        System.out.println("Soma: " + soma);
    }
}
