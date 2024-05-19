package java_basico;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        System.out.print("Digite o valor do produto R$");

        Scanner teclado = new Scanner(System.in);
        float valor = teclado.nextFloat();

        float novo_valor;
        novo_valor = valor - valor*5/100;

        System.out.printf("O novo valor do produto com 5%% de desconto é R$%.2f", novo_valor);
    }
}
