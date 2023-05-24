package com.br.POO.HerancaEClassesAbstratas;

public abstract class PessoaHerancaEClasseAbstratas {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    protected String nomeVisibilidade;

    public PessoaHerancaEClasseAbstratas(){
        nomeVisibilidade = "nomeVisibilidade";
    }

    public PessoaHerancaEClasseAbstratas(String nome, String endereco, String telefone){
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeVisibilidade() {
        return nomeVisibilidade;
    }

    public void setNomeVisibilidade(String nomeVisibilidade) {
        this.nomeVisibilidade = nomeVisibilidade;
    }

    public abstract String obterEtiquetaEndereco();

    public abstract void imprimirEtiquetaEndereco();
}
