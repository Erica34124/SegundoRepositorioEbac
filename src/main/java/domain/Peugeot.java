package domain;

public class Peugeot extends Carro{
    private String modelo;
    private String cor;
    private String quantidadePortas;
    private Float valor;

    public Peugeot(String modelo, String cor, String quantidadePortas, Float valor) {
        this.modelo = modelo;
        this.cor = cor;
        this.quantidadePortas = quantidadePortas;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(String quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
