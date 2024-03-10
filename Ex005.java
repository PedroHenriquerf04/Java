package java_basico;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Ex005 {
    // Programa que calcula o Delta de uma expressão de equação de 2 grau
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        byte a = teclado.nextByte();

        System.out.print("Digite o valor de B: ");
        byte b = teclado.nextByte();

        System.out.print("Digite o valor de C: ");
        byte c = teclado.nextByte();

        int delta;
        delta = (int) pow(b,2) - 4 * a * abs(c);

        System.out.printf("O valor de Delta é: %d", delta);
    }
}
