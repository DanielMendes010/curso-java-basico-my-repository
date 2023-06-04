package com.br.POO;

import java.time.Year;

public class CarroAutomovel {
    public static void main(String[] args){
//        CarroAutomovel carroAutomovel = new CarroAutomovel();
//        System.out.println(Automovel.chamaConstrutor("Corsa",
//                                                     "Chevrolet GM",
//                                                    "Maxx 1.4",
//                                                        2014));
         Automovel automovel = new Automovel("Corsa", "Chevrolet GM", "Maxx 1.4", 2014);
        System.out.println(automovel);
    }

//    @Override
//    public String toString(){
//        Automovel automovel = new Automovel("Corsa", "Chevrolet GM", "Maxx 1.4", 2014);
//        String carro = "Carro:\n" + automovel;
//        return carro;
//    }
}
