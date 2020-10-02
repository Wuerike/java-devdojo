package br.ind.lhf.introducao;

public class Arrays4 {
    public static void main(String[] args) {
        int[][] dias = new int[3][];

        dias[0] = new int[5];
        dias[1] = new int[3];
        dias[2] = new int[4];

        for(int[] ref:dias){
            int i = 0;
            for(int j=0; j<ref.length; j++){
                i += 1;
                ref[j] = i;
            }
        }

        for(int[] ref:dias){
            for(int dia:ref){
                System.out.println(dia);
            }
            System.out.println("-----------");
        }
    }
}
