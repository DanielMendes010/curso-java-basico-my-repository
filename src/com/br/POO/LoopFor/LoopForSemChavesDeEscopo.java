package com.br.POO.LoopFor;

public class LoopForSemChavesDeEscopo {
    public static void main(String[] args) {
        //normalmente não utiliza chaves quando no case do switch
        //além do for, o if e else e o do e do-while podem ser criados sem as chaves de escopo
        //pode ser utilizado quando o for só tem uma linha de código dentro do corpo
        for (int i = 0; i < 5; i++)
            System.out.println("i tem valor: " + i);
    }
}
