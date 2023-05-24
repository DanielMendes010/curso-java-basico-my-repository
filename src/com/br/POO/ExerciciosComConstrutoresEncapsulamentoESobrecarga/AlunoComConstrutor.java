package com.br.POO.ExerciciosComConstrutoresEncapsulamentoESobrecarga;

public class AlunoComConstrutor {
    private String nome;
    private String matricula;
    private String curso;
    protected String[] disciplina;
    protected double[][] nota;

    public AlunoComConstrutor(){
        disciplina = new String[3];
        nota = new double[3][4];
    }

    public AlunoComConstrutor(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplina = new String[3];
        this.nota = new double[3][4];
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

    public double[][] getNota() {
        return nota;
    }

    public void setNota(double[][] nota) {
        this.nota = nota;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i=0; i<nota.length; i++){
            System.out.println("Notas da disciplina " + disciplina[i]);
            for (int j = 0; j<nota[i].length; j++) {
                System.out.print(nota[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected boolean verificarAprovado(int indice){
        if (obterMedia(indice) >=7) {
            return true;
        }
        return false;
    }

    private double obterMedia(int indice){
        double soma = 0;

        for (int i = 0; i < nota[indice].length; i++) {
            soma += nota[indice][i];
        }

        double media = soma / 4;

        return media;
    }

    public void setDisciplinaPos(int pos, String disciplina) {
        this.disciplina[pos] = disciplina;
    }

    public void setNotaPosIJ(int posI, int posJ, double nota) {
        this.nota[posI][posJ] = nota;
    }
}
