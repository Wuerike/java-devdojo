package br.ind.lhf.javacore.E_blocodeinicializacao.classes;

public class Cliente {
    // 1º É alocado espaço na memoria para o objeto que será criado
    // 2º Cada atributo da classe é criado e inicializado com o valor definido ou default
    // 3º Bloco de inicialização é executado
    // 4º O construtor é executado

    // Cria referência para um array
    private int[] parcelas;

    //Bloco de inicialização que preenche o array
    {
        parcelas = new int[100];
        System.out.println("bloco de inicialização");
        for(int i=1; i<=100; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente(){
        System.out.println("construtor");
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
