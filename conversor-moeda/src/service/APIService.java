package service;

import util.HttpClientUtil;

public class APIService {
    private HttpClientUtil httpClientUtil;

    public APIService() {
        this.httpClientUtil = new HttpClientUtil();
    }

    // Exemplo de método para obter a taxa de câmbio
    public double obterTaxaDeCambio(String moedaOrigem, String moedaDestino) {
        // Supondo que o HttpClientUtil seja responsável por fazer requisições HTTP e obter a taxa de câmbio
        return httpClientUtil.obterTaxaDeCambio(moedaOrigem, moedaDestino);
    }
}
