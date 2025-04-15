package model;

public class Conversao {
    private String moedaOrigem;
    private String moedaDestino;
    private double valor;
    private double valorConvertido;
    private double taxaDeCambio;

    // Construtor
    public Conversao(String moedaOrigem, String moedaDestino, double valor, double valorConvertido, double taxaDeCambio) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valor = valor;
        this.valorConvertido = valorConvertido;
        this.taxaDeCambio = taxaDeCambio;
    }

    // Getters
    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public double getValor() {
        return valor;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public double getTaxaDeCambio() {
        return taxaDeCambio;
    }

    // Método toString para formatar a exibição da conversão
    @Override
    public String toString() {
        return String.format("Moeda de origem: %s\nMoeda de destino: %s\nValor original: %.2f\nValor convertido: %.2f\nTaxa de câmbio: %.4f",
                moedaOrigem, moedaDestino, valor, valorConvertido, taxaDeCambio);
    }
}
