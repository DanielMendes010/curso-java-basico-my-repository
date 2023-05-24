package com.br.POO.ExerciciosComVariaveisEMetodosEstaticos;

import java.util.Scanner;

public class CalculadoraComVariaveisEMetodosEstaticos {

    public static int somar(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static int subtrair(int numero1, int numero2){
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }

    public static int dividir(int numero1, int numero2){
        return numero1 / numero2;
    }

    public static double elevarAPotencia(double numero1, double numero2){
        return Math.pow(numero1, numero2);
    }

    public static double calcularFatorial() {
        Scanner numeroFatorial = new Scanner(System.in);
        double numero1 = informarNumeroFatorial(numeroFatorial.nextDouble());
        double numero2;

        numero2 = numero1;

        while (numero1 > 1){
            numero2 = numero2*(numero1-1);
            numero1--;
        }
            return numero2;
    }

    private static double informarNumeroFatorial(double numeroFatorial){
        return numeroFatorial;
    }
}
