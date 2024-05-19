package java_poo.exercicios;

public class TestePessoa {
    public static void main(String[] args) {
        Bairro b1 = new Bairro("Alvorada");

        PessoaFisica p1 = new PessoaFisica("Pedro", b1, 6000, "Rua 1", "123.456.789.13");
        p1.calcImposto();
    }
}
