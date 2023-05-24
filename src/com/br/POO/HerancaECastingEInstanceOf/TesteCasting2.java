package com.br.POO.HerancaECastingEInstanceOf;

public class TesteCasting2 {

    public static void main(String[] args){

        Object object1 = obterString();
        String string1 = (String) object1;

        Object object2 = "Minha String";
        String string2 = (String) object2;

        Object object3 = new Object();
        //String string3 = (String) object3;

        Object object4 = obterInteiro();
        String string4 = (String) object4;
    }

    public static String obterString(){
        return "minha String";
    }

    public static int obterInteiro(){
        return 1;
    }
}
