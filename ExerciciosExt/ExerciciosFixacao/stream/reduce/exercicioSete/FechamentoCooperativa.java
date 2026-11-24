package stream.reduce.exercicioSete;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class FechamentoCooperativa {

    public static Double calcularRepasse(List<Entrega> entregas, BinaryOperator<Double> regra){
        return entregas.stream()
                .map(e -> e.getSacas() * e.getPrecoSaca())
                .reduce(0.0, regra);
    }

    public static void main(String[] args) {
        List<Entrega> entregas = new ArrayList<>();

        entregas.add(new Entrega("Ana", 120, 900.0, true));
        entregas.add(new Entrega("Bruno", 80, 850.0, false));
        entregas.add(new Entrega("Carla", 200, 950.0, true));
        entregas.add(new Entrega("Diego", 60, 800.0, false));

        System.out.println("=== COOPERATIVA DE CAFE ===");
        int totalSacas = entregas.stream()
                .map(s -> s.getSacas())
                .reduce( 0, (a, b) -> a + b);

        System.out.println("Total de sacas: " + totalSacas);

        double valorCertificadas = entregas.stream()
                .filter(s  -> s.isCertificado())
                .map(s -> s.getSacas() * s.getPrecoSaca())
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("Valor das certificadas: R$ " + valorCertificadas);

        int maiorEntrega = entregas.stream()
                .map(s -> s.getSacas())
                .reduce(0, (a, b) -> a > b ? a : b);

        System.out.println("Maior entrega: " + maiorEntrega + " sacas");

        String produtores = entregas.stream()
                .map(s -> s.getProdutor())
                .reduce("", (a, b) -> a.isEmpty() ? b : a + ", " + b);

        System.out.println("Produtores: " + produtores);

        BinaryOperator<Double> comBonus = (a, b) -> {
            double valorFinal;
            if (b > 100000.0){
                valorFinal = b + 1000.0;
            } else {
                valorFinal = b;
            }

            return a + valorFinal;
        };

        double repasse = calcularRepasse(entregas, comBonus);

        System.out.println("Repasse com bonus: R$ " + repasse);
    }
}
