package stream.criandoStream.exercicioUm;

import java.util.stream.Stream;

public class Cardapio {

    public static void main(String[] args) {

        Stream<String> bebidas = Stream.of("Café", "Capuccino", "Chá", "Chocolate");
        bebidas.forEach(b -> System.out.println("- " + b));

        Stream<String> bebidasParaContar = Stream.of("Café", "Capuccino", "Chá", "Chocolate");
        System.out.println("Total de bebidas: " + bebidasParaContar.count());

        Stream<Double> precos = Stream.of(7.5, 9.0, 6.0);
        precos.forEach(p -> System.out.println("R$ " + p));
    }
}
