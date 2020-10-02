package br.ind.lhf.javacore.F_modificadorestatico.classes;

public class Cliente {
    // 1º Bloco de inicialização estatico é inicicializado pela JVM ao notar a classe
    // 2º É alocado espaço na memoria para o objeto que será criado
    // 3º Cada atributo da classe é criado e inicializado com o valor definido ou default
    // 4º Bloco de inicialização é executado
    // 5º O construtor é executado

    // Cria referência para um array
    private static int[] parcelas;
    {
        System.out.println("bloco de inicialização não estatico");
    }

    //Bloco de inicialização que preenche o array
    static {
        int size = 3;
        parcelas = new int[size];
        System.out.println("bloco de inicialização estatico");
        for(int i=1; i<=size; i++){
            parcelas[i-1] = i;
        }
    }

    static{
        System.out.println("bloco de inicialização estatico 2");
    }

    static {
        System.out.println("bloco de inicialização estatico 3");
    }

    public Cliente(){
        System.out.println("construtor");
    }

    public static int[] getParcelas() {
        return parcelas;
    }

}
