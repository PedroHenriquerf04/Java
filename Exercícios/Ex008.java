package java_basico;

import java.util.Scanner;

public class Ex008 {
    // Calcula a quantidade de dinheiro em real e converte em dolar
    public static void main(String[] args) {
        System.out.print("Real: R$");
        Scanner teclado = new Scanner(System.in);
        float real = teclado.nextFloat();

        System.out.printf("R$%.2f e igual a $%.2f", real, real/4.48);
    }
}
