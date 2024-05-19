package java_poo.exercicios;

public abstract class Veiculo {
    private String marca;
    private String placa;

    public Veiculo(String marca, String placa) {
        this.setMarca(marca);
        this.setPlaca(placa);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract void calcIpva();
}
