package stream.reduce.exercicioUm;

import java.util.ArrayList;
import java.util.List;

public class CaixaBarraca {

    public static void main(String[] args) {
        List<Integer> vendas = new ArrayList<>();

        vendas.add(12);
        vendas.add(8);
        vendas.add(25);
        vendas.add(15);
        vendas.add(10);

        int total = vendas.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Total do dia: R$ " + total);

        List<Double> gorjetas = new ArrayList<>();

        gorjetas.add(2.5);
        gorjetas.add(1.0);
        gorjetas.add(3.5);

        double totalGorjetas = gorjetas.stream()
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("Gorjetas: R$ " + totalGorjetas);

        int caixaFinal = vendas.stream()
                .reduce(50, (a, b) -> a + b);

        System.out.println("Caixa com troco: R$ " + caixaFinal);
    }
}
