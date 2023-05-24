package com.br.POO.ExerciciosHerancaEPolimorfismo;

public class Mamifero extends Animal{

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String toString(){
        return "Nome: " + getNome() +
                "\nComprimento: " + getComprimento() + " cm" +
                "\nPatas: " + getPatas() +
                "\nCor: " + getCor() +
                "\nAmbiente: " + getAmbiente() +
                "\nVelocidade: " + getVelocidade() + " m/s" +
                "\nAlimento: " + getAlimento() + "\n";

    }
}
