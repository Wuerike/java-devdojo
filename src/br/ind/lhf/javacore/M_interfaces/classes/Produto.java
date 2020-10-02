package br.ind.lhf.javacore.M_interfaces.classes;

/***
 * Uma classe abstrada deve ser extendida enquanto uma interface deve ser implementada
 * Os metodos da interface deve ser implementados
 *
 *
 * Produto é um tributavel
 * Produto é um transportavel
 *
 */

public class Produto implements Tributavel, Transportavel{
    private String nome;
    private double peso;
    private double preço;
    private double preçoFinal;
    private double valorFrete;

    public Produto(String nome, double peso, double preço) {
        this.nome = nome;
        this.peso = peso;
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preço=" + preço +
                ", preçoFinal=" + preçoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    @Override
    public void calculaImposto() {
        this.preçoFinal = this.preço + (this.preço * IMPOSTO);
    }

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preço / this.peso * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public double getPreçoFinal() {
        return preçoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }
}
