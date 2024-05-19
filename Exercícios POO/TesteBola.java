package java_poo.exercicios;

public class TesteBola {
    public static void main(String[] args) {
        Bola bola = new Bola("Azul", "Plastico", 1.50f);
        bola.mostraCor();
        bola.trocarCor("Vermelho");
        bola.mostraCor();
    }
}
