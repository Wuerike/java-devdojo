package br.ind.lhf.introducao;

public class Arrays1 {

    public static void main(String[] args) {
        int[] idades = new int[5];

        for (short i = 0; i<5; i++){
            idades[i]=i*10;
        }

        for (short i = 0; i<idades.length; i++){
            System.out.println(idades[i]);
        }

    }

}
