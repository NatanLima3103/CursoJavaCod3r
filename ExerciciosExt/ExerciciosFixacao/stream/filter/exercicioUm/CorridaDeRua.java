package stream.filter.exercicioUm;

import java.util.stream.Stream;

public class CorridaDeRua {

    public static void main(String[] args) {

        Stream<Integer> idades = Stream.of(15, 22, 17, 34, 48, 12);

        System.out.println("=== INSCRITOS ADULTOS ===");

        idades
                .filter(i -> i >= 18)
                .map(i -> "Idade: " + i)
                .forEach(System.out::println);

        Stream<String> nomes = Stream.of("Marcos", "Ana", "Mariana", "Pedro", "Marta");

        System.out.println("=== EQUIPE M ===");
        nomes
                .filter(n -> n.startsWith("M"))
                .forEach(System.out::println);

        Stream<Double> tempos = Stream.of(28.5, 55.2, 31.0, 62.8, 49.9);

        System.out.println("=== TEMPOS ABAIXO DE 50 MIN ===");
        long contadorTempo = tempos.filter(t -> t < 50)
                .count();

        System.out.println("Corredores: " + contadorTempo);
    }
}
