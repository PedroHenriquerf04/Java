package java_basico.algoritmo_ordenacao;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 6, 1, 5, 2, 8, 3}; // Array de números a ser ordenado
        int tamanho = numeros.length;

        for (int i = 0; i < tamanho - 1; i++) {// Loop principal do Bubble Sort
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    // Troca os elementos de posição
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }// Imprime o array ordenado
        System.out.println("Array ordenado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
