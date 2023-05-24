package com.br.POO.ExerciciosComVariaveisEMetodosEstaticos;

public class ConversaoDeUnidadesDeVolume {

    public static double conversaoDeLitrosParaCentimetrosCubicos(double litros){
        final double calculoCentimetrosCubicos = 1000;
        double centimetrosCubicos = litros*calculoCentimetrosCubicos;

        return centimetrosCubicos;
    }

    public static double conversaoDeMetrosCubicosParaLitros(double metrosCubicos){
        final double calculoLitros = 1000;
        double litros = metrosCubicos*calculoLitros;

        return litros;
    }

    public static double conversaoDeLitrosParaPesCubicos(double litros){
        final double calculoPesCubicos = 35.32;
        double pesCubicos = litros/calculoPesCubicos;

        return pesCubicos;
    }

    public static double conversaoDeGalaoAlemaoParaPolegadasCubicas(double galaoAlemao){
        final double calculoPolegadasCubicas = 231;
        double polegadasCubicas = galaoAlemao/calculoPolegadasCubicas;

        return polegadasCubicas;
    }

    public static double conversaoDeGalaoAmericanoParaLitros(double galaoAlemao){
        final double calculoLitros = 3.785;
        double litros = galaoAlemao*calculoLitros;

        return litros;
    }
}
