package java_poo.exercicios;

public class AlunoTecnico extends Aluno{
    float n3;

    public AlunoTecnico(String nome, float n1, float n2, float n3) {
        super(nome, n1, n2);
        this.n3 = n3;
    }

    public void calcMedia(){
        this.media = (n1 + n2 + n3)/3;
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
