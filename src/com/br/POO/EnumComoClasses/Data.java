package com.br.POO.EnumComoClasses;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private DiaSemanaComConstrutor diaSemanaComConstrutor;

    public Data(){
        super();
    }

    public Data(int dia, int mes, int ano, DiaSemanaComConstrutor diaSemanaComConstrutor){
        super();
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemanaComConstrutor = diaSemanaComConstrutor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemanaComConstrutor getDiaSemanaComConstrutor() {
        return diaSemanaComConstrutor;
    }

    public void setDiaSemanaComConstrutor(DiaSemanaComConstrutor diaSemanaComConstrutor) {
        this.diaSemanaComConstrutor = diaSemanaComConstrutor;
    }
}
