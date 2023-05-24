package com.br.POO.HerancaEClassesAbstratas;

public class TesteHerancaEClasseAbstratas {
    public static void main(String[] args){
//        PessoaHerancaEClasseAbstratas pessoaHerancaEClasseAbstratas = new PessoaHerancaEClasseAbstratas();
        PessoaHerancaEClasseAbstratas alunoHerancaEClassesAbstratas = new AlunoHerancaEClasseAbstratas();
        PessoaHerancaEClasseAbstratas professorEClassesAbstratas = new ProfessorHerancaEClasseAbstratas();

        alunoHerancaEClassesAbstratas.setEndereco("Rua 2, numero 2");
        professorEClassesAbstratas.setEndereco("Rua 3, numero 3");

        alunoHerancaEClassesAbstratas.imprimirEtiquetaEndereco();
        professorEClassesAbstratas.imprimirEtiquetaEndereco();
    }
}
