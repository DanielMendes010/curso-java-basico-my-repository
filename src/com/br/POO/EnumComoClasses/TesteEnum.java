package com.br.POO.EnumComoClasses;

public class TesteEnum {

    public static void main(String[] args){

        DiaSemanaComConstrutor diaSemanaComConstrutor = DiaSemanaComConstrutor.SEGUNDA;

        System.out.println(diaSemanaComConstrutor.toString() + " - " + diaSemanaComConstrutor.getValor());

        Data data = new Data(1, 4, 2016, DiaSemanaComConstrutor.SEXTA);
    }
}
