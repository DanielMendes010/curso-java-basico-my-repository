package com.br.POO.ExerciciosComDoDoWhileEFor;

import java.util.Scanner;

public class ValidaPessoa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean nomeValido = false;
        boolean idadeValida = false;
        boolean salarioValido = false;
        boolean sexoValido = false;
        boolean estadoCivilValido = false;

        do {
            System.out.println("Digite seu nome: ");
            String nome = input.next();

            if (nome.length() > 3) {
                nomeValido = true;
                System.out.println("Nome: " + nome);
            } else {
                System.out.println("O nome precisa ter mais de 3 caracteres!");
            }
        } while (!nomeValido);

        do {
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade >= 0 && idade <= 150) {
            idadeValida = true;
            System.out.println("Idade: " + idade);
        } else {
            System.out.println("A idade precisa estar entre 0 e 150 anos!");
        }
    } while (!idadeValida);

        do {
            System.out.println("Digite seu salário: ");
            double salario = input.nextDouble();

            if (salario > 0) {
                salarioValido = true;
                System.out.println("Salário: " + salario);
            } else {
                System.out.println("O salário precisa ser maior que zero!");
            }
        } while (!salarioValido);

        do {
            System.out.println("Digite seu sexo (m = Masculino, f = Feminino): ");
            char sexo = input.next().charAt(0);

            if (sexo == 'm' || sexo == 'f') {
                sexoValido = true;
                System.out.println("Sexo: " + sexo);
            } else {
                System.out.println("Sexo " + sexo + " inválido!");
            }
        } while (!sexoValido);

        do {
            System.out.println("Digite seu estado civil (s = Solteiro, c = Casado, v = Viúvo, d = Divorciado): ");
            char estadoCivil = input.next().charAt(0);

            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd'){
                estadoCivilValido = true;
                System.out.println("Estado civil: " + estadoCivil);
            } else {
                System.out.println("Estado civil: " + estadoCivil + " inválido!");
            }
        } while (!estadoCivilValido);
    }
}
