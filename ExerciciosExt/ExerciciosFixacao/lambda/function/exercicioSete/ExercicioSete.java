package lambda.function.exercicioSete;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioSete {

    public static List<String> transformar(List<Encomenda> encomendas, Function<Encomenda, String> regra){
        List<String> resultado = new ArrayList<>();

        for (Encomenda encomenda : encomendas){
            resultado.add(regra.apply(encomenda));
        }

        return resultado;
    }

    public static void main(String[] args) {
        List<Encomenda> encomendas = new ArrayList<>();

        encomendas.add(new Encomenda("BR001", 0.5));
        encomendas.add(new Encomenda("BR002", 1.0));
        encomendas.add(new Encomenda("BR003", 3.2));
        encomendas.add(new Encomenda("BR004", 5.0));
        encomendas.add(new Encomenda("BR005", 12.0));

        Function<Encomenda, String> classificarPeso = p -> {
            if (p.getPesoKg() <= 1.0){
                return "Leve";
            } else if (p.getPesoKg() <= 5.0) {
                return "Média";
            } else {
                return "Pesada";
            }
        };

        Function<Encomenda, String> etiqueta = e -> e.getNome() + " [" + classificarPeso.apply(e) + "]";

        System.out.println("--- Classificação ---");
        transformar(encomendas, classificarPeso).forEach(linha -> System.out.println(linha));

        System.out.println("--- Etiquetas ---");
        transformar(encomendas, etiqueta).forEach(linha -> System.out.println(linha));
    }
}
