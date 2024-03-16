package java_basico;

import java.util.Scanner;

public class EstruturasCondicionaisParte2 {
    public static void main(String[] args) {
        /* Estrutura Condicionais Encadeada
        if(condiçao){
            Comando;
        } else if(condiçao){
            comando;
        } else{
            comando;
        }

        =============================================
        Switch(variavel){
            case 1:
                comando;
                break;
            case 2:
                comando;
                break;
            default:
                comando;

        }

         */

        Scanner  teclado = new Scanner(System.in);
        System.out.print("Quant de pernas: ");
        int pernas = teclado.nextInt();

        String tipo;

        switch (pernas){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "Biperdi";
                break;
            default:
                tipo = "ET";
        }

        System.out.println(tipo);

    }
}
