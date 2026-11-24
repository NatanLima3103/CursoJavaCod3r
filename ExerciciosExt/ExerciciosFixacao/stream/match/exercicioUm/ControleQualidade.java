package stream.match.exercicioUm;

import java.util.stream.Stream;

public class ControleQualidade {

    public static void main(String[] args) {

        System.out.println("=== CONTROLE DE QUALIDADE ===");

        boolean todosNoMinimo = Stream.of(12, 15, 9, 14, 13)
                .allMatch(q -> q >= 10);

        System.out.println("Todos com 10mm ou mais? " + todosNoMinimo);

        boolean existeAcimaDeQuatorze = Stream.of(12, 15, 9, 14, 13)
                .anyMatch(q -> q > 14);

        System.out.println("Existe algum acima de 14mm? " + existeAcimaDeQuatorze);

        boolean nenhumRecusado = Stream.of("PAR-001", "PAR-002", "PAR-003")
                .noneMatch(q -> q.startsWith("REC"));

        System.out.println("Nenhum lote recusado? " + nenhumRecusado);
    }
}
