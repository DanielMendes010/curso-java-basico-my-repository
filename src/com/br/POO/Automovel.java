package com.br.POO;

public class Automovel {

    private String nome;
    private String marca;
    private String modelo;
    private int ano;

    public Automovel(String nome, String marca, String modelo, int ano){
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        System.out.println(nome + "\n" + marca + "\n" + modelo + "\n" + ano);
    }

    public static Automovel chamaConstrutor(String nome, String marca, String modelo, int ano){
        return new Automovel(nome, marca, modelo, ano);
    }
}
