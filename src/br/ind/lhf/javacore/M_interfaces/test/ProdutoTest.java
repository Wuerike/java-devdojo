package br.ind.lhf.javacore.M_interfaces.test;

import br.ind.lhf.javacore.M_interfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Nootebook", 4, 3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);

    }
}
