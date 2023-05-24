package com.br.POO.ModificadoresDeAcesso;

public class CarroComModificadoresDeAcesso {
        public String marca;
        String modelo;
        int numPassageiros;
        double capCombustivel;
        public double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do automóvel é: " + this.capCombustivel * this.consumoCombustivel
                + " km");
    }

    private double divideKMPorConsumoCombustivel(double km){
        return km / this.consumoCombustivel;
    }

    public double obterAutonomia() {
        System.out.println("Método obter autonômia foi chamado");
        return this.capCombustivel * this.consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        return this.divideKMPorConsumoCombustivel(km);
    }
}
