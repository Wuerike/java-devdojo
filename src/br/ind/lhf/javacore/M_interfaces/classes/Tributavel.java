package br.ind.lhf.javacore.M_interfaces.classes;


/***
 * Em uma interface:
 * O nome da classe deve ser um adjetivos sempre que possivel
 * Todos os atributos são constantes e não variaveis (public static final é redundante)
 * Todos os metodos são abstratos (public abstract é redundante)
 */
public interface Tributavel {
    public static final double IMPOSTO = 0.2;
    public abstract void calculaImposto();

}
