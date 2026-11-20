package stream.map.exercicioOito;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class NormalizadorLogs {

    public static void main(String[] args) {
        List<String> arquivos = new ArrayList<>();

        arquivos.add("  Relatorio Final.TXT  ");
        arquivos.add("  Backup Diario.LOG  ");
        arquivos.add("  Erro Fatal.TXT  ");

        Function<String, String> limpar = a -> a.trim();
        Function<String, String> minusculo = a -> a.toLowerCase();
        Function<String, String> sublinhado = a -> a.replace(" ", "_");

        List<Function<String, String>> etapas = new ArrayList<>();
        etapas.add(limpar);
        etapas.add(minusculo);
        etapas.add(sublinhado);

        System.out.println("=== VIA LISTA DE ETAPAS ===");
        Stream<String> fluxo = arquivos.stream();

        for (Function<String, String> etapa : etapas){
            fluxo = fluxo.map(etapa);
        }
        fluxo.forEach(System.out::println);

        System.out.println("=== ENCADEADO NA MAO ===");
        arquivos.stream()
                .map(limpar)
                .map(minusculo)
                .map(sublinhado)
                .forEach(System.out::println);

        System.out.println("=== TAMANHOS ===");
        arquivos.stream()
                .map(a -> a.trim().length())
                .forEach(System.out::println);
    }
}
