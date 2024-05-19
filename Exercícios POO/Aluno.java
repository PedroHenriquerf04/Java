package java_poo.exercicios;

public class Aluno {
    // ATRIBUTOS E CONSTRUTOR
    String nome, status;
    float n1, n2, media;

    public Aluno(String nome, float n1, float n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    // METODOS
    public void calcMedia(){
        this.media = (n1 + n2)/2;
    }

    public void statusAluno(){
        if (this.media > 6){
            this.status = "APROVADO";
        } else if (this.media > 4) {
            this.status = "RECUPERAÇÃO";
        } else {
            this.status = "REPROVADO";
        }
        System.out.println(this.status);
    }

}
