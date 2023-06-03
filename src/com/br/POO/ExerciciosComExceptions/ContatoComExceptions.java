package com.br.POO.ExerciciosComExceptions;

public class ContatoComExceptions {

    private String nome;
    private String telefone;
    private String email;
    private int id;
    public static int contator = 0;

    public ContatoComExceptions() {
        contator++;
        id = contator;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String s = "[";
        s += "Id: " + id;
        s += ", Nome: " + nome;
        s += ", Telefone: " + telefone;
        s += ", Email: " + email;
        s += "]";
        return s;
    }
}
