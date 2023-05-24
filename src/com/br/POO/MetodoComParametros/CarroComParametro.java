package com.br.POO.MetodoComParametros;

public class CarroComParametro {
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

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
