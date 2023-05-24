package com.br.POO.ExerciciosComDoDoWhileEFor;

import java.util.Objects;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu usuário: ");
        String usuario = input.next();

        System.out.println("Digite sua senha: ");
        String senha = input.next();

        if (Objects.equals(usuario, senha)){
        while (Objects.equals(usuario, senha)){
                System.out.println("Usuário e senha não podem ser iguais!");
                System.out.println("Digite seu usuário: ");
                usuario = input.next();
                System.out.println("Digite sua senha: ");
                senha = input.next();
            }
        }
                System.out.println("Usuário: " + usuario);
                System.out.println("Senha: " + senha);
        }
    }
