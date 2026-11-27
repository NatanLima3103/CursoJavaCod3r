package stream.outros.exercicioCinco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControleAcesso {

    public static void imprimirAte(List<Acesso> acessos, int horaLimite){
        acessos.stream()
                .distinct()
                .takeWhile(h -> h.getHora() < horaLimite)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Acesso> acessos = Arrays.asList(
                new Acesso("1001", "Ana", 7),
                new Acesso("1002", "Bruno", 7),
                new Acesso("1001", "Ana", 7),
                new Acesso("1003", "Carla", 8),
                new Acesso("1002", "Bruno", 8),
                new Acesso("1004", "Diego", 9),
                new Acesso("1005", "Elisa", 12),
                new Acesso("1006", "Fabio", 13)
        );

        System.out.println("=== LEITURAS UNICAS ===");
        acessos.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("=== TURNO DA MANHA ===");
        imprimirAte(acessos, 10);

        System.out.println("=== PAGINA 2 (2 POR PAGINA) ===");
        acessos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("=== CONTAGEM ===");
        long leituras = acessos.stream()
                .count();

        long pessoas = acessos.stream()
                .distinct()
                .count();

        System.out.println("Leituras: " + leituras);
        System.out.println("Pessoas: " + pessoas);

        System.out.println("=== NOMES DA MANHA ===");
        acessos.stream()
                .distinct()
                .takeWhile(h -> h.getHora() < 10)
                .skip(1)
                .map(a -> a.getNome())
                .forEach(a -> System.out.println("Manha: " + a));
    }
}
