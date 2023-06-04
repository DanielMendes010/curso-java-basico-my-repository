package com.br.POO.EnumValueEValueOf;

import com.br.POO.EnumComoClasses.DiaSemanaComConstrutor;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemanaComConstrutor[] diaSemanaComConstrutor = DiaSemanaComConstrutor.values();

        System.out.println("For tradicional:");
        for (int i = 0; i < diaSemanaComConstrutor.length; i++) {
            System.out.println(diaSemanaComConstrutor[i]);
        }

        System.out.println("\nFor simplificado:");
        for (DiaSemanaComConstrutor dia : DiaSemanaComConstrutor.values()) {
            System.out.println(dia);
        }
    }
}
