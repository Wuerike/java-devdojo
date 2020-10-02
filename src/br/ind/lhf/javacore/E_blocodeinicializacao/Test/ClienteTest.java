package br.ind.lhf.javacore.E_blocodeinicializacao.Test;

import br.ind.lhf.javacore.E_blocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        System.out.println("Exibindo parcelas");
        for(int parcela:c.getParcelas()){
            System.out.print(parcela+" ");
        }

    }
}
