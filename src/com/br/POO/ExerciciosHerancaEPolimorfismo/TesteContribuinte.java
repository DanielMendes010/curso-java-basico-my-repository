package com.br.POO.ExerciciosHerancaEPolimorfismo;

public class TesteContribuinte {
    public static void main(String[] args){

        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setNome("Contribuinte 01");
        pessoa1.setRendaBruta(1000);
        pessoa1.setCpf("583.358.456-62");

        PessoaJuridica pessoa2 = new PessoaJuridica();
        pessoa2.setNome("Contribuinte 02");
        pessoa2.setRendaBruta(5000);
        pessoa2.setCnpj("91.403.512/0001-54");

        PessoaFisica pessoa3 = new PessoaFisica();
        pessoa3.setNome("Contribuinte 03");
        pessoa3.setRendaBruta(2000);
        pessoa3.setCpf("828.277.078-70");

        PessoaJuridica pessoa4 = new PessoaJuridica();
        pessoa4.setNome("Contribuinte 04");
        pessoa4.setRendaBruta(3000);
        pessoa4.setCnpj("35.434.693/0001-05");

        PessoaFisica pessoa5 = new PessoaFisica();
        pessoa5.setNome("Contribuinte 05");
        pessoa5.setRendaBruta(3700);
        pessoa5.setCpf("547.653.548-90");

        PessoaJuridica pessoa6 = new PessoaJuridica();
        pessoa6.setNome("Contribuinte 06");
        pessoa6.setRendaBruta(4000);
        pessoa6.setCnpj("10.684.822/0001-92");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pessoa1;
        contribuintes[1] = pessoa2;
        contribuintes[2] = pessoa3;
        contribuintes[3] = pessoa4;
        contribuintes[4] = pessoa5;
        contribuintes[5] = pessoa6;

        for (Contribuinte c : contribuintes){
            System.out.println(c.toString() + "\n");
        }
    }
}
