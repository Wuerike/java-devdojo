package br.ind.lhf.javacore.I_sobreescritametodos.classes;

public class Pessoa extends Object{
    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "Nome: "+this.nome+", idade: "+this.idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
