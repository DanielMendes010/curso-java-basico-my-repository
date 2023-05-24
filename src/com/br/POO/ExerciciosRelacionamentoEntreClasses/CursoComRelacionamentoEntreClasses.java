package com.br.POO.ExerciciosRelacionamentoEntreClasses;

public class CursoComRelacionamentoEntreClasses {

    private String nome;
    private String horario;
    private ProfessorComRelacionamentoEntreClasses professor;
    private AlunoComRelacionamentoEntreClasses[] alunosComRelacionamentoEntreClasses;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ProfessorComRelacionamentoEntreClasses getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorComRelacionamentoEntreClasses professor) {
        this.professor = professor;
    }

    public AlunoComRelacionamentoEntreClasses[] getAlunosComRelacionamentoEntreClasses() {
        return alunosComRelacionamentoEntreClasses;
    }

    public void setAlunosComRelacionamentoEntreClasses(AlunoComRelacionamentoEntreClasses[] alunosComRelacionamentoEntreClasses) {
        this.alunosComRelacionamentoEntreClasses = alunosComRelacionamentoEntreClasses;
    }

    public String obterInfo(){
        String info = "Nome do Curso = " + nome + "\n";

        if (professor != null){
            info += professor.obterInfo();
        }

        if (alunosComRelacionamentoEntreClasses != null){
            System.out.println("---Alunos---");
            for (AlunoComRelacionamentoEntreClasses alunoComRelacionamentoEntreClasses : alunosComRelacionamentoEntreClasses){
                if (alunoComRelacionamentoEntreClasses != null){
                    info += alunoComRelacionamentoEntreClasses.obterInfo();
                    info += "\n";
                }
            }

            info += "\nMédia da turma = " + obterMediaTurma();
        }

        return info;
    }

    public double obterMediaTurma() {
        double soma = 0;
        for (AlunoComRelacionamentoEntreClasses alunoComRelacionamentoEntreClasses : alunosComRelacionamentoEntreClasses){
            if (alunoComRelacionamentoEntreClasses != null){
                soma += alunoComRelacionamentoEntreClasses.obterMedia();
            }
        }
        return soma/ alunosComRelacionamentoEntreClasses.length;
    }
}
