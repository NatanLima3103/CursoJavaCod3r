package stream.filter.exercicioSeis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BancoDeSangue {

    public static void imprimirDoadores(List<Doador> lista, Predicate<Doador> regra){
        lista.stream()
                .filter(regra)
                .forEach(d -> System.out.println(d.getNome() + " - " + d.getTipoSangue() + " (" + d.getIdade() + " anos)"));
    }

    public static long contarDoadores(List<Doador> lista, Predicate<Doador> regra){
        long contador = lista.stream()
                .filter(regra)
                .count();

        return contador;
    }

    public static void main(String[] args) {
        List<Doador> doadores = new ArrayList<>();

        doadores.add(new Doador("Ana", "O-", 24));
        doadores.add(new Doador("Bruno", "A+", 45));
        doadores.add(new Doador("Carla", "O-", 17));
        doadores.add(new Doador("Diego", "B+", 62));
        doadores.add(new Doador("Elena", "AB-", 28));

        System.out.println("=== DOADORES O- ===");
        imprimirDoadores(doadores, d -> d.getTipoSangue().equals("O-"));

        System.out.println("=== MENORES DE 30 ===");
        Predicate<Doador> jovem = d -> d.getIdade() < 30;
        imprimirDoadores(doadores, jovem);

        System.out.println("=== APTOS POR IDADE ===");
        long aptos = contarDoadores(doadores, r -> r.getIdade() >= 18 && r.getIdade() <= 60);

        System.out.println("Aptos: " + aptos);
    }
}
