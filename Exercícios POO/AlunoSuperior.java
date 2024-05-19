package java_poo.exercicios;

public class AlunoSuperior extends AlunoTecnico{
    float n4;

    public AlunoSuperior(String nome, float n1, float n2, float n3, float n4) {
        super(nome, n1, n2, n3);
        this.n4 = n4;
    }
    public void calcMedia(){
        this.media = (n1 + n2 + n3)/3;
    }

    public void statusAluno(){
        if (this.media > 6){
            this.status = "APROVADO";
        } else {
            this.status = "REPROVADO";
        }
        System.out.println(this.status);
    }
}
