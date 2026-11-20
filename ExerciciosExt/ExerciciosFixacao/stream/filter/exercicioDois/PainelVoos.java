package stream.filter.exercicioDois;

import java.util.ArrayList;
import java.util.List;

public class PainelVoos {

    public static void main(String[] args) {

        List<Voo> voos = new ArrayList<>();

        voos.add(new Voo("Sao Paulo", 0, 12));
        voos.add(new Voo("Recife", 25, 0));
        voos.add(new Voo("Curitiba", 40, 3));
        voos.add(new Voo("Recife", 0, 5));
        voos.add(new Voo("Manaus", 15, 0));

        System.out.println("=== VOOS COM ATRASO ===");

        voos.stream()
                .filter(v -> v.getAtrasosMinutos() > 0)
                .forEach(v -> System.out.println(v.getDestino() + " - atraso de " + v.getAtrasosMinutos() + " min"));

        System.out.println("=== LOTADOS ===");

        long lotados =voos.stream()
                .filter(v -> v.getAssentosLivres() == 0)
                .count();

        System.out.println("Voos lotados: " + lotados);

        System.out.println("=== DESTINO RECIFE ===");
        voos.stream()
                .filter(v -> v.getDestino().equals("Recife"))
                .forEach(t -> System.out.println(t.getDestino() + " - " + t.getAssentosLivres() + " assentos livres"));
    }
}
