package com.br.POO.ExerciciosComConstrutoresEncapsulamentoESobrecarga;

public class TestaLampadaComConstrutor {
    public static void main(String[] args){
        LampadaComConstrutor lampadaComConstrutor = new LampadaComConstrutor();

        System.out.println("Detalhes da lâmpada: ");
        lampadaComConstrutor.setModelo("Incandescente");
        lampadaComConstrutor.setTensao("127V");
        lampadaComConstrutor.setPotencia(42);
        lampadaComConstrutor.setCor("Amarela");

        System.out.println(lampadaComConstrutor.getModelo());
        System.out.println(lampadaComConstrutor.getTensao());
        System.out.println(lampadaComConstrutor.getPotencia());
        System.out.println(lampadaComConstrutor.getCor());

        System.out.println();

        System.out.println("Estado da lâmpada: ");
        lampadaComConstrutor.ligar();
        lampadaComConstrutor.mostrarEstado();

        lampadaComConstrutor.desligar();
        lampadaComConstrutor.mostrarEstado();

        lampadaComConstrutor.mudarEstado();
        lampadaComConstrutor.mostrarEstado();

    }
}
