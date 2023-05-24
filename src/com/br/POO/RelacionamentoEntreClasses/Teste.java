package com.br.POO.RelacionamentoEntreClasses;

public class Teste {

    public static void main(String[] args){

        Contato contato = new Contato();
        contato.setNome("Tyrion");

        //relacionamento tem-um endereco
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Game of Thrones");
        endereco.setNumero("n/a");
        endereco.setComplemento("-");
        endereco.setCidade("Kings Landing");
        endereco.setEstado("Westeros");
        endereco.setCep("9999999");

        contato.setEndereco(endereco);

        //relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("11");
        telefone.setNumero("999999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("11");
        telefone2.setNumero("888888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        //Teste saída no console
        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
