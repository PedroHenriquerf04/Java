package java_poo.exercicios;

public class TesteBombaCombustivel {
    public static void main(String[] args) {
        BombaCombustivel[] bomba = new BombaCombustivel[2];

        bomba[0] = new BombaCombustivel("Gasolina", 5.58f, 500);
        bomba[1] = new BombaCombustivel("Aditiva", 4.69f, 500);

        bomba[0].status();
        bomba[1].status();

        bomba[1].abastecerPorLitro(50);
        bomba[0].abastecerPorValor(60);

        bomba[0].status();
        bomba[1].status();

    }

}
