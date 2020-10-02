package br.ind.lhf.javacore.B_introducaometodos.test;

import br.ind.lhf.javacore.B_introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        Professor prof2 = new Professor();

        prof1.idade= 25;
        prof1.matricula = "aaa";
        prof1.nome = "Samara";

        prof2.idade=37;
        prof2.matricula="bbb";
        prof2.nome="Evelise";

        prof1.imprime();
        System.out.println("---------");
        prof2.imprime();

    }
}
