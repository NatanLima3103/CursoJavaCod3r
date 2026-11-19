package stream.map.exercicioDois;

import java.util.ArrayList;
import java.util.List;

public class PainelEntregas {

    public static void main(String[] args) {
        List<Entrega> entregas = new ArrayList<>();

        entregas.add(new Entrega("Curitiba", 2.5));
        entregas.add(new Entrega("Londrina", 10.0));
        entregas.add(new Entrega("Maringá", 4.0));

        System.out.println("=== DESTINOS ===");
        entregas.stream()
                .map(e -> e.getDestino())
                .forEach(System.out::println);

        System.out.println("=== CUSTO POR ENTREGA ===");
        entregas.stream()
                .map(e -> "R$ " + (e.getPesoKg() * 3))
                .forEach(System.out::println);

        System.out.println("=== TAMANHO DO DESTINO ===");
        entregas.stream()
                .map(e -> e.getDestino() + " -> " + e.getDestino().length())
                .forEach(System.out::println);
    }
}
