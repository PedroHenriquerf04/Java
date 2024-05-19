package java_poo.exercicios;

public class PessoaCnpj extends Pessoa{
    String cnpj;

    public PessoaCnpj(String nome, Bairro bairro, float renda, String endereco, String cnpj) {
        super(nome, bairro, renda, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public void calcImposto() {
        if (this.renda <= 5000){
            this.imposto = this.renda*0.05f;
            System.out.println("Imposto de R$" + this.imposto);
        } else if (this.renda <= 25000) {
            this.imposto = this.renda*0.12f;
            System.out.println("Imposto de R$" + this.imposto);
        } else if (this.renda <= 50000) {
            this.imposto = this.renda*0.17f;
            System.out.println("Imposto de R$" + this.imposto);
        } else {
            this.imposto = this.renda*0.20f;
            System.out.println("Imposto de R$" + this.imposto);
        }
    }
}
