package stream.filter.exercicioNove;

import java.util.stream.Stream;

public class MedidorAgua {

    public static void main(String[] args) {
        System.out.println("=== LIMIT ANTES DO FILTER ===");
        Stream.iterate(10, n -> n + 15)
                .limit(8)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println("Leitura: " + n + " m3"));

        System.out.println("=== FILTER ANTES DO LIMIT ===");
        Stream.iterate(10, n -> n + 15)
                .filter(n -> n % 2 == 0)
                .limit(3)
                .forEach(n -> System.out.println("Par: " + n));

        System.out.println("=== ACIMA DE 50 ===");
        long acimaDe50 = Stream.iterate(100, n -> n - 12)
                .limit(10)
                .filter(n -> n > 50)
                .count();

        System.out.println("Leituras acima de 50: " + acimaDe50);
    }
}
