package java_basico;

public class Ex012 {
    public static void main(String[] args) {
        int vetor[] = new int[101];

        for (int i = 0; i < 101; i++) { // colocar os valores de 100 a 200 no vetor
            vetor[i] = i + 100;
        }

        for(int num: vetor){ // imprimir na tela
            System.out.print(num + " ");
        }
    }
}
