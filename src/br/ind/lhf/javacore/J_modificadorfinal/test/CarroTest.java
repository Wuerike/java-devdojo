package br.ind.lhf.javacore.J_modificadorfinal.test;

import br.ind.lhf.javacore.J_modificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c= new Carro();
        System.out.println(Carro.getVelocidadeFinal());
        System.out.println(c.getComprador());
    }
}
