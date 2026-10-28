package lambda.consumer.exercicioUm;

import java.sql.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> faixas = new ArrayList<>();

        faixas.add("Trilha de foco");
        faixas.add("Manhã de domingo");
        faixas.add("Estrada Livre");
        faixas.add("Noite Calma");

        Consumer<String> tocar = faixa -> System.out.println("Tocando: " + faixa);

        tocar.accept(faixas.get(0));

        faixas.forEach(tocar);

        faixas.forEach(faixa -> System.out.println(faixa.toUpperCase()));
    }
}
