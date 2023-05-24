package com.br.POO.ExerciciosComDoDoWhileEFor;

import java.util.Scanner;

public class NumerosEntreDoisNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int ultimoNumero = input.nextInt();

        System.out.println("Os números entre " + primeiroNumero + " e " + ultimoNumero + " são: ");
        for (i = primeiroNumero; i < ultimoNumero; i++) {
        System.out.println(i);
        }
    }
}
