package java_basico;

public class Metodo {

    static void soma(int a, int b){
        int s = a + b;
        System.out.println(s);
    }

    static int cal(int a, int b){
        int res = a + b;
        return res;
    }


    public static void main(String[] args) {
        soma(5, 2);

        int r;
        r = cal(4, 9);
        System.out.println(r);
    }
}
