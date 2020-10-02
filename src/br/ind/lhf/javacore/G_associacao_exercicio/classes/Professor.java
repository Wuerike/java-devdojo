package br.ind.lhf.javacore.G_associacao_exercicio.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);

        System.out.println("Seminarios:");
        if (this.seminarios==null || this.seminarios.length == 0){
            System.out.println("Seminário não cadastrado");
        }
        else{
            for(Seminario seminario:this.seminarios){
                System.out.println(seminario.getTitulo());
            }
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
