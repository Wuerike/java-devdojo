package br.ind.lhf.javacore.J_modificadorfinal.classes;

/***
 * O modificador Final:
 * Em variaveis indica constantes, os valores não podem ser alterados
 * Em metodos indica que o metodo não pode ser sobre escrito
 * em classes indica que a classe não pode ser extendida
 */


public final class Carro {
    private static final double VELOCIDADE_FINAL = 150;
    private final Comprador COMPRADOR = new Comprador("Wuerike");
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Comprador getComprador() {
        return COMPRADOR;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
