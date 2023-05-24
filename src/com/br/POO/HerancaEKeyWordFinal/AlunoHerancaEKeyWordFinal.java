package com.br.POO.HerancaEKeyWordFinal;

public class AlunoHerancaEKeyWordFinal {

    private String curso;
    private double[] notas;

//    public void verificarAcesso(){
//
//        this.nomeVisibilidade = "nomeVisibilidade2";
//        super.nomeVisibilidade = "nomeVisibilidade3";
//
//        this.setNomeVisibilidade("nomeVisibilidade3");
//    }

    public AlunoHerancaEKeyWordFinal(){
        super();
    }

    public AlunoHerancaEKeyWordFinal(String nome, String endereco, String telefone, String curso){
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
}
