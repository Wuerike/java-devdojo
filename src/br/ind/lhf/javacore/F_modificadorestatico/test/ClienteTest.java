package br.ind.lhf.javacore.F_modificadorestatico.test;

import br.ind.lhf.javacore.F_modificadorestatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo parcelas");
        for(int parcela:c.getParcelas()){
            System.out.print(parcela+" ");
        }

    }
}
