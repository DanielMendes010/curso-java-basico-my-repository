package com.br.POO.ExerciciosComVariaveisEMetodosEstaticos;

public class TesteCalculadoraComVariaveisEMetodosEstaticos {
    static void imprimirValorDaSoma(){
        System.out.println("Valor da soma: " + CalculadoraComVariaveisEMetodosEstaticos.somar(3, 9));
    }

    static void imprimirValorDaSubtracao(){
        System.out.println("Valor da subtração: " + CalculadoraComVariaveisEMetodosEstaticos.subtrair(3, 9));
    }

    static void imprimirValorDaMultiplicacao(){
        System.out.println("Valor da multiplicação: " + CalculadoraComVariaveisEMetodosEstaticos.multiplicar(3, 9));
    }

    static void imprimirValorDaDivisao(){
        System.out.println("Valor da divisão: " + CalculadoraComVariaveisEMetodosEstaticos.dividir(3, 9));
    }

    static void imprimirValorDaPotencia(){
        System.out.println("Valor da potência: " + CalculadoraComVariaveisEMetodosEstaticos.elevarAPotencia(3, 9));
    }

//    static double passarNumeroFatorial(){
//
//        double recebeNumeroFatorial = CalculadoraComVariaveisEMetodosEstaticos.informarNumeroFatorial(50);
//
//        return recebeNumeroFatorial;
//    }
    static void imprimirValorDoFatorial(){
        System.out.println("Valor do fatorial: " + CalculadoraComVariaveisEMetodosEstaticos.calcularFatorial());
    }

    static void imprimirValorDaConversaoDeMetroQuadradoParaPesQuadrados(){
        System.out.println("Valor da conversão de metros quadrados para pés quadrados: "
                + ConversaoDeUnidadesDeAreas.conversaoDeMetroQuadradoParaPesQuadrados(1));
    }

    static void imprimirValorDaConversaoPeQuadradoParaCentimetrosQuadrados(){
        System.out.println("Valor da conversão de pés quadrados para centimetros quadrados: "
                + ConversaoDeUnidadesDeAreas.conversaoPeQuadradoParaCentimetrosQuadrados(1));
    }

    static void imprimirValorDaConversaoMilhaQuadradaParaAcres(){
        System.out.println("Valor da conversão de milhas quadradas para acres: "
                + ConversaoDeUnidadesDeAreas.conversaoMilhaQuadradaParaAcres(1));
    }

    static void imprimirValorDaConversaoAcreParaPesQuadrados(){
        System.out.println("Valor da conversão de acre para pés quadrados: "
                + ConversaoDeUnidadesDeAreas.conversaoAcreParaPesQuadrados(1));
    }

    static void imprimirValorDaConversaoDeCentimetrosCubicosParaLitros(){
        System.out.println("Valor da conversão de litros para centímetros cubicos: "
                + ConversaoDeUnidadesDeVolume.conversaoDeLitrosParaCentimetrosCubicos(1));
    }

    static void imprimirValorDaConversaoDeMetrosCubicosParaLitros(){
        System.out.println("Valor da conversão de metros cubicos para litros: "
                + ConversaoDeUnidadesDeVolume.conversaoDeMetrosCubicosParaLitros(1));
    }
    static void imprimirValorDaConversaoDeLitrosParaPesCubicos(){
        System.out.println("Valor da conversão de litros para pés cubicos: "
                + ConversaoDeUnidadesDeVolume.conversaoDeLitrosParaPesCubicos(1));
    }

    static void imprimirValorDaConversaoDeGalaoAlemaoParaPolegadasCubicas(){
        System.out.println("Valor da conversão de galão alemão para polegadas cubicas: "
                + ConversaoDeUnidadesDeVolume.conversaoDeGalaoAlemaoParaPolegadasCubicas(1));
    }

    static void imprimirValorDaConversaoDeGalaoAmericanoParaLitros(){
        System.out.println("Valor da conversão de galão americanos para litros: "
                + ConversaoDeUnidadesDeVolume.conversaoDeGalaoAmericanoParaLitros(1));
    }

    static void imprimirValorDaConversaoDeMinutoParaSegundo(){
        System.out.println("Valor da conversão de minutos para segundos: "
                + ConversaoDeUnidadesDeTempo.conversaoDeMinutosParaSegundos(1));
    }

    static void imprimirValorDaConversaoDeHoraParaMinuto(){
        System.out.println("Valor da conversão de horas para minutos: "
                + ConversaoDeUnidadesDeTempo.conversaoDeHoraParaMinuto(1));
    }

    static void imprimirValorDaConversaoDeDiaParaHora(){
        System.out.println("Valor da conversão de dias para horas: "
                + ConversaoDeUnidadesDeTempo.conversaoDeDiaParaHora(1));
    }

    static void imprimirValorDaConversaoDeSemanaParaDia(){
        System.out.println("Valor da conversão de semanas para dias: "
                + ConversaoDeUnidadesDeTempo.conversaoDeSemanaParaDia(1));
    }

    static void imprimirValorDaConversaoDeMesParaDia(){
        System.out.println("Valor da conversão de meses para dias: "
                + ConversaoDeUnidadesDeTempo.conversaoDeMesParaDia(1));
    }

    static void imprimirValorDaConversaoDeAnoParaDia(){
        System.out.println("Valor da conversão de anos para dias: "
                + ConversaoDeUnidadesDeTempo.conversaoDeAnoParaDia(1));
    }

    public static void main(String[] args){
        imprimirValorDaSoma();
        imprimirValorDaSubtracao();
        imprimirValorDaMultiplicacao();
        imprimirValorDaDivisao();
        imprimirValorDaPotencia();
        System.out.println("Informe o número que deseja calcular o fatorial: ");
        imprimirValorDoFatorial();

        imprimirValorDaConversaoDeMetroQuadradoParaPesQuadrados();
        imprimirValorDaConversaoPeQuadradoParaCentimetrosQuadrados();
        imprimirValorDaConversaoMilhaQuadradaParaAcres();
        imprimirValorDaConversaoAcreParaPesQuadrados();

        imprimirValorDaConversaoDeCentimetrosCubicosParaLitros();
        imprimirValorDaConversaoDeMetrosCubicosParaLitros();
        imprimirValorDaConversaoDeLitrosParaPesCubicos();
        imprimirValorDaConversaoDeGalaoAlemaoParaPolegadasCubicas();
        imprimirValorDaConversaoDeGalaoAmericanoParaLitros();

        imprimirValorDaConversaoDeMinutoParaSegundo();
        imprimirValorDaConversaoDeHoraParaMinuto();
        imprimirValorDaConversaoDeDiaParaHora();
        imprimirValorDaConversaoDeSemanaParaDia();
        imprimirValorDaConversaoDeMesParaDia();
        imprimirValorDaConversaoDeAnoParaDia();
    }
}
