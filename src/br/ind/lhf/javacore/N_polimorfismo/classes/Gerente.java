package br.ind.lhf.javacore.N_polimorfismo.classes;

public class Gerente extends Funcionario {
    private double participacaoLucro;

    public Gerente(String nome, double salario, double participacaoLucro) {
        super(nome, salario);
        this.participacaoLucro = participacaoLucro;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + this.participacaoLucro;
    }

    public double getParticipacaoLucro() {
        return participacaoLucro;
    }

    public void setParticipacaoLucro(double participacaoLucro) {
        this.participacaoLucro = participacaoLucro;
    }
}
