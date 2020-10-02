package br.ind.lhf.javacore.L_classesabstratas.classes;

public class Gerente extends Funcionario {

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    public Gerente() {
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario * 1.2;
    }

    @Override
    public void imprime() {
        System.out.println("Imprime gerente");
    }
}
