package com.br.POO.ExerciciosComExceptions;

public class AgendaComExceptions {

    private ContatoComExceptions[] contatos;

    public AgendaComExceptions(){
        contatos = new ContatoComExceptions[5];
    }

    public void adicionarContato(ContatoComExceptions contato) throws AgendaCheiaException{
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++){
            if (contatos[i] == null){
                contatos[i] = contato;
                cheia = false;
                break;
            }

            if (cheia){
                throw new AgendaCheiaException();
            }
        }
    }

    public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException{
        for (int i = 0; i < contatos.length; i++){
            if (contatos[i] != null){
                if (contatos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (ContatoComExceptions c : contatos){
            if (c != null){
                s += c.toString() + "\n";
            }
        }
        return s;
    }
}
