package com.br.POO.ExerciciosComConstrutoresEncapsulamentoESobrecarga;

public class ContaCorrenteComConstrutor {
    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;

    public ContaCorrenteComConstrutor() {
    }

    public ContaCorrenteComConstrutor(String numero, String agencia, boolean especial,
                                      double limiteEspecial, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public boolean getEspecial(){
        return this.especial;

    }

    public void setEspecial(boolean especial){
        this.especial = especial;
    }

    public double getLimiteEspecial(){
        return this.limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial){
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    protected boolean sacar(double quantidade){
        if (saldo >= quantidade){
            saldo -= quantidade;
            return true;
        } else {
            if (especial){
                double limite = limiteEspecial + saldo;
                if (limite >= quantidade){
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

    public void depositar(double valorDepositado){
        this.saldo += valorDepositado;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + this.saldo);
    }

    public boolean vericarUsoChequeEspecial(){
        return this.saldo < 0;
    }
}
