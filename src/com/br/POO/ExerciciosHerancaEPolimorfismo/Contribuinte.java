package com.br.POO.ExerciciosHerancaEPolimorfismo;

public abstract class Contribuinte {

    private String nome;

    private double rendaBruta;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    protected abstract double calcularImposto();

    public String toString() {
        String s = "Nome: " + nome;
        s += " ;rendaBruta: " + rendaBruta;
        return s;
    }
}
