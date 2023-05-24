package com.br.POO.ExerciciosComConstrutoresEncapsulamentoESobrecarga;

import java.util.Scanner;

public class TestaJogoDaVelha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JogoDaVelhaComConstrutor jogoDaVelhaComConstrutor = new JogoDaVelhaComConstrutor();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if (jogoDaVelhaComConstrutor.vezJogador1()) {

                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else {

                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
                sinal = 'O';
            }

            linha = valor("Linha", input);
            coluna = valor("Coluna", input);

            if (!jogoDaVelhaComConstrutor.validarJogada(linha, coluna, sinal)) {
                System.out.println("Posição já usada, tente novamente");
            }

            jogoDaVelhaComConstrutor.imprimirTabuleiro();

            if (jogoDaVelhaComConstrutor.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if (jogoDaVelhaComConstrutor.verificarGanhador('0')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if (jogoDaVelhaComConstrutor.getJogada() > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }
        }
    }

    static int valor(String tipoValor, Scanner input) {
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida) {
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = input.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
            valor--;
            return valor;
    }
}
