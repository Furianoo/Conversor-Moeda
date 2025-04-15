package app;

import model.Conversao;
import model.ConversaoRequest;
import service.APIService;
import service.ConversorService;
import service.HistoricoService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class ConversorDeMoedaApp {
    private static final Set<String> MOEDAS_DISPONIVEIS = new HashSet<>(Arrays.asList(
            "ARS", "BOB", "BRL", "CLP", "COP", "USD"
    ));

    // Mapeamento de números por extenso para números inteiros
    private static final java.util.Map<String, Integer> NUMEROS_POR_EXTENSO = new java.util.HashMap<>();
    static {
        NUMEROS_POR_EXTENSO.put("zero", 0);
        NUMEROS_POR_EXTENSO.put("um", 1);
        NUMEROS_POR_EXTENSO.put("dois", 2);
        NUMEROS_POR_EXTENSO.put("três", 3);
        NUMEROS_POR_EXTENSO.put("quatro", 4);
        NUMEROS_POR_EXTENSO.put("cinco", 5);
        NUMEROS_POR_EXTENSO.put("seis", 6);
        NUMEROS_POR_EXTENSO.put("sete", 7);
        NUMEROS_POR_EXTENSO.put("oito", 8);
        NUMEROS_POR_EXTENSO.put("nove", 9);
        NUMEROS_POR_EXTENSO.put("dez", 10);
        NUMEROS_POR_EXTENSO.put("onze", 11);
        NUMEROS_POR_EXTENSO.put("doze", 12);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        APIService apiService = new APIService();
        ConversorService conversorService = new ConversorService(apiService);
        HistoricoService historicoService = new HistoricoService();

        int opcao = -1; // Valor inicial para entrar no loop

        do {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║         CONVERSOR DE MOEDAS         ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ 1  - ARS (Peso Argentino) → BRL      ║");
            System.out.println("║ 2  - BOB (Boliviano) → BRL           ║");
            System.out.println("║ 3  - CLP (Peso Chileno) → BRL        ║");
            System.out.println("║ 4  - COP (Peso Colombiano) → BRL     ║");
            System.out.println("║ 5  - USD (Dólar Americano) → BRL     ║");
            System.out.println("║ 6  - BRL → ARS                       ║");
            System.out.println("║ 7  - BRL → BOB                       ║");
            System.out.println("║ 8  - BRL → CLP                       ║");
            System.out.println("║ 9  - BRL → COP                       ║");
            System.out.println("║ 10 - BRL → USD                       ║");
            System.out.println("║ 11 - Conversão personalizada         ║");
            System.out.println("║ 12 - Exibir histórico                ║");
            System.out.println("║ 0  - Sair                            ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Escolha uma opção: ");

            // Usando nextLine para capturar qualquer entrada
            String input = scanner.nextLine().trim().toLowerCase();

            // Verifica se a entrada é um número ou um número por extenso
            try {
                if (NUMEROS_POR_EXTENSO.containsKey(input)) {
                    opcao = NUMEROS_POR_EXTENSO.get(input);
                } else {
                    opcao = Integer.parseInt(input); // Tenta converter para inteiro
                }

                if (opcao < 0 || opcao > 12) {
                    System.out.println("Entrada inválida. Digite um número entre 0 e 12.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número entre 0 e 12.");
                continue;  // Volta para o início do loop se a entrada for inválida
            }

            String moedaOrigem = "";
            String moedaDestino = "";
            double valor;

            switch (opcao) {
                case 1: moedaOrigem = "ARS"; moedaDestino = "BRL"; break;
                case 2: moedaOrigem = "BOB"; moedaDestino = "BRL"; break;
                case 3: moedaOrigem = "CLP"; moedaDestino = "BRL"; break;
                case 4: moedaOrigem = "COP"; moedaDestino = "BRL"; break;
                case 5: moedaOrigem = "USD"; moedaDestino = "BRL"; break;
                case 6: moedaOrigem = "BRL"; moedaDestino = "ARS"; break;
                case 7: moedaOrigem = "BRL"; moedaDestino = "BOB"; break;
                case 8: moedaOrigem = "BRL"; moedaDestino = "CLP"; break;
                case 9: moedaOrigem = "BRL"; moedaDestino = "COP"; break;
                case 10: moedaOrigem = "BRL"; moedaDestino = "USD"; break;
                case 11:
                    System.out.println("\nMoedas disponíveis: " + MOEDAS_DISPONIVEIS);
                    System.out.print("Informe a moeda de origem: ");
                    moedaOrigem = scanner.nextLine().toUpperCase();
                    while (!MOEDAS_DISPONIVEIS.contains(moedaOrigem)) {
                        System.out.print("Moeda inválida. Tente novamente: ");
                        moedaOrigem = scanner.nextLine().toUpperCase();
                    }

                    System.out.print("Informe a moeda de destino: ");
                    moedaDestino = scanner.nextLine().toUpperCase();
                    while (!MOEDAS_DISPONIVEIS.contains(moedaDestino)) {
                        System.out.print("Moeda inválida. Tente novamente: ");
                        moedaDestino = scanner.nextLine().toUpperCase();
                    }
                    break;
                case 12:
                    historicoService.exibirHistorico();
                    continue;
                case 0:
                    System.out.println("\nEncerrando o conversor. Até a próxima!");
                    continue;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    continue;
            }

            System.out.print("Informe o valor a ser convertido: ");
            while (true) {
                try {
                    valor = scanner.nextDouble();
                    scanner.nextLine(); // Limpar buffer
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Valor inválido. Digite um número válido para o valor: ");
                    scanner.nextLine(); // Limpar buffer
                }
            }

            try {
                ConversaoRequest request = new ConversaoRequest(moedaOrigem, moedaDestino, valor);
                Conversao conversao = conversorService.converter(request);

                System.out.println("\n=== Resultado da Conversão ===");
                System.out.println("De: " + conversao.getMoedaOrigem());
                System.out.println("Para: " + conversao.getMoedaDestino());
                System.out.printf("Valor original: %.2f%n", conversao.getValor());
                System.out.printf("Valor convertido: %.2f%n", conversao.getValorConvertido());
                System.out.printf("Taxa de câmbio: %.4f%n", conversao.getTaxaDeCambio());

                // Adicionando conversão no histórico
                historicoService.adicionarHistorico(conversao);

            } catch (Exception e) {
                System.out.println("Erro ao realizar a conversão: " + e.getMessage());
            }

        } while (opcao != 0);

        scanner.close();
    }
}
