package stream.outros.exercicioTres;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EnvaseRefrigerante {

    public static void main(String[] args) {
        List<Integer> volumes = new ArrayList<>();

        volumes.add(500);
        volumes.add(498);
        volumes.add(496);
        volumes.add(492);
        volumes.add(499);
        volumes.add(501);
        volumes.add(490);
        volumes.add(497);

        System.out.println("=== ANTES DA PRIMEIRA FALHA ===");
        volumes.stream()
                .takeWhile(v -> v >= 495)
                .forEach(v -> System.out.println("Garrafa: " + v + " ml"));

        System.out.println("=== TODAS AS APROVADAS ===");
        volumes.stream()
                .filter(v -> v >= 495)
                .forEach(v -> System.out.println("Garrafa: " + v + " ml"));

        System.out.println("=== CONTAGEM ===");
        long antesDaFalha = volumes.stream()
                .takeWhile(v -> v >= 495)
                .count();

        long aprovadas = volumes.stream()
                .filter(v -> v >= 495)
                .count();

        System.out.println("Antes da falha: " + antesDaFalha);
        System.out.println("Aprovadas no turno: " + aprovadas);

        System.out.println("=== AQUECIMENTO ===");
        Stream.iterate(10, t -> t + 10)
                .takeWhile(t -> t <= 50)
                .forEach(t -> System.out.println("Temperatura: " + t + " C"));
    }
}
