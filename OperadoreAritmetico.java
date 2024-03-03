public class OperadoreAritmetico {
    public static void main(String[] args) {

        int num = 1, num2 = 3;
        // adiçao ou concatenaçao (+), subtraçao (-), multiplicaçao (*), divisao (/), resto da divisao (%), ++ incremento, -- decremento,
        System.out.printf("adiçao +: %d", num+num2);
        System.out.printf("\nsubtraçao -: %d", num-num2);
        System.out.printf("\nmultiplicaçao *: %d", num*num2);
        System.out.printf("\ndivisao /: %d", 5/2);
        System.out.printf("\nresto da divisao %%: %d", num%num2);

        System.out.println();

        int num3 = 5;
        int valor1 = 5 + num3++;

        int num4 = 5;
        int valor2 = 5 + ++num4;

        System.out.println(valor1);
        System.out.println(valor2);
    }
}
