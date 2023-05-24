package com.br.POO.ExerciciosComDoDoWhileEFor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Populacao2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat result = new DecimalFormat();

        double paisA;
        double paisB;
        double taxaA;
        double taxaB;
        boolean valido = false;

        do {
            System.out.println("Digite o número da População A: ");
            paisA = input.nextDouble();

            if (paisA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");
            }

        } while (!valido);

        valido = false;
        do {
            System.out.println("Digite o número da População B: ");
            paisB = input.nextDouble();

            if (paisB > 0) {
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0.");
            }

        } while (!valido);

        valido = false;
        do {
            System.out.println("Digite a taxa de crescimento da população A: ");
            taxaA = input.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento da população A precisa ser maior que 0.");
            }

        } while (!valido);

        valido = false;
        do {
            System.out.println("Digite a taxa de crescimento da população B: ");
            taxaB = input.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento da população B precisa ser maior que 0.");
            }

        } while (!valido);

        int cont = 0;

        while (paisA < paisB){

        paisA += (paisA/100) * taxaA;
        paisB += (paisB/100) * taxaB;
        cont++;
        }

        result.format(taxaA);
        result.format(taxaB);

        System.out.println("População A: " + paisA);
        System.out.println("População B: " + paisB);
        System.out.println("Quantidade de anos: " + cont);
        System.out.println();
        System.out.println("Irá levar " + cont + " anos até a população A ultrapassar a população B!");

    }
}
