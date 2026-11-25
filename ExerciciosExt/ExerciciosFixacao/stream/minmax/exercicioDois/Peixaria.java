package stream.minmax.exercicioDois;

import java.util.ArrayList;
import java.util.List;

public class Peixaria {

    public static void main(String[] args) {

        List<Peixe> peixes = new ArrayList<>();

        peixes.add(new Peixe("Tilapia", 1.8, 24.90));
        peixes.add(new Peixe("Salmao", 0.9, 89.90));
        peixes.add(new Peixe("Sardinha", 4.0, 18.00));
        peixes.add(new Peixe("Tainha", 2.2, 10.50));

        System.out.println("=== PEIXARIA - FECHAMENTO ===");

        Peixe maisPesado = peixes.stream()
                .max((a, b) -> Double.compare(a.getPesoKg(), b.getPesoKg())).get();

        System.out.println("Peixe mais pesado: " + maisPesado.getNome() + " (" + maisPesado.getPesoKg() + " kg)");

        Peixe maisBarato = peixes.stream()
                .min((a, b) -> Double.compare(a.getPrecoKg(), b.getPrecoKg())).get();

        System.out.println("Menor preco por kg: " + maisBarato.getNome() + " (R$ " + maisBarato.getPrecoKg() + ")");

        Peixe maiorValor = peixes.stream()
                .max((a, b) -> Double.compare(a.getPrecoKg() * a.getPesoKg(), b.getPrecoKg() * b.getPesoKg())).get();

        System.out.println("Maior valor em estoque: " + maiorValor.getNome());
    }
}
