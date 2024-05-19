package java_poo.exercicios;

public class Carro extends Veiculo{
    private String modelo;
    private float valor;
    private int ano;

    public Carro(String marca, String placa, String modelo, float valor, int ano) {
        super(marca, placa);
        this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
    }

    @Override
    public void calcIpva(){
        float ipva;
        ipva = this.valor*0.04f;
        System.out.println("O valor do IPVA R$" + ipva);
    }
}
