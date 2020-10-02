package br.ind.lhf.javacore.D_sobrecargaconstrutores.test;

import br.ind.lhf.javacore.D_sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante("1234", "Wuerike", new double[] {9,9,9,}, 1025.56);

        aluno.print();

    }
}
