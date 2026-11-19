package stream.map.exercicioUm;

import java.util.ArrayList;
import java.util.List;

public class EtiquetaLoja {

    public static void main(String[] args) {
        List<String> pecas = new ArrayList<>();

        pecas.add("camiseta");
        pecas.add("calça jeans");
        pecas.add("jaqueta");

        System.out.println("=== ETIQUETAS ===");
        pecas.stream()
                .map(p -> p.toUpperCase())
                .forEach(p -> System.out.println(p));

        List<Double> precos = new ArrayList<>();

        precos.add(49.9);
        precos.add(129.9);
        precos.add(259.9);

        System.out.println("=== PRECOS COM FRETE ===");
        precos.stream()
                .map(p -> "R$ " + (p + 10))
                .forEach(p -> System.out.println(p));

        System.out.println("=== ESTOQUE ORIGINAL ===");
        for (String p : pecas){
            System.out.println(p);
        }
    }
}
