package java_poo.aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true; // referencia de atributo

        c1.status(); // referencia a metodos
        c1.rabiscar();

        System.out.println();

        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
