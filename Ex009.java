package java_basico;

public class Ex009 {
    public static void main(String[] args) {
        // Execicio de Vetor
        // vetor quer amarzena valores de 0 a 50 e imprimir na tela

        int vet[] = new int[51];

        for (int i = 0; i < 51; i++) { // colocar os valores de 0 a 50 no vetor
            vet[i] = i;
        }

        for (int valor: vet){ // imprimir na tela
            System.out.print(valor + " ");
        }
    }
}
