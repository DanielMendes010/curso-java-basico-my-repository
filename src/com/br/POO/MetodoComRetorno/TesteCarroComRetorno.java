package com.br.POO.MetodoComRetorno;

public class TesteCarroComRetorno {
    public static void main(String[] args) {
        CarroComRetorno van = new CarroComRetorno();
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
    }
}
