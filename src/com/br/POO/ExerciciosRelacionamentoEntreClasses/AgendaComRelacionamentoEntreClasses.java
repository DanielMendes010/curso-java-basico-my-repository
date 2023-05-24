package com.br.POO.ExerciciosRelacionamentoEntreClasses;

import com.br.POO.RelacionamentoEntreClasses.Contato;

public class AgendaComRelacionamentoEntreClasses {

    private String nome;
    private ContatoComRelacionamentoEntreClasses[] contatos;

    public AgendaComRelacionamentoEntreClasses(){
    }

    public AgendaComRelacionamentoEntreClasses(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContatoComRelacionamentoEntreClasses[] getContatos() {
        return contatos;
    }

    public void setContatos(ContatoComRelacionamentoEntreClasses[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info = "Nome = " + nome + "\n";

        if (contatos != null){
            for (ContatoComRelacionamentoEntreClasses c : contatos){
                info += c.obterInfo() + "\n";
            }
        }

        return info;
    }
}
