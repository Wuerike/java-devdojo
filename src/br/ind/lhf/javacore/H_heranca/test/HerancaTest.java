package br.ind.lhf.javacore.H_heranca.test;

import br.ind.lhf.javacore.H_heranca.classes.Endereco;
import br.ind.lhf.javacore.H_heranca.classes.Funcionario;
import br.ind.lhf.javacore.H_heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa("Wuerike");
        Endereco end = new Endereco();
//        p.setNome("Wuerike");
//        p.setCpf("06531569956");
        end.setBairro("Jaragua Esquerdo");
        end.setRua("Guilherme Hass, 134");
//        p.setEndereco(end);
//        p.imprime();
//
//        System.out.println("-------------");

        Funcionario f = new Funcionario("Henrique");
//        f.setNome("Henrique");
        f.setCpf("9634495654");
        f.setSalario(3373.56);
        f.setEndereco(end);
//        f.imprime();

    }
}
