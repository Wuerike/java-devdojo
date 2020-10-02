package br.ind.lhf.javacore.B_introducaometodos.classes;

public class Estudante {
    private String nome;
    private byte idade;
    private double[] notas = new double[3];
    private double media;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(byte idade){
        if(idade<1){
            System.out.println("idade deve ser maior que zero.");
            return;
        }
        this.idade = idade;
    }

    public byte getIdade(){
        return this.idade;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public double[] getNotas(){
        return this.notas;
    }


    public double calculaMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / (double) this.notas.length;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        byte i = 1;
        for (double nota : this.notas) {
            System.out.println("Nota " + i + ": " + nota);
            i++;
        }

        this.media = this.calculaMedia();
        System.out.println("Média aritmética: "+media);

        if (media < 6d) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Aprovado");
        }

    }


}
