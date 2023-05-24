package com.br.POO.ExerciciosHerancaEPolimorfismo;

public class Peixe extends Animal{

    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String toString(){
        return "Nome: " + getNome() +
                "\nComprimento: " + getComprimento() + " cm" +
                "\nPatas: " + getPatas() +
                "\nCor: " + getCor() +
                "\nAmbiente: " + getAmbiente() +
                "\nVelocidade: " + getVelocidade() + " m/s" +
                "\nCaracterísticas: " + getCaracteristicas() +
                "\n";

    }
}
