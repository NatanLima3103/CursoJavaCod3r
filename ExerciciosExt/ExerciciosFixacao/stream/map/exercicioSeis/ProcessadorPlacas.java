package stream.map.exercicioSeis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProcessadorPlacas {
    public static void imprimirComRegra(List<String> placas, Function<String, String> regra){
        placas.stream()
                .map(regra)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<String> placas = new ArrayList<>();

        placas.add("abc1d23");
        placas.add("xyz9k88");
        placas.add("jkl4m56");

        Function<String, String> normalizar = p -> p.toUpperCase();
        Function<String, String> formatar = p -> p.substring(0, 3) + "-" + p.substring(3);

        System.out.println("=== PLACAS NORMALIZADAS ===");
        placas.stream()
                .map(normalizar)
                .forEach(System.out::println);

        System.out.println("=== PLACAS FORMATADAS ===");
        placas.stream()
                .map(normalizar)
                .map(formatar)
                .forEach(System.out::println);

        System.out.println("=== VIA METODO ===");
        imprimirComRegra(placas, p -> p + " (OK)");
    }
}
