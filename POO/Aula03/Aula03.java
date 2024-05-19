package java_poo.aula03;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "BIC";
        c1.cor = "Azul";

        c1.status();
        c1.setPonta(0.5f);
        c1.status();
    }
}
