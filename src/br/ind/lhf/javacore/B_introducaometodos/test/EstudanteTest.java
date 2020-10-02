package br.ind.lhf.javacore.B_introducaometodos.test;

import br.ind.lhf.javacore.B_introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante marcos = new Estudante();
        marcos.setNome("Marcos Henrique");
        marcos.setIdade((byte) 0);
        marcos.setNotas(new double[] {6,6,5.9});

        marcos.imprimeDados();

    }
}
