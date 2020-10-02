package br.ind.lhf.javacore.H_heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Bloco inicialização estático Funcionario");
    }
    {
        System.out.println("Bloco inicialização Funcionario 1");
    }
    {
        System.out.println("Bloco inicialização Funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("construtor funcionario");
    }

    public void imprime(){
        System.out.println(super.nome);
        System.out.println(super.getCpf());
        System.out.println(this.salario);
        System.out.println(super.getEndereco().getBairro());
        System.out.println(this.getEndereco().getRua());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
