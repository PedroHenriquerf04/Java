package java_poo.exercicios;

public class Bola {
    String cor, material;
    float circunferencia;

    public Bola(String c, String m, float cir){
        this.cor = c;
        this.material = m;
        this.circunferencia = cir;
    }

    public void trocarCor(String cor){
        this.cor = cor;
    }

    public void mostraCor(){
        System.out.println("Cor da bola: " + this.cor);
    }
}
