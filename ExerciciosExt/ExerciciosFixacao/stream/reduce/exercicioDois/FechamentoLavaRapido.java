package stream.reduce.exercicioDois;

import java.util.ArrayList;
import java.util.List;

public class FechamentoLavaRapido {

    public static void main(String[] args) {
        List<Lavagem> lavagens = new ArrayList<>();

        lavagens.add(new Lavagem("ABC1D23", "Simples", 40.0, 25));
        lavagens.add(new Lavagem("XYZ9A88", "Completa", 90.0, 50));
        lavagens.add(new Lavagem("QWE4R56", "Simples", 40.0, 30));
        lavagens.add(new Lavagem("JKL7M11", "Cera", 120.0, 70));

        System.out.println("=== FECHAMENTO DO DIA ===");
        double faturamento = lavagens.stream()
                .map(l -> l.getValor())
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("Faturamento: R$ " + faturamento);

        int tempoTotal = lavagens.stream()
                .map(l -> l.getMinutos())
                .reduce(0, (a, b) -> a + b);

        System.out.println("Tempo total: " + tempoTotal + " min");

        double parteLavadores = lavagens.stream()
                .map(l -> l.getValor() / 2)
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("Parte dos lavadores: R$ " + parteLavadores);
    }
}
