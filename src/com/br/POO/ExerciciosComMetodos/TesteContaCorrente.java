package com.br.POO.ExerciciosComMetodos;

public class TesteContaCorrente {
    public static void main(String[] args) {
       ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numero = "123456";
        contaCorrente.agencia = "1234";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500;
        contaCorrente.saldo = -10;

        System.out.println("Saldo da conta " + contaCorrente.numero + " = "
                + contaCorrente.saldo);

        boolean saqueEfetuado = contaCorrente.sacar(10);

        if(saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        saqueEfetuado = contaCorrente.sacar(500);
        System.out.println("Tentativa de saque de 500 reais");
        if(saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        System.out.println("Depósito de 500 reais");
        contaCorrente.depositar(500);
        contaCorrente.consultarSaldo();

        if(contaCorrente.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        contaCorrente.sacar(600);
        contaCorrente.consultarSaldo();
        if(contaCorrente.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

    }
}
