package br.ind.lhf.javacore.L_classesabstratas.test;

import br.ind.lhf.javacore.L_classesabstratas.classes.Funcionario;
import br.ind.lhf.javacore.L_classesabstratas.classes.Gerente;
import br.ind.lhf.javacore.L_classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Wuerike", "456", 2000);
        Vendedor v = new Vendedor("Alisson", "123", 1000, 1000);

        g.calculaSalario();
        v.calculaSalario();

        System.out.println(g);
        System.out.println(v);

        g.imprime();
        v.imprime();

    }
}
