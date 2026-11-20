package stream.map.exercicioNove;

import java.util.Arrays;
import java.util.stream.Stream;

public class CarneFinanciamento {

    public static void main(String[] args) {

        System.out.println("=== PARCELAS ===");
        Stream.iterate(1, p -> p + 1)
                .limit(5)
                .map(p -> "Parcela " + p + "/5")
                .forEach(System.out::println);

        Double[] valores = {850.0, 850.0, 900.0};

        System.out.println("=== VALORES ===");
        Arrays.stream(valores)
                .map(v -> v + " -> " + (v > 880.0 ? "ALTA" : "NORMAL"))
                .forEach(System.out::println);

        System.out.println("=== CODIGOS ===");
        Stream.of("001", "002", "003")
                .map(c -> "BR-" + c)
                .map(c -> c + "-X")
                .forEach(System.out::println);
    }
}
