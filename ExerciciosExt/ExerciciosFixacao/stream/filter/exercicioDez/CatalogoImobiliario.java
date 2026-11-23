package stream.filter.exercicioDez;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CatalogoImobiliario {

    public static void listarPorRegra(List<Imovel> lista, Predicate<Imovel> regra){
        lista.stream()
                .filter(regra)
                .forEach(i -> System.out.println(i.getEndereco() + " | R$ " + i.getAluguel()));
    }

    public static void main(String[] args) {
        List<Imovel> imoveis = new ArrayList<>();

        imoveis.add(new Imovel("Rua A, 100", 2, 2200.0, true));
        imoveis.add(new Imovel("Rua B, 50", 1, 1800.0, true));
        imoveis.add(new Imovel("Av C, 900", 3, 3200.0, true));
        imoveis.add(new Imovel("Rua D, 12", 2, 2400.0, false));
        imoveis.add(new Imovel("Rua E, 77", 4, 2500.0, true));

        List<Predicate<Imovel>> regras = new ArrayList<>();

        regras.add(r -> r.getQuartos() >= 2);
        regras.add(r -> r.getAluguel() <= 2500.0);
        regras.add(r -> r.isMobiliado());

        System.out.println("=== APROVADOS EM TODAS AS REGRAS ===");
        Stream<Imovel> fluxo = imoveis.stream();

        for (Predicate<Imovel> regra : regras){
            fluxo = fluxo.filter(regra);
        }
        fluxo.forEach(f -> System.out.println(f.getEndereco() + " - " + f.getQuartos() + " quartos - R$ " + f.getAluguel()));

        System.out.println("=== ALUGUEL ABAIXO DE 2500 ===");

        listarPorRegra(imoveis, i -> i.getAluguel() < 2500.0);

        System.out.println("=== MOBILIADOS CAROS ===");

        long moiliadosCaros = imoveis.stream()
                .filter(i -> i.isMobiliado())
                .map(i -> i.getAluguel())
                .filter(i -> i > 2000.0)
                .count();

        System.out.println("Mobiliados acima de 2000: " + moiliadosCaros);
    }
}
