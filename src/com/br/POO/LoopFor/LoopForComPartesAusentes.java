package com.br.POO.LoopFor;

public class LoopForComPartesAusentes {
    public static void main(String[] args) {
    int count = 0;
    for ( ; count < 10; ) {
        System.out.println("valor de count: " + count);
        count += 2;
    }

    //for count de cima é a mesma do for cont de baixo
    for (int cont = 0; cont < 10; cont += 2) {
        System.out.println("valor de cont: " + cont);
    }
    }
}
