package com.br.POO.ExerciciosComConstrutoresEncapsulamentoESobrecarga;

import java.util.Scanner;

public class TestaAlunoComConstrutor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AlunoComConstrutor alunoComConstrutor = new AlunoComConstrutor();

        System.out.println("Entre com o nome do aluno: ");
        alunoComConstrutor.setNome(scan.nextLine());

        System.out.println("Entre com o nome do curso: ");
        alunoComConstrutor.setCurso(scan.nextLine());

        System.out.println("Entre com a matrícula: ");
        alunoComConstrutor.setMatricula(scan.nextLine());

        for (int i = 0; i < alunoComConstrutor.getDisciplina().length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            alunoComConstrutor.setDisciplinaPos(i, scan.nextLine());
        }

        for (int i = 0; i < alunoComConstrutor.getNota().length; i++) {
            System.out.println("Obtendo notas da disciplina " + alunoComConstrutor.getDisciplina()[i]);
            for (int j = 0; j < alunoComConstrutor.getNota()[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                alunoComConstrutor.setNotaPosIJ(i, j, scan.nextDouble());
            }
        }

        alunoComConstrutor.mostrarInfo();

        for (int i = 0; i < alunoComConstrutor.getDisciplina().length; i++) {
            if (alunoComConstrutor.verificarAprovado(i)) {
                System.out.println("Disciplina " + alunoComConstrutor.getDisciplina()[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + alunoComConstrutor.getDisciplina()[i] + " - reprovado");
            }
        }
    }
}
