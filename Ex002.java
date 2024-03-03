import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual seu nome: ");
        String nome = teclado.nextLine();

        System.out.printf("Ola %s um praze conhecelo!", nome);
    }
}
