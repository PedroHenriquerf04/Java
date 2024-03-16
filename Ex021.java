package java_basico;

import java.util.Scanner;

public class Ex021 {
    static float cal_desc(String s, float v){
        float novo_valor = 0;
        switch (s){
            case "f":
                novo_valor = v - v*13/100;
                break;
            case "m":
                novo_valor = v - v*0.05f;
                break;
        }
        return novo_valor;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.next();

        System.out.print("Sexo [f/m]: ");
        String sexo = teclado.next();

        System.out.print("Valor da comprar: ");
        float valor = teclado.nextFloat();

        float resp = cal_desc(sexo, valor);

        System.out.printf("%s novo valor das compras com o desconto R$%.2f", nome, resp);
    }
}
