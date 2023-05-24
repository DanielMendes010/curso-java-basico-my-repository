package com.br.POO.ExerciciosComMetodos;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;

    boolean sacar(double quantidade) {
        if(saldo >= quantidade) {
            saldo -= quantidade;
            return true;
        } else {
            if(especial) {
                double limite = limiteEspecial + saldo;
                if(limite >= quantidade) {
                    saldo -= quantidade;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }
}
