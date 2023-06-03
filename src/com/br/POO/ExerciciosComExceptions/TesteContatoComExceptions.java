package com.br.POO.ExerciciosComExceptions;

import java.util.Scanner;

public class TesteContatoComExceptions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AgendaComExceptions agendaComExceptions = new AgendaComExceptions();

        int opcao = 1;

        while (opcao != 3){
            opcao = obterOpcaoMenu(scanner);

            if (opcao == 1){
                consultarContato(scanner, agendaComExceptions);
            } else if (opcao == 2) {
                adicionarContato(scanner, agendaComExceptions);
            }
        }
    }

    private static void adicionarContato(Scanner scanner, AgendaComExceptions agendaComExceptions) {
        try {
            System.out.println("Criando um contato, entre com as informações");
            String nome = leInformacaoString(scanner, "Entre com o nome do contato");
            String telefone = leInformacaoString(scanner, "Entre com o telefone do contato");
            String email = leInformacaoString(scanner, "Entre com o email do contato");

            ContatoComExceptions contatoComExceptions = new ContatoComExceptions();
            contatoComExceptions.setNome(nome);
            contatoComExceptions.setEmail(email);
            contatoComExceptions.setTelefone(telefone);

            System.out.println("Contato a ser criado: ");
            System.out.println(contatoComExceptions);

            agendaComExceptions.adicionarContato(contatoComExceptions);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agendaComExceptions);
        }
    }

    private static String leInformacaoString(Scanner scanner, String mensagem) {
        System.out.println(mensagem);
        String entrada = scanner.nextLine();
        return entrada;
    }

    private static void consultarContato(Scanner scanner, AgendaComExceptions agendaComExceptions) {
        String nomeContato = leInformacaoString(scanner, "Entre com o nome do contato a ser pesquisado: ");
        try {
            if (agendaComExceptions.consultarContatoPorNome(nomeContato) >= 0){
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int obterOpcaoMenu(Scanner scanner) {
        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida){
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try {
                String entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n");
            }
        }

        return opcao;
    }
}
