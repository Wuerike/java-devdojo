package br.ind.lhf.javacore.G_associacao_exercicio.test;

import br.ind.lhf.javacore.G_associacao_exercicio.classes.Aluno;
import br.ind.lhf.javacore.G_associacao_exercicio.classes.Local;
import br.ind.lhf.javacore.G_associacao_exercicio.classes.Professor;
import br.ind.lhf.javacore.G_associacao_exercicio.classes.Seminario;

public class AssociationTest {
    public static void main(String[] args) {
        int maxAlunos = 5;

        Seminario seminario1 = new Seminario("Tecnologia de Semicondutores");
        Seminario seminario2 = new Seminario("Sistemas Embarcados");
        Seminario seminario3 = new Seminario("Segurança em Eletricidade");
        Seminario seminario4 = new Seminario("Sistemas de Controle");


        Aluno aluno1 = new Aluno("Alexandre", 25);
        Aluno aluno2 = new Aluno("Bruna", 16);
        Aluno aluno3 = new Aluno("Carol", 46);
        Aluno aluno4 = new Aluno("Daniel", 61);
        Aluno aluno5 = new Aluno("Gabriela", 72);
        Aluno[] alunos1 = new Aluno[]{aluno1, aluno2, aluno3, aluno4, aluno5};

        Professor professor1 = new Professor("Carlos", "Eletrônica");

        Local local1 = new Local("Guilherme Hass", "Jaragua Esquerdo");

//        for (Aluno aluno : alunos1) {
//            aluno.setSeminario(seminario1);
//        }

        professor1.setSeminarios(new Seminario[]{seminario1, seminario2, seminario3, seminario4});


        //alunos1[0].imprime();
        //professor1.imprime();
        seminario1.imprime();

    }
}
