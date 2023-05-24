package com.br.POO.MetodoSimples;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do automóvel é:" + capCombustivel * consumoCombustivel
                + " km");
    }
}
