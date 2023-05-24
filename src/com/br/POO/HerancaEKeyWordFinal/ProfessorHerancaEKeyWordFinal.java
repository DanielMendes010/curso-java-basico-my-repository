package com.br.POO.HerancaEKeyWordFinal;

public class ProfessorHerancaEKeyWordFinal {

    private double salario;
    private String nomeCurso;

//    public void verificarAcesso(){
//
//        this.nomeVisibilidade = "nomeVisibilidade2";
//        super.nomeVisibilidade = "nomeVisibilidade3";
//
//        this.setNomeVisibilidade("nomeVisibilidade3");
//    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){

        String s = "Endereço do Professor: ";
//        s += super.getEndereco();

        return s;
    }

//    @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo o endereço do Aluno");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
