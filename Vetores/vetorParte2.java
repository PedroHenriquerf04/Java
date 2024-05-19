package java_basico;

import java.util.Arrays;

public class vetorParte2 {
    public static void main(String[] args) {
        int vet[] = new int[5];

        Arrays.fill(vet, 0); // preencher o todos os indice com o valor "0"

        for (int valor: vet) {
            System.out.print(valor + " ");
        }
    }
}
