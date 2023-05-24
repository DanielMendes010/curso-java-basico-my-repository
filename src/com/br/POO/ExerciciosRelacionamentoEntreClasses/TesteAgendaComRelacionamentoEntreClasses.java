package com.br.POO.ExerciciosRelacionamentoEntreClasses;

import java.util.Scanner;

public class TesteAgendaComRelacionamentoEntreClasses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = input.nextLine();

        AgendaComRelacionamentoEntreClasses agendaComRelacionamentoEntreClasses = new AgendaComRelacionamentoEntreClasses(nome);

        ContatoComRelacionamentoEntreClasses[] contatoComRelacionamentoEntreClasses = new ContatoComRelacionamentoEntreClasses[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Entre com as informações do contato " + (i+1));
            ContatoComRelacionamentoEntreClasses c = new ContatoComRelacionamentoEntreClasses();

            System.out.println("Entre com o nome: ");
            nome = input.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = input.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email: ");
            String email = input.nextLine();
            c.setEmail(email);

            contatoComRelacionamentoEntreClasses[i] = c;
        }

        agendaComRelacionamentoEntreClasses.setContatos(contatoComRelacionamentoEntreClasses);

        if (agendaComRelacionamentoEntreClasses != null){
            System.out.println(agendaComRelacionamentoEntreClasses.obterInfo());
        }
    }
}
