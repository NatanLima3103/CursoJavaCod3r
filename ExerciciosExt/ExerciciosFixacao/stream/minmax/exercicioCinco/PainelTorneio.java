package stream.minmax.exercicioCinco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PainelTorneio {

    public static Jogador melhor(List<Jogador> jogadores, Comparator<Jogador> regra){
        return jogadores.stream()
                .max(regra)
                .get();
    }

    public static Jogador pior(List<Jogador> jogadores, Comparator<Jogador> regra) {
        return jogadores.stream()
                .min(regra)
                .get();
    }

    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador("Caruana", 2780, 18, 24));
        jogadores.add(new Jogador("Ding", 2730, 12, 20));
        jogadores.add(new Jogador("Nakamura", 2800, 15, 25));
        jogadores.add(new Jogador("Firouzja", 2760, 21, 24));

        System.out.println("=== TORNEIO DE XADREZ ===");

        Comparator<Jogador> porRating = (a, b) -> Integer.compare(a.getRating(), b.getRating());
        Jogador topRating = melhor(jogadores, porRating);
        System.out.println("Maior rating: " + topRating.getNome() + " (" + topRating.getRating() + ")");

        Jogador menorRating = pior(jogadores, porRating);
        System.out.println("Menor rating: " + menorRating.getNome() + " (" + menorRating.getRating() + ")");

        Jogador topAproveitamento = melhor(jogadores,
                (a, b) -> Double.compare(
                        (double) a.getVitorias() / a.getPartidas(),
                        (double) b.getVitorias() / b.getPartidas()
                )
        );
        System.out.println("Melhor aproveitamento: " + topAproveitamento.getNome());

        jogadores.stream()
                .filter(j -> j.getRating() > 2750)
                .map(j -> j.getNome())
                .max((a, b) -> a.compareTo(b))
                .ifPresent(n -> System.out.println("Ultimo nome em ordem alfabetica (rating acima de 2750): " + n));
    }
}
