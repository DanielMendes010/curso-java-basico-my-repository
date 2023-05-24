package com.br.POO.ExerciciosComMetodos;

public class TestaLampada {
    public static void main(String[] args){
        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}
