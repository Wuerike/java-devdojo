package br.ind.lhf.javacore.D_sobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private double mensalidade;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, double mensalidade) {
        this(matricula, nome, notas);
        this.mensalidade = mensalidade;
    }

    public Estudante(){

    }

    public void print(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double nota:notas){
            System.out.println(nota);
        }
        System.out.println(this.mensalidade);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
