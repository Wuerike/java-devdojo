package br.ind.lhf.javacore.H_heranca.classes;

public class Pessoa extends Object{
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Bloco inicialização estático Pessoa");
    }
    {
        System.out.println("Bloco inicialização Pessoa 1");
    }
    {
        System.out.println("Bloco inicialização Pessoa 2");
    }

    public Pessoa(String nome){
        System.out.println("Construtor Pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getBairro());
        System.out.println(this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
