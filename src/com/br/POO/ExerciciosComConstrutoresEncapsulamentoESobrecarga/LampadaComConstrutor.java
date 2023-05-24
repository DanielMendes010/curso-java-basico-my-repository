package com.br.POO.ExerciciosComConstrutoresEncapsulamentoESobrecarga;

public class LampadaComConstrutor {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbjur;
    private boolean ligada;

    public LampadaComConstrutor(){}

    public LampadaComConstrutor(String modelo, String tensao, int potencia, String cor,
                                String tipoLuz, int garantiaMeses, String[] tipos,
                                boolean tipoAbjur, boolean ligada){
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbjur = tipoAbjur;
        this.ligada = ligada;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getTensao(){
        return this.tensao;
    }

    public void setTensao(String tensao){
        this.tensao = tensao;
    }

    public int getPotencia(){
        return this.potencia;
    }

    public void setPotencia(int potencia){
        this.tensao = tensao;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbjur() {
        return tipoAbjur;
    }

    public void setTipoAbjur(boolean tipoAbjur) {
        this.tipoAbjur = tipoAbjur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    protected void ligar(){
        this.ligada = true;
    }

    protected void desligar(){
        this.ligada = false;
    }

    protected void mostrarEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada!");
        } else {
            System.out.println("Lâmpada está desligada!");
        }
    }

    protected void mudarEstado(){
        if (ligada){
            desligar();
        } else {
            ligar();
        }
    }
}
