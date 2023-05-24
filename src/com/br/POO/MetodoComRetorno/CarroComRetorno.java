package com.br.POO.MetodoComRetorno;

public class CarroComRetorno {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do automóvel é: " + capCombustivel * consumoCombustivel
                + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obter autonômia foi chamado");
        return capCombustivel * consumoCombustivel;
    }
}
