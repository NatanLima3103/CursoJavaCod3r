package stream.criandoStream.exercicioCinco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LinhaProducao {

    public static void main(String[] args) {

        Stream<String> producao = Stream.generate(() -> "Pão francês");
        producao.limit(3)
                .forEach(p -> System.out.println("Produzido: " + p));

        Stream<String> lotes = Stream.of("L-001", "L-002");
        lotes.forEach(l -> System.out.println("Lote: " + l));

        Double[] pesos = {0.5, 0.75, 1.2};

        Stream<Double> streamPesos = Arrays.stream(pesos);
        streamPesos.forEach(p -> System.out.println("Peso: " + p + " kg"));

        List<String> turnos = new ArrayList<>();

        turnos.add("Manhã");
        turnos.add("Tarde");

        Stream<String> streamTurnos = turnos.stream();
        streamTurnos.forEach(t -> System.out.println("Turno: " + t));

        Stream<Integer> caixas = Stream.iterate(10, n -> n + 10);
        caixas.limit(3)
                .forEach(c -> System.out.println("Caixa nº " + c));

        Stream<String> turnosParaContar = turnos.stream();
        System.out.println("Total de turnos: " + turnosParaContar.count());
    }
}
