package com.br.POO.HerancaEClassObject;

import java.util.Arrays;
import java.util.Objects;

public class AlunoHerancaEClassObject {

    private String curso;
    private double[] notas;

//    public void verificarAcesso(){
//
//        this.nomeVisibilidade = "nomeVisibilidade2";
//        super.nomeVisibilidade = "nomeVisibilidade3";
//
//        this.setNomeVisibilidade("nomeVisibilidade3");
//    }

    public AlunoHerancaEClassObject(){
        super();
    }

    public AlunoHerancaEClassObject(String nome, String endereco, String telefone, String curso){
//        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer(){
//        super.setCpf("345345345354");
//
//        this.setCpf("345345345354");
    }

    public String obterEtiquetaEndereco(){

        String s = "Endereco do Aluno: ";
//        s += super.getEndereco();

        return s;
    }

//    @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println(this.obterEtiquetaEndereco());
    }

    @Override
    public String toString() {
        return "AlunoHerancaEClassObject{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AlunoHerancaEClassObject that = (AlunoHerancaEClassObject) o;

        if (curso.equalsIgnoreCase(that.getCurso())){
            return true;
        }
        return false;
    }

    //    public String toString(){
//        String s = curso + "\n";
//        for (double nota : notas){
//            s += nota + " ";
//        }
//        return s;
//    }
}
