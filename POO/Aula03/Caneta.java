package java_poo.aula03;

public class Caneta {
    // Atributos
    // Modificador de Visbilidade public, private, protected
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    // Metodos

    public void status(){
        System.out.println("Uma caneta " + this.cor); // this referencia o proprio objeto que chamou
        System.out.println("Tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }
    public void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO, não posso rabiscar...");
        } else{
            System.out.println("Rabisco");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }

    void setPonta(float p){
        this.ponta = p;
    }

}
