package com.br.POO.HerancaECastingEInstanceOf;

public class TesteCasting {

    public static void main(String[] args){

        /*Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting

		Pessoa aluno2 = (Pessoa) new Aluno();

		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 =  (Aluno) aluno3;*/

        PessoaCasting pessoaCasting = new PessoaCasting();
        AlunoCasting alunoCasting = new AlunoCasting();
        ProfessorCasting professorCasting = new ProfessorCasting();

        if (pessoaCasting instanceof PessoaCasting){
            System.out.println("É do tipo Pessoa");
        }

        if (alunoCasting instanceof AlunoCasting){
            System.out.println("É do tipo Aluno");
        }

        if (professorCasting instanceof ProfessorCasting){
            System.out.println("É do tipo Professor");
        }
    }
}
