package stream.minmax.exercicioUm;

import java.util.stream.Stream;

public class EstacaoMeteorologica {

    public static void main(String[] args) {
        Stream<Integer> temperaturas = Stream.of(27, 31, 24, 33, 29);

        int maiorTemp = temperaturas.max((a, b) -> Integer.compare(a, b)).get();
        System.out.println("=== RELATORIO DA ESTACAO ===");

        System.out.println("Temperatura mais alta: " + maiorTemp + " graus");

        Stream<Double> chuvas = Stream.of(12.5, 3.0, 25.75, 8.2);

        double menorChuva = chuvas.min((a, b) -> Double.compare(a, b)).get();

        System.out.println("Menor volume de chuva: " + menorChuva + " mm");

        Stream<String> bairros = Stream.of("Centro", "Zona Norte", "Bairro Alto", "Cidade Industrial");

        String bairroMaisLongo = bairros.max((a, b) -> Integer.compare(a.length(), b.length())).get();

        System.out.println("Nome de bairro mais longo: " + bairroMaisLongo);
    }
}
