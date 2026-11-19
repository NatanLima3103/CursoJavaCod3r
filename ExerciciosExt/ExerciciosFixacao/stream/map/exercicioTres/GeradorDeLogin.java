package stream.map.exercicioTres;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeLogin {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Natan Lima");
        nomes.add("Aline Fiori");
        nomes.add("Ketney Souza");

        System.out.println("=== EMAILS ===");
        nomes.stream()
                .map(n -> n.toLowerCase())
                .map(n -> n.replace(" ", "."))
                .map(n -> n + "@empresa.com")
                .forEach(System.out::println);

        List<String> salariosTexto = new ArrayList<>();
        salariosTexto.add("1200");
        salariosTexto.add("850");
        salariosTexto.add("2300");

        System.out.println("=== SALARIOS COM BONUS ===");
        salariosTexto.stream()
                .map(s -> Integer.parseInt(s))
                .map(s -> s + 100)
                .forEach(System.out::println);

        System.out.println("=== EMAILS EM UM MAP SO ===");
        nomes.stream()
                .map(n -> n.toLowerCase().replace(" ", ".") + "@empresa.com")
                .forEach(System.out::println);
    }
}
