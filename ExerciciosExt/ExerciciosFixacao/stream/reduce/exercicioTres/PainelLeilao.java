package stream.reduce.exercicioTres;

import java.util.ArrayList;
import java.util.List;

public class PainelLeilao {

    public static void main(String[] args) {
        List<Integer> lances = new ArrayList<>();

        lances.add(1200);
        lances.add(850);
        lances.add(2300);
        lances.add(1750);
        lances.add(950);

        List<String> licitantes = new ArrayList<>();

        licitantes.add("Carla");
        licitantes.add("Jo");
        licitantes.add("Alexandre");
        licitantes.add("Bia");

        System.out.println("=== LEILAO DE BICICLETAS ===");

        int maiorLance = lances.stream()
                .reduce(0, (a, b) -> a > b ? a : b);

        System.out.println("Maior lance: R$ " + maiorLance);

        int menorLance = lances.stream()
                .reduce(lances.get(0), (a, b) -> a< b ? a : b);

        System.out.println("Menor lance: R$ " + menorLance);

        String nomeMaisLongo = licitantes.stream()
                .reduce("", (a, b) -> a.length() > b.length() ? a : b);

        System.out.println("Nome mais longo: " + nomeMaisLongo);
    }
}
