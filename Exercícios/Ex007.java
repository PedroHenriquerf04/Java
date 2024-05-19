package java_basico;

import java.util.Scanner;

public class Ex007 {
    // Programa que calcula o valor de um aluguel de carro
    public static void main(String[] args) {
        System.out.print("KM percorrido: ");
        Scanner teclado = new Scanner(System.in);
        byte km = teclado.nextByte();

        System.out.print("Dias de aluguel: ");
        byte dias = teclado.nextByte();

        System.out.printf("O valor do aluguel do carro: R$%.2f", dias * 90 + km*0.20);
    }
}
