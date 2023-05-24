package com.br.POO.ExerciciosComVariaveisEMetodosEstaticos;

public class ConversaoDeUnidadesDeAreas {

    public static double conversaoDeMetroQuadradoParaPesQuadrados(double metroQuadrado){
        final double calculoPeQuadrado = 10.764;
        double peQuadrado = metroQuadrado*calculoPeQuadrado;

        return peQuadrado;
    }

    public static double conversaoPeQuadradoParaCentimetrosQuadrados(double peQuadrado){
        final double calculoPeQuadrado = 926;
        double centimetrosQuadrados = peQuadrado/calculoPeQuadrado;

        return centimetrosQuadrados;
    }

    public static double conversaoMilhaQuadradaParaAcres(double acres){
        final double calculoAcres = 640;
        double milhasQuadradas = acres/calculoAcres;

        return milhasQuadradas;
    }

    public static double conversaoAcreParaPesQuadrados(double peQuadrado){
        final double calculoPeQuadrado = 43.560;
        double acres = peQuadrado*calculoPeQuadrado;

        return acres;
    }
}
