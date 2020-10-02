package br.ind.lhf.javacore.L_classesabstratas.classes;

public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public Vendedor() {
    }

    @Override
    public void calculaSalario() {
        this.salario = this.salario + (totalVendas * 0.03);
    }

    @Override
    public void imprime() {
        System.out.println("Imprime vendedor");
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
