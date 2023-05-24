package com.br.POO.ExerciciosComMetodos;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso: ");
        aluno.curso = scan.next();

        System.out.println("Entre com a matrícula: ");
        aluno.matricula = scan.next();

        for (int i = 0; i<aluno.disciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.disciplinas[i] = scan.next();
        }

        for (int i = 0; i<aluno.nota.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.disciplinas[i]);
            for (int j = 0; j<aluno.nota[i].length; j++) {
                System.out.println("Entre com a nota " + (j+1));
                aluno.nota[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i<aluno.disciplinas.length; i++) {
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - reprovado");
            }
        }
    }
}
