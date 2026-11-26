package stream.outros.exercicioQuatro;

import java.util.Arrays;
import java.util.List;

public class PainelPedidos {

    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
                new Pedido("Ana", "Centro", 45.0),
                new Pedido("Bruno", "Portao", 80.0),
                new Pedido("Carla", "Centro", 32.0),
                new Pedido("Diego", "Boqueirao", 120.0),
                new Pedido("Elisa", "Portao", 65.0),
                new Pedido("Fabio", "Centro", 95.0),
                new Pedido("Gisele", "Agua Verde", 50.0),
                new Pedido("Heitor", "Boqueirao", 150.0)
        );
        System.out.println("=== BAIRROS ATENDIDOS ===");
        pedidos.stream()
                .map(p -> p.getBairro())
                .distinct()
                .forEach(b -> System.out.println("Bairro: " + b));

        long totalBairros = pedidos.stream()
                .map(p -> p.getBairro())
                .distinct()
                .count();

        System.out.println("Total de bairros: " + totalBairros);

        System.out.println("=== PEDIDOS ACIMA DE 60 ===");
        pedidos.stream()
                .filter(p -> p.getValor() > 60.0)
                .map(p -> p.getCliente() + " - R$ " + p.getValor())
                .forEach(System.out::println);

        System.out.println("=== PULANDO O PRIMEIRO ALTO ===");
        pedidos.stream()
                .filter(p -> p.getValor() > 60.0)
                .skip(1)
                .limit(2)
                .map(p -> p.getCliente() + " - R$ " + p.getValor())
                .forEach(System.out::println);

        System.out.println("=== BAIRROS COM PEDIDO ALTO ===");
        pedidos.stream()
                .filter(p -> p.getValor() > 60.0)
                .map(p -> p.getBairro())
                .distinct()
                .forEach(b -> System.out.println("Bairro quente: " + b));
    }
}
