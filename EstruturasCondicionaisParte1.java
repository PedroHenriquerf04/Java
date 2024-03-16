package java_basico;

import java.util.Scanner;

public class EstruturasCondicionaisParte1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*      Estruturas Condicionais simples
        if (condição){
            Comando;
        }
        =================================================
                            Composta
        if (condição){
            comando;
        } else {
            comando;
        }
        =================================================

         */

        // Simples
        System.out.print("Nota: ");
        float n1 = teclado.nextFloat();

        System.out.print("Nota: ");
        float n2 = teclado.nextFloat();

        float media = (n1+n2)/2;

        if (media >= 5){
            System.out.print("Aprovado");
        }

        System.out.println();

        // Composta
        System.out.print("Ano de nascimento: ");
        int nasc = teclado.nextInt();

        int idade = 2024 - nasc;

        System.out.println("Sua idade e " + idade);

        if (idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

    }
}
