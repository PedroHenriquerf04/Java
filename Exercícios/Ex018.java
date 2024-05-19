package java_basico;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Ex018 {
    static int cal_delta(int a, int b, int c){
        int delta = (int) pow(b,2) - 4 * a * abs(c);
        return delta;
    }

    public static void main(String[] args) {
        int resp;
        resp = cal_delta(7,3,4);
        System.out.println(resp);
    }
}
