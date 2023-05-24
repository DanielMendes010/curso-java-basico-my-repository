package com.br.POO.Heranca;

public class TesteHeranca {

    public static void main(String[] args){

        AlunoHeranca alunoHeranca = new AlunoHeranca();

        System.out.println("Aluno: ");
        alunoHeranca.setNome("Daniel");
        System.out.println(alunoHeranca.getNome());
        alunoHeranca.setEndereco("Rua Alencar");
        System.out.println(alunoHeranca.getEndereco());
        alunoHeranca.setTelefone("11 9999-9999");
        System.out.println(alunoHeranca.getTelefone());
        alunoHeranca.setCpf("444.000.333-99");
        System.out.println(alunoHeranca.getCpf());

        ProfessorHeranca professorHeranca = new ProfessorHeranca();

        System.out.println("\nProfessor: ");
        professorHeranca.setNome("Cézar");
        System.out.println(professorHeranca.getNome());
        professorHeranca.setEndereco("Rua Figueiredo");
        System.out.println(professorHeranca.getEndereco());
        professorHeranca.setTelefone("11 8888-8888");
        System.out.println(professorHeranca.getTelefone());
        professorHeranca.setCpf("555.111.444.33");
        System.out.println(professorHeranca.getCpf());

        PessoaHeranca professorHeranca2 = new ProfessorHeranca();

        System.out.println("\nProfessor 2: ");
        professorHeranca2.setNome("Augusto");
        System.out.println(professorHeranca2.getNome());

        System.out.println(alunoHeranca.verificarAprovado());
    }
}
