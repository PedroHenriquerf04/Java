package java_poo.exercicios;
/*
Classe Bomba de Combustível: Faça um programa completo utilizando classes e métodos que:

Possua uma classe chamada bombaCombustível, com no mínimo esses atributos:
    tipoCombustivel.
    valorLitro
    quantidadeCombustivel
Possua no mínimo esses métodos:
    abastecerPorValor( ) – método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
    abastecerPorLitro( ) – método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
    alterarValor( ) – altera o valor do litro do combustível.
    alterarCombustivel( ) – altera o tipo do combustível.
    alterarQuantidadeCombustivel( ) – altera a quantidade de combustível restante na bomba.
OBS: Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba.
 */
public class BombaCombustivel {
    // Atributos e Construtor
    private String tipoCombustivel;
    private float valor, quantidadeCombustivel;

    public BombaCombustivel(String tipo, float valor, float quantCombustivel){
        this.setTipoCombustivel(tipo);
        this.setValor(valor);
        this.setQuantidadeCombustivel(quantCombustivel);
    }

    // Metodos Especiais

    private String getTipoCombustivel() {
        return tipoCombustivel;
    }

    private void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    private float getValor() {
        return valor;
    }

    private void setValor(float valor) {
        this.valor = valor;
    }

    private float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    private void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    // Metodos
    public void abastecerPorValor(float valor){
        float quant;
        quant = valor/this.getValor();
        if (this.getQuantidadeCombustivel() > quant){
            System.out.println("Tipo: " + this.getTipoCombustivel());
            System.out.printf("Valor a abastecer: R$%.2f", valor);
            System.out.println("\nPreço: R$" + this.getValor());
            System.out.printf("Litros: %.1f", quant);
            System.out.println();
            this.alterarQuantidadeCombustivel(quant);
        } else{
            System.out.println("Quantidade de combustivel insuficiente.");
        }
    }
    public void abastecerPorLitro(float litro){
        float valor;
        valor = litro * this.getValor();
        if (this.getQuantidadeCombustivel() > litro){
            System.out.println("Tipo: " + this.getTipoCombustivel());
            System.out.printf("Valor a abastecer: R$%.2f", valor);
            System.out.println("\nPreço: R$" + this.getValor());
            System.out.printf("Litros: %.1f", litro);
            this.alterarQuantidadeCombustivel(litro);
            System.out.println();
        } else {
            System.out.println("Quantidade de combustivel insuficiente.");
        }
    }
    public void alterarValor(float novoValor){
        this.setValor(novoValor);
    }
    public void alterarCombustivel(String novoTipo){
        this.setTipoCombustivel(novoTipo);
    }
    public void alterarQuantidadeCombustivel(float novaQuanti){
        this.setQuantidadeCombustivel(this.getQuantidadeCombustivel() - novaQuanti);
    }

    public void status(){
        System.out.println("Tipo: " + this.getTipoCombustivel());
        System.out.println("Valor: R$" + this.getValor());
        System.out.printf("Quantidade de combustivel: %.2f", this.getQuantidadeCombustivel());
        System.out.println();
    }
}
