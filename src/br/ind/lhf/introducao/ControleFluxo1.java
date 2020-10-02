package br.ind.lhf.introducao;

public class ControleFluxo1 {
    public static void main(String[] args) {

        if(false){
            System.out.println("If igual a true");
        }
        else{
            System.out.println("If igual a false");
        }

        // Operador ternário
        int idade = 10;
        String status;

        status = idade<18 ? "menor de 18":"menos de 18";
        System.out.println(status);

    }
}
