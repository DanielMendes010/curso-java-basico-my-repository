package com.br.POO.ExerciciosComMetodosRecursivos;

public class SequenciaDeFibonacciComMetodosRecursivos {

    public static int fibonacci(int numero){

        if (numero < 2){
            return 1;
        }

        return fibonacci(numero-1) + fibonacci(numero-2);
    }

    public static int somatorio(int numero){

        if (numero == 1){
            return 1;
        }

        return numero + somatorio(numero-1);
    }
}
