package java_basico;

public class Ex010 {
    public static void main(String[] args) {
        int vetor[] = new int[100];

        for (int i = 1; i <= 100 ; i++) { // colocar os valores de 1 a 100 no vetor
            vetor[i - 1 ] = i;
        }

        for(int num: vetor){ // imprimir na tela
            System.out.print(num + " ");
        }
    }
}
