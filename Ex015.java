package java_basico;

public class Ex015 {
    public static void main(String[] args) {
        int par[] = new int[50];
        int cont = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                par[cont] = i;
                cont++;
            }
        }

        for(int valor: par){
            System.out.print(valor + " ");
        }
    }
}
