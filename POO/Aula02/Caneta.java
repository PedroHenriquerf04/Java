package java_poo.aula02;

public class Caneta {
    // Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // Metodos

    void status(){
        System.out.println("Uma caneta " + this.cor); // this referencia o proprio objeto que chamou
        System.out.println("Tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: " + this.carga);
    }
    void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO, não posso rabiscar...");
        } else{
            System.out.println("Rabisco");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

}
