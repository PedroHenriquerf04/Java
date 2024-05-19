package java_basico.algoritmo_ordenacao;

public class SelectSort {
    public  static void select_sort(int[] v){
        for (int i = 0; i < v.length; i++){
            int indice_menor = i;

            for (int j = i+1; j < v.length; j++){
                if (v[indice_menor] > v[j]){
                    indice_menor = j;
                }
            }

            int aux = v[i];
            v[i] = v[indice_menor];
            v[indice_menor] = aux;
        }
        for (int p = 0; p < v.length; p++){
            System.out.print(v[p]);
        }
    }
    public static void main(String[] args) {
        int vetor[] = {4, 7, 6, 1, 5, 2, 8, 3};

        for (int j = 0; j < vetor.length; j++){
            System.out.print(vetor[j]);
        }
        System.out.println();

        select_sort(vetor);
        /* PARA ACHAR O MENOR VALOR E COLOCAR NA POSIÇÃO 0
        int indice_menor = 0;

        for (int j = 0; j < vetor.length; j++){
            System.out.print(vetor[j]);
        }

        System.out.println();

        for (int i = 1; i < vetor.length; i++){
            if (vetor[i] < vetor[indice_menor]){
                indice_menor = i;
            }
        }

        int aux = vetor[0];
        vetor[0] = vetor[indice_menor];
        vetor[indice_menor] = aux;

        for (int j = 0; j < vetor.length; j++){
            System.out.print(vetor[j]);
        }
        */


    }
}
