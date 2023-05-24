package com.br.POO.ExerciciosComMetodos;

public class Aluno {
    String nome;
    String curso;
    String matricula;
    String[] disciplinas = new String[3];
    double[] [] nota = new double[3][4];

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i=0; i<nota.length; i++){
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j = 0; j<nota[i].length; j++) {
                System.out.print(nota[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice) {
        if (obterMedia(indice) >=7) {
            return true;
        }
        return false;
    }

    double obterMedia(int indice) {
        double soma = 0;

        for (int i = 0; i<nota[indice].length; i++) {
            soma += nota[indice][i];
        }

        double media = soma / 4;

        return media;
    }
}
