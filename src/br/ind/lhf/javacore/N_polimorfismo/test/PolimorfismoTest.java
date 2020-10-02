package br.ind.lhf.javacore.N_polimorfismo.test;

import br.ind.lhf.javacore.N_polimorfismo.classes.Funcionario;
import br.ind.lhf.javacore.N_polimorfismo.classes.Gerente;
import br.ind.lhf.javacore.N_polimorfismo.classes.RelatorioPagamento;
import br.ind.lhf.javacore.N_polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Wuerike", 3373, 15000);
        Vendedor v = new Vendedor("Alisson", 5000, 30000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("------------------");
//        relatorio.relatorioPagamentoVendedor(v);
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("------------------");
        relatorio.relatorioPagamentoGenerico(v);

        System.out.println("################");

        Funcionario f = g;
        System.out.println(f.getNome());
        System.out.println(f.getSalario());
        f.calcularPagamento();
        System.out.println(f.getSalario());


    }
}
