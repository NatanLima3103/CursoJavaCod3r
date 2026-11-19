package stream.criandoStream.exercicioQuatro;

import java.util.Calendar;
import java.util.SplittableRandom;
import java.util.stream.Stream;

public class PainelSenhas {

    public static void main(String[] args) {

        Stream<Integer> senhas = Stream.iterate(1, n -> n + 1);

        senhas.limit(5)
                .forEach(s -> System.out.println("Senha: " + s));

        Stream<Integer> capacidades = Stream.iterate(2, n -> n * 2);
        capacidades.limit(4)
                .forEach(c -> System.out.println("Capacidade: " + c));

        Stream<Double> aportes = Stream.iterate(100.0, v -> v + 50);
        aportes.limit(3)
                .forEach(a -> System.out.println("Aporte: R$ " + a));

        Stream<Integer> senhasParaContar = Stream.iterate(1, n -> n + 1);
        System.out.println("Total de senhas geradas: " + senhasParaContar.limit(5).count());
    }
}
