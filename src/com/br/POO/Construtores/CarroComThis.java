package com.br.POO.Construtores;

public class CarroComThis {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    public CarroComThis(String marca, String modelo,int numPassageiros,
                        double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public CarroComThis(){
        this("Fiat", "Uno", 5, 100, 0.1);
    }

    public CarroComThis(String marca, String modelo,int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }

    public CarroComThis(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do automóvel é: " + this.capCombustivel * this.consumoCombustivel
                + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obter autonômia foi chamado");
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }
}
