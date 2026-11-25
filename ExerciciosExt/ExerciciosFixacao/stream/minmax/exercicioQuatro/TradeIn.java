package stream.minmax.exercicioQuatro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TradeIn {

    public static void main(String[] args) {
        List<Celular> celulares = new ArrayList<>();

        celulares.add(new Celular("Moto G54", 88, 950.0, false));
        celulares.add(new Celular("iPhone 11", 72, 1800.0, true));
        celulares.add(new Celular("Galaxy A34", 95, 1200.0, false));
        celulares.add(new Celular("Redmi Note 12", 64, 780.0, false));

        Comparator<Celular> porPreco = (a, b) -> Double.compare(a.getPreco(), b.getPreco());

        System.out.println("=== TRADE-IN DE CELULARES ===");
        Celular maisCaroBom = celulares.stream()
                .filter(c -> !c.isDefeito())
                .max(porPreco)
                .get();
        System.out.println("Mais caro sem defeito: " + maisCaroBom.getModelo() + " (R$ " + maisCaroBom.getPreco() + ")");

        int menorBateria = celulares.stream()
                .map(c -> c.getBateriaPct())
                .min((a,b) -> Integer.compare(a, b))
                .get();
        System.out.println("Menor bateria: " + menorBateria + "%");

        System.out.println("=== BUSCA PREMIUM (acima de R$ 5000) ===");
        celulares.stream()
                .filter(c -> c.getPreco() > 5000.0)
                .max(porPreco)
                .ifPresent(c -> System.out.println("Premium: " + c.getModelo()));
        System.out.println("Fim da busca premium.");

        celulares.stream()
                .filter(c -> c.getPreco() > 1000.0)
                .max(porPreco)
                .ifPresent(c -> System.out.println("Acima de 1000: " + c.getModelo()));
    }
}
