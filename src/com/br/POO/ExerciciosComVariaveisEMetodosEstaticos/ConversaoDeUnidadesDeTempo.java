package com.br.POO.ExerciciosComVariaveisEMetodosEstaticos;

public class ConversaoDeUnidadesDeTempo {

    public static double conversaoDeMinutosParaSegundos(double minutos){
        final double calculoSegundo = 60;
        double segundos = minutos*calculoSegundo;

        return segundos;
    }

    public static double conversaoDeHoraParaMinuto(double horas){
        final double calculoMinuto = 60;
        double minutos = horas*calculoMinuto;

        return minutos;
    }

    public static double conversaoDeDiaParaHora(double dias){
        final double calculoHoras = 24;
        double horas = dias*calculoHoras;

        return horas;
    }

    public static double conversaoDeSemanaParaDia(double semanas){
        final double calculoDias = 7;
        double dias = semanas*calculoDias;

        return dias;
    }

    public static double conversaoDeMesParaDia(double meses){
        final double calculoDias = 30;
        double dias = meses*calculoDias;

        return dias;
    }

    public static double conversaoDeAnoParaDia(double anos){
        final double calculoDias = 365.25;
        double dias = anos*calculoDias;

        return dias;
    }

//    public static void main(String[] args) {
//        conversaoDeMinutosParaSegundos(1);
//        conversaoDeHoraParaMinuto(1);
//        conversaoDeDiaParaHora(1);
//        conversaoDeSemanaParaDia(1);
//        conversaoDeMesParaDia(1);
//        conversaoDeAnoParaDia(1);
//    }
}
