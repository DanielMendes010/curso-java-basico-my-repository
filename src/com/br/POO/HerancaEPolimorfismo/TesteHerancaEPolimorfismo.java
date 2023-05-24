package com.br.POO.HerancaEPolimorfismo;

public class TesteHerancaEPolimorfismo {
    public static void main(String[] args){

        PessoaHerancaEPolimorfismo pessoaHerancaEPolimorfismo = new PessoaHerancaEPolimorfismo();
        PessoaHerancaEPolimorfismo alunoHerancaEPolimorfismo = new AlunoHerancaEPolimorfismo();
        PessoaHerancaEPolimorfismo professorEPolimorfismo = new ProfessorHerancaEPolimorfismo();

        pessoaHerancaEPolimorfismo.setEndereco("Rua 1, número 1");
        alunoHerancaEPolimorfismo.setEndereco("Rua 2, número 2");
        professorEPolimorfismo.setEndereco("Rua 3, número 3");

        System.out.println(pessoaHerancaEPolimorfismo.obterEtiquetaEndereco());
        System.out.println(alunoHerancaEPolimorfismo.obterEtiquetaEndereco());
        System.out.println(professorEPolimorfismo.obterEtiquetaEndereco());
    }
}
