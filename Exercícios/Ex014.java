package java_basico;

public class Ex014 {
    public static void main(String[] args) {
        int vetor[] = new int[100];
        int aux = 0;

        for(int i = 1; i <= 500; i++) {
            if (i % 5 == 0){
                vetor[aux] = i;
                aux++;
            }
        }

        for(int num: vetor){ // imprimir na tela
            System.out.print(num + " ");
        }
    }
}
