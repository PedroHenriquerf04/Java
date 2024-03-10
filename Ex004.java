package java_basico;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        System.out.print("Numeros de dias trabalhados: ");

        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        float sal;
        sal = (8 * 25) * num;

        System.out.printf("O salario do funcionario é R$%.2f", sal);
    }
}
