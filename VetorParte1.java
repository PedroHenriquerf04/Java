package java_basico;

import java.util.Arrays;
import java.util.Scanner;

public class VetorParte1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /* Variavel composta
            int n[] = new int[4]; ou int n[] = {3,4,9,7};
            n[0] = 3;
         */

        int n[] = {3,9,4,7};

        System.out.println(n.length); // length e o comprimento do vetor

        int pos = Arrays.binarySearch(n, 7); // procura um valor no vetor e mostra a sua posição
        System.out.println("\n"+pos);

        for(int i = 0; i < 4; i++){
            System.out.print(n[i] + " ");
        }

        Arrays.sort(n); // colocar em ordem o vetor

        for (int valor: n) { // a cada loop o valor e um indice do vetor n
            System.out.print(valor + " ");
        }
    }
}
