package java_basico;

public class Ex016 {
    static void aluguel(float d, float km){
        float valor = d*90 + km * 0.20f;

        System.out.printf("O valor a ser pagor: %.2f", valor);
    }

    public static void main(String[] args) {
        aluguel(5, 10);
    }

}
