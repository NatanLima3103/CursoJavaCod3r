package stream.filter.exercicioSete;

import java.util.ArrayList;
import java.util.List;

public class ViveiroMudas {

    public static void main(String[] args) {
        List<Muda> mudas = new ArrayList<>();

        mudas.add(new Muda("Ipe Amarelo", 45, true, 38.0));
        mudas.add(new Muda("Jabuticabeira", 60, false, 55.0));
        mudas.add(new Muda("Cerejeira", 25, true, 70.0));
        mudas.add(new Muda("Pitangueira", 38, true, 42.0));
        mudas.add(new Muda("Araucaria", 80, true, 90.0));

        System.out.println("=== DOIS FILTER ===");
        mudas.stream()
                .filter(m -> m.getAlturaCm() >= 30)
                .filter(m -> m.isSaudavel())
                .forEach(m -> System.out.println(m.getNome() + " - " + m.getAlturaCm() + "cm"));

        System.out.println("=== UM FILTER COM && ===");
        mudas.stream()
                .filter(m -> m.getAlturaCm() >= 30 && m.isSaudavel())
                .forEach(m -> System.out.println(m.getNome() + " - " + m.getAlturaCm() + "cm"));

        System.out.println("=== APROVADAS PARA VENDA ===");
        long aprovadas = mudas.stream()
                .filter(m -> m.getAlturaCm() >= 30)
                .filter(m -> m.isSaudavel())
                .filter(m -> m.getPreco() < 50.0)
                .count();

        System.out.println("Mudas aprovadas: " + aprovadas);
    }
}
