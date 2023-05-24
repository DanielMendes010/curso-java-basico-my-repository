package com.br.POO.ExerciciosHerancaEPolimorfismo;

public class TesteContaBancariaComHerancaEPolimorfismo {
    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria ***");

        ContaBancariaComHerancaEPolimorfismo contaSimples = new ContaBancariaComHerancaEPolimorfismo();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("11111");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("*** Teste ContaPoupança ***");

        ContaPoupancaComHerancaEPolimorfismo contaPoupanca = new ContaPoupancaComHerancaEPolimorfismo();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(3);

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);

        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo é de = "
                    + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }

        System.out.println(contaPoupanca);

        System.out.println("*** Teste ContaEspecial ***");

        ContaEspecialComHerancaEPolimorfismo contaEspecial = new ContaEspecialComHerancaEPolimorfismo();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancariaComHerancaEPolimorfismo conta,
                                      double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = "
                    + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = "
                    + conta.getSaldo());
        }
    }
}
