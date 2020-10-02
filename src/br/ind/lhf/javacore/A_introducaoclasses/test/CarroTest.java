package br.ind.lhf.javacore.A_introducaoclasses.test;

import br.ind.lhf.javacore.A_introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.Placa="PYM5985";
        carro.Modelo="Ford Ká";
        carro.VelocidadeMaxima=140f;

        System.out.println(carro.Placa);
        System.out.println(carro.Modelo);
        System.out.println(carro.VelocidadeMaxima);
    }
}
