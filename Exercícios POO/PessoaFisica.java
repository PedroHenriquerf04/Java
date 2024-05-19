package java_poo.exercicios;

public class PessoaFisica extends Pessoa{
    String cpf;

    public PessoaFisica(String nome, Bairro bairro, float renda, String endereco, String cpf) {
        super(nome, bairro, renda, endereco);
        this.cpf = cpf;
    }

    @Override
    public void calcImposto() {
        if (this.renda <= 3000){
            System.out.println("Isento.");
        } else if (this.renda <= 4000) {
            this.imposto = this.renda*0.10f;
            System.out.println("Imposto de R$" + this.imposto);
        } else if (this.renda <= 6000) {
            this.imposto = this.renda*0.20f;
            System.out.println("Imposto de R$" + this.imposto);
        } else {
            this.imposto = this.renda*0.30f;
            System.out.println("Imposto de R$" + this.imposto);
        }
    }
}
