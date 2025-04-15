package service;

import model.Conversao;
import model.ConversaoRequest;

public class ConversorService {
    private APIService apiService;

    public ConversorService(APIService apiService) {
        this.apiService = apiService;
    }

    public Conversao converter(ConversaoRequest request) throws Exception {
        // Usando o APIService para obter a taxa de câmbio
        double taxaDeCambio = apiService.obterTaxaDeCambio(request.getMoedaOrigem(), request.getMoedaDestino());

        // Realizando a conversão do valor
        double valorConvertido = request.getValor() * taxaDeCambio;

        return new Conversao(
                request.getMoedaOrigem(),
                request.getMoedaDestino(),
                request.getValor(),
                valorConvertido,
                taxaDeCambio
        );
    }
}
