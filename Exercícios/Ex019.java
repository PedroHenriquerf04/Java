package java_basico;

public class Ex019 {
    static void cal_multa(float vel){
        if (vel > 80)
            System.out.println("Alta velocidade, Multa de R$" + (vel - 80) * 5);
    }

    public static void main(String[] args) {
        cal_multa(81);
    }
}
