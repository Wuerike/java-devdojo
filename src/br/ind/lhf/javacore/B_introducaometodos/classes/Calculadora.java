package br.ind.lhf.javacore.B_introducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);
    }

    public void subtraiDoisNumeros(){
        System.out.println(5-5);
    }

    public void multiplicaDosiNumeros(int n1, int n2){
        System.out.println(n1*n2);
    }

    public double divideDoisNumeros(double n1, double n2){
        if(n2 != 0) {
            return n1 / n2;
        } else{
            return 0;
        }
    }

    public void imprimeDoisNumeros(double n1, double n2){
        if(n2 != 0) {
            System.out.println(n1/n2);
            return;
        }

        System.out.println("Erro: Divisão por zero.");
    }

    public void somaVarArg(int... numeros){
        int soma=0;
        for(int num:numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
