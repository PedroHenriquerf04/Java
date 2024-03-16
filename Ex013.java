package java_basico;

import java.util.Arrays;

public class Ex013 {
    public static void main(String[] args) {
        int vetor[] = new int[101];
        int aux = 200;

        for (int i = 0; i < 101; i++) { // colocar os valores de 200 a 100 no vetor
            vetor[i] = aux;
            aux--;
        }

        for(int num: vetor){ // imprimir na tela
            System.out.print(num + " ");
        }
    }
}
