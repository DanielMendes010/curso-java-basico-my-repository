package com.br.POO.Construtores;

public class CarroConstrutor {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    CarroConstrutor(){
        System.out.println("Classe carro foi intanciada");
        numPassageiros = 4;
    }

    CarroConstrutor(String marca_, String modelo_, int numPassageiros_,
                    double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

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
