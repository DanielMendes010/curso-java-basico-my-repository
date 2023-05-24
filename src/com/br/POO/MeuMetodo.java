package com.br.POO;

import java.util.Scanner;

public class MeuMetodo {
    public static int numero1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos fazer uma pequena soma? Digite um número: ");
        int numero1 = input.nextInt();

        return numero1;
    }

    public static int numero2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();

        return numero2;
    }

    public static int soma() {
        return numero1() + numero2();
    }

    public static void main(String[] args) {
        System.out.println("O resultado é: " + soma());
    }
}
