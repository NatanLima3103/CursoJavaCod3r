package stream.map.exercicioSete;

import java.util.ArrayList;
import java.util.List;

public class PainelOficina {

    public static void main(String[] args) {
        List<OrdemServico> ordens = new ArrayList<>();

        ordens.add(new OrdemServico("ABC1D23", "Troca de oleo", 180.0, 120.0));
        ordens.add(new OrdemServico("XYZ9K88", "Revisao completa", 950.0, 400.0));
        ordens.add(new OrdemServico("JKL4M56", "Alinhamento", 0.0, 90.0));

        System.out.println("=== RESUMO ===");
        ordens.stream()
                .map(o -> o.getPlaca() + " | " + o.getServico())
                .forEach(System.out::println);

        System.out.println("=== TOTAIS ===");
        ordens.stream()
                .map(o -> {
                    double total = o.getValorPecas() + o.getValorMaoObra();
                    String aviso;
                    if (total > 1000.0){
                        aviso = " (APROVACAO NECESSARIA)";
                    } else {
                        aviso = "";
                    }
                    return o.getPlaca() + ": R$ " + total + aviso;
                })
                .forEach(System.out::println);

        System.out.println("=== CONTAGEM ===");
        long linhas = ordens.stream()
                .map(o -> o.getPlaca())
                .count();
        System.out.println("Linhas no painel: " + linhas);
    }
}
