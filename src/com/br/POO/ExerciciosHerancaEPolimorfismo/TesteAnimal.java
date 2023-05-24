package com.br.POO.ExerciciosHerancaEPolimorfismo;

public class TesteAnimal {
    public static void main(String[] args){

        Animal animal = new Animal();
        animal.setNome("Camelo");
        animal.setComprimento(150);
        animal.setPatas(4);
        animal.setCor("Amarelo");
        animal.setAmbiente("Terra");
        animal.setVelocidade(2.0);

        Peixe peixe = new Peixe();
        peixe.setNome("Tubarão");
        peixe.setComprimento(300);
        peixe.setPatas(0);
        peixe.setCor("Cinzento");
        peixe.setAmbiente("Mar");
        peixe.setVelocidade(1.5);
        peixe.setCaracteristicas("Barbatanas e cauda");

        Mamifero mamifero = new Mamifero();
        mamifero.setNome("Urso-do-canadá");
        mamifero.setComprimento(180);
        mamifero.setPatas(4);
        mamifero.setCor("Vermelho");
        mamifero.setAmbiente("Terra");
        mamifero.setVelocidade(0.5);
        mamifero.setAlimento("Mel");

        System.out.println(animal);
        System.out.println(peixe);
        System.out.println(mamifero);
    }
}
