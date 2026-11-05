package lambda.function.exercicioDois;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioDois {

    public static void main(String[] args) {
        Function<String, String> gerarCracha = nome -> nome.toUpperCase();

        Function<String, Integer> contarLetras = nome -> nome.length();

        List<String> participantes = new ArrayList<>();

        participantes.add("Natan");
        participantes.add("Lima");
        participantes.add("Aline");
        participantes.add("Fiori");

        participantes.forEach(nome -> System.out.println("Crachá: " + gerarCracha.apply(nome) + " (" +
                contarLetras.apply(nome) + " letras)"));
    }
}
