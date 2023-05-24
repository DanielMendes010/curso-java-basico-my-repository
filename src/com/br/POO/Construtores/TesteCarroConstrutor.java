package com.br.POO.Construtores;

public class TesteCarroConstrutor {
    public static void main(String[] args){
        CarroConstrutor van = new CarroConstrutor();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numPassageiros);

        CarroConstrutor van2 = new CarroConstrutor("Fiat", "Ducato", 10, 100, 0.2);

        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustivel);
        System.out.println(van2.consumoCombustivel);
    }
}
