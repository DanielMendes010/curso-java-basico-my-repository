package com.br.POO.HerancaEClassObject;

public class TesteHerancaEClassObject {
    public static void main(String[] args) {
        AlunoHerancaEClassObject alunoHerancaEClassObject = new AlunoHerancaEClassObject();
        alunoHerancaEClassObject.setCurso("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        alunoHerancaEClassObject.setNotas(notas);

        System.out.println(alunoHerancaEClassObject);

        String s1 = "afdsdfsdf";
        String s2 = "afdsdfsdf";

        System.out.println(s1.equals(s2));

        AlunoHerancaEClassObject alunoHerancaEClassObject2 = new AlunoHerancaEClassObject();
        alunoHerancaEClassObject2.setCurso("Ciência da Computação");
        double[] notas2 = {9, 8, 6, 7};
        alunoHerancaEClassObject2.setNotas(notas2);

        System.out.println(alunoHerancaEClassObject2);
        System.out.println(alunoHerancaEClassObject.equals(alunoHerancaEClassObject2));
    }
}
