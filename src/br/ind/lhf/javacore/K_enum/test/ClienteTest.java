package br.ind.lhf.javacore.K_enum.test;

import br.ind.lhf.javacore.K_enum.classes.Cliente;
import br.ind.lhf.javacore.K_enum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(c);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
    }
}
