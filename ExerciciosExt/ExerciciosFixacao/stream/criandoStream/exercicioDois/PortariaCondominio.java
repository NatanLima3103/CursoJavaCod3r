package stream.criandoStream.exercicioDois;

import java.util.Arrays;
import java.util.stream.Stream;

public class PortariaCondominio {

    public static void main(String[] args) {

        String[] placas = {"ABC1D23", "XYZ9876", "QWE4R56"};

        Stream<String> streamPlacas = Arrays.stream(placas);

        streamPlacas.forEach(p -> System.out.println("Placa lida: " + p));

        Stream<String> streamParaContar = Arrays.stream(placas);

        System.out.println("Total de placas: " + streamParaContar.count());

        Double[] temperaturas = {21.5, 23.0, 19.8};

        Stream<Double> streamTemperaturas = Arrays.stream(temperaturas);

        streamTemperaturas.forEach(t -> System.out.println("Temperatura: " + t + " C"));
    }
}
