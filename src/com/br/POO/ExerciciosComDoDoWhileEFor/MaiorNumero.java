package com.br.POO.ExerciciosComDoDoWhileEFor;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        System.out.println("Digite 5 números e veja qual é o maior");
        System.out.print("Número " + i + ": ");
        int numero = input.nextInt();
        int maior = numero;

        for (i = 2; i <= 5; i++){
            System.out.print("Número " + i + ": ");
            numero = input.nextInt();

            if(numero >= maior){
                maior = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
    }
}
