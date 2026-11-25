package stream.outros.exercicioUm;

import java.util.stream.Stream;

public class PaletaTintas {

    public static void main(String[] args) {
        System.out.println("=== CORES UNICAS ===");

        Stream.of("azul", "verde", "azul", "branco", "verde", "vermelho")
                .distinct()
                .forEach(c -> System.out.println("Cor: " + c));

        System.out.println("=== LOTES ===");
        long totalLotes = Stream.of(12, 7, 12, 9, 7, 12, 5)
                .count();

        long lotesDistintos = Stream.of(12, 7, 12, 9, 7, 12, 5)
                .distinct()
                .count();

        System.out.println("Total de lotes: " + totalLotes);
        System.out.println("Lotes distintos: " + lotesDistintos);

        System.out.println("=== CODIGOS ===");

        Stream.of("101", "205", "101", "310", "205")
                .map(c -> "COD-" + c)
                .distinct()
                .forEach(System.out::println);
    }
}
