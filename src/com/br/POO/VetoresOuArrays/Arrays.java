package com.br.POO.VetoresOuArrays;

public class Arrays {
    public static void main(String[] args) {
        double[] temperaturaDiariaEmUmAno = new double[365];
        temperaturaDiariaEmUmAno[0] = 31.3;
        temperaturaDiariaEmUmAno[1] = 32;
        temperaturaDiariaEmUmAno[2] = 33.7;
        temperaturaDiariaEmUmAno[3] = 34;
        temperaturaDiariaEmUmAno[4] = 33.1;

        System.out.println("O valor da temperatura do dia 1 é: "
                + temperaturaDiariaEmUmAno[0]);

        System.out.println("O tamanho do array: "
                + temperaturaDiariaEmUmAno.length);

        System.out.println("Valores do array: ");
        for (int i = 0; i < temperaturaDiariaEmUmAno.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: "
                    + temperaturaDiariaEmUmAno[i]);
        }

        for (double temp : temperaturaDiariaEmUmAno){
            System.out.println(temp);
        }
    }
}
