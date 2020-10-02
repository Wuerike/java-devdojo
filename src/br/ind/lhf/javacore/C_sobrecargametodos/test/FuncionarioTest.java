package br.ind.lhf.javacore.C_sobrecargametodos.test;

import br.ind.lhf.javacore.C_sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Wuerike Henrique", "123.456.789-12", 3370.56, "4.933.654");
        Funcionario funcionario1 = new Funcionario();

        funcionario.print();
        funcionario1.print();
    }
}
