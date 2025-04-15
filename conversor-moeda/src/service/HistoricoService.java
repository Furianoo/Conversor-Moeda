package service;

import model.Conversao;
import java.util.ArrayList;
import java.util.List;

public class HistoricoService {
    private List<Conversao> historicoList = new ArrayList<>();

    // Método para adicionar uma conversão no histórico
    public void adicionarHistorico(Conversao conversao) {
        historicoList.add(conversao);
    }

    // Método para exibir o histórico de conversões
    public void exibirHistorico() {
        if (historicoList.isEmpty()) {
            System.out.println("Nenhuma conversão realizada ainda.");
        } else {
            for (Conversao conversao : historicoList) {
                System.out.println(conversao);
            }
        }
    }
}
