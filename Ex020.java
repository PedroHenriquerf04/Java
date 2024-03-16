package java_basico;

import java.util.Scanner;

public class Ex020 {
    static float cal_viagem(float km){
        float valor;
        if (km <= 200){
            valor = km * 0.50f;
        } else {
            valor = (float) (km * 0.45);
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float resp, km;

        System.out.print("Qunatidade de KM: ");
        km = teclado.nextFloat();

        resp = cal_viagem(km);

        System.out.println("O valor da viagem e R$" + resp);
    }
}
