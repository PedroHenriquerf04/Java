package java_basico;

import java.util.Scanner;

public class Ex006 {
    // Programa que calcula aumento de 15% do salario
    public static void main(String[] args) {
        System.out.print("Digite o salario: R$");
        Scanner teclado = new Scanner(System.in);
        float sal = teclado.nextFloat();

        System.out.printf("O novo salario é R$%.2f", sal + sal*15/100);
    }
}
