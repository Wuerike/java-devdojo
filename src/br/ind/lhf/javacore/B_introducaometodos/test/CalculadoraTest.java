package br.ind.lhf.javacore.B_introducaometodos.test;

import br.ind.lhf.javacore.B_introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDosiNumeros(7,10 );
        System.out.println(calc.divideDoisNumeros(9d,3d));
        calc.imprimeDoisNumeros(9d,0);

        calc.somaVarArg(1,2,3,4,5);
    }
}
