package java_basico;

public class EstruturaRepeticaoParte1 {
    public static void main(String[] args) {
        /* Estrutura While
        while(teste logico){
            comandos;
            incremento;
        }
         */

        int cont = 0;
        while (cont <= 10){
            cont++;

            if ((cont == 7)||(cont == 5)){
                continue; // interrompe o fluxo natural e volta pro while
            }
            System.out.println(cont);
        }
    }
}
