package com.br.POO.ExerciciosComConstrutoresEncapsulamentoESobrecarga;

public class TestaContaCorrenteComConstrutor {
    public static void main(String[] args) {
        ContaCorrenteComConstrutor contaCorrenteComConstrutor = new ContaCorrenteComConstrutor();

        contaCorrenteComConstrutor.setNumero("123456");
        contaCorrenteComConstrutor.setAgencia("1234");
        contaCorrenteComConstrutor.setEspecial(true);
        contaCorrenteComConstrutor.setLimiteEspecial(500);
        contaCorrenteComConstrutor.setSaldo(-10);

        System.out.println("Saldo da conta: " + contaCorrenteComConstrutor.getNumero() + " = "
                + contaCorrenteComConstrutor.getSaldo());

        boolean saqueEfetuado = contaCorrenteComConstrutor.sacar(10);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Não foi possível efetuar saque. Saldo indisponível.");
        }

        System.out.println("Depósito de 500 reais");
        contaCorrenteComConstrutor.depositar(500);
        contaCorrenteComConstrutor.consultarSaldo();

        if (contaCorrenteComConstrutor.vericarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        contaCorrenteComConstrutor.sacar(600);
        contaCorrenteComConstrutor.consultarSaldo();
        if (contaCorrenteComConstrutor.vericarUsoChequeEspecial()){
            System.out.println("Está cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}
