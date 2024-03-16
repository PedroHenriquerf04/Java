package java_basico;

public class Ex017 {
    static void cal_parede(float l, float a){
        float area = l*a;
        float quant = area / 2f;
        System.out.printf("Uma parede de %.1f precisara de %.1f litros de tinta", area, quant);

    }

    public static void main(String[] args) {
        cal_parede(2, 2);
    }
}
