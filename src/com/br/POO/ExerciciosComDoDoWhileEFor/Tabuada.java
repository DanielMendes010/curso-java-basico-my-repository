package com.br.POO.ExerciciosComDoDoWhileEFor;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Digite a tabuada que você quer multiplicar: ");
        int tabuada = input.nextInt();

        input.close();

        System.out.println("Tabuada do " + tabuada + ": ");
        for(i = 0; i <= 10; i++){
            int calculo =  tabuada * i;
            System.out.println(tabuada + "x" + i + " = " + calculo);
        }
    }
}
