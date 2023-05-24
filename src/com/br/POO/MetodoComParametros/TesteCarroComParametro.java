package com.br.POO.MetodoComParametros;

public class TesteCarroComParametro {
    public static void main(String[] args) {
        CarroComParametro van = new CarroComParametro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do automóvel é: " + autonomia + " km");
        System.out.println("A autonomia do automóvel é: " + van.obterAutonomia() + " km");

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
    }
}
