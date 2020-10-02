package br.ind.lhf.javacore.F_modificadorestatico.test;

import br.ind.lhf.javacore.F_modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        // Definição de um atributo estático, comum para qualquer objeto da classe
        Carro.setVelocidadeLimite(140);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Ford Ká", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
