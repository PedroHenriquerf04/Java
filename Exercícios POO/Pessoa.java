package java_poo.exercicios;

public abstract class Pessoa {
    String nome, endereco;
    float imposto, renda;
    Bairro bairro;

    public Pessoa(String nome, Bairro bairro, float renda, String endereco) {
        this.nome = nome;
        this.bairro = bairro;
        this.renda = renda;
        this.endereco = endereco;
    }

    public abstract void calcImposto();
}
