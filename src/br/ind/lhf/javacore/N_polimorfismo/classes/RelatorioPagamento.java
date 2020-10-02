package br.ind.lhf.javacore.N_polimorfismo.classes;

public class RelatorioPagamento {
//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatorio de pagamento para gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: "+gerente.getNome());
//        System.out.println("Salario: "+gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando relatorio de pagamento para vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: "+vendedor.getNome());
//        System.out.println("Salario: "+vendedor.getSalario());
//    }

    /***
     * Essa função pode receber uma referência de uma classe mais específica
     * e então utiliza os parametros e metodos de forma diferente pra cada classe
     *
     * Parametros e metodos mais específicos que a classe mãe tem de ser chamados
     * utilizando o cast para a classe específica
     */
    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salario: "+funcionario.getSalario());

        if(funcionario instanceof Gerente){
            //Gerente g = (Gerente) funcionario;
            System.out.println("Participacao nos lucros "+((Gerente) funcionario).getParticipacaoLucro());
        }
        if(funcionario instanceof Vendedor){
            //Vendedor v = (Vendedor) funcionario;
            System.out.println("Total de vendas "+((Vendedor) funcionario).getTotalVendas());
        }
    }

}
