package java_basico;

public class Ex011 {
    public static void main(String[] args) {
        int vetor[] = new int[100];
        int aux = 0;

        for (int i = 100; i >= 1 ; i--) { // colocar os valores de 100 a 1 no vetor
            vetor[aux] = i;
            aux++;
        }

        for(int num: vetor){ // imprimir na tela
            System.out.print(num + " ");
        }
    }
}
