package br.ind.lhf.javacore.G_associacao_exercicio.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void init(Professor professor, Aluno[] alunos, Local local){
        this.professor = professor;
        this.alunos = alunos;
        this.local = local;
    }


    public void imprime(){
        System.out.println("Titulo: "+this.titulo);

        if(this.professor==null){
            System.out.println("Professor palestrante não cadastrado.");
        }else{
            System.out.println("Professor: "+this.professor.getNome());
        }

        if(this.local==null){
            System.out.println("Local do seminário não cadastrado.");
        }else{
            System.out.println("Local: "+this.local.getRua()+", "+this.local.getBairro());
        }

        if (this.alunos==null || this.alunos.length == 0){
            System.out.println("Alunos participantes não cadastrados.");
        } else {
            System.out.println("Lista de participantes:");
            for (Aluno aluno: this.alunos){
                System.out.println("Nome: "+aluno.getNome()+", idade: "+aluno.getIdade());
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
