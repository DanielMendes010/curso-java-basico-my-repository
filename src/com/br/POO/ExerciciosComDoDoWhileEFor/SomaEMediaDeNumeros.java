package com.br.POO.ExerciciosComDoDoWhileEFor;

import java.util.Scanner;

public class SomaEMediaDeNumeros {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i;
//        System.out.println("Digite 5 números e veja a soma e nédia deles");
//        System.out.print("Número " + i + ": ");
        int numero;
        int soma = 0;
        int media = 0;

//        soma = soma + numero;
//        media = media + numero/4;

        for(i = 1; i <= 5; i++){
            System.out.print("Número " + i + ": ");
            numero = input.nextInt();

            soma = soma + numero;
            media = media + numero/4;
        }
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}
