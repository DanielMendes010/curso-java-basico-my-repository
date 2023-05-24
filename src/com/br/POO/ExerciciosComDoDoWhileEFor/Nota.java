package com.br.POO.ExerciciosComDoDoWhileEFor;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Insira um valor: ");
            double nota = input.nextInt();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Nota: " + nota);
            } else {
                System.out.println("Insira um valor válido!");
            }
        } while (!notaValida);

    }
}
