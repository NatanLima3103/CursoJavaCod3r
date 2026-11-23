package stream.filter.exercicioCinco;

import java.util.ArrayList;
import java.util.List;

public class RelatorioAdega {

    public static void main(String[] args) {
        List<Vinho> vinhos = new ArrayList<>();

        vinhos.add(new Vinho("Tinto Reserva", 2018, 180.0, 4));
        vinhos.add(new Vinho("Branco Seco", 2021, 75.0, 0));
        vinhos.add(new Vinho("Tinto Suave", 2020, 120.0, 2));
        vinhos.add(new Vinho("Rose Brut", 2022, 95.0, 6));
        vinhos.add(new Vinho("Tinto Gran", 2015, 320.0, 0));

        System.out.println("=== ACIMA DE 100 ===");
        vinhos.stream()
                .filter(v -> v.getPreco() > 100.0)
                .map(v -> v.getNome().toUpperCase() + " - R$ " + v.getPreco())
                .forEach(System.out::println);

        System.out.println("=== NOMES COM TINTO ===");
        vinhos.stream()
                .map(v -> v.getNome())
                .filter(v -> v.contains("Tinto"))
                .forEach(System.out::println);

        System.out.println("=== VALOR EM ESTOQUE ===");
        vinhos.stream()
                .filter(v -> v.getEstoque() > 0)
                .map(v -> v.getPreco() * v.getEstoque())
                .forEach(v -> System.out.println("Valor em estoque: R$ " + v));
    }
}
