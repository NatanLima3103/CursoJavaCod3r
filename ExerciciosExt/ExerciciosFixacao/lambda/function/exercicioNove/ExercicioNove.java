package lambda.function.exercicioNove;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioNove {

    public static String aplicarEtapas(String texto,
                                       List<Function<String,
                                               String>> etapas){
        String resultado = texto;

        for (Function<String, String> etapa : etapas){
            resultado = etapa.apply(resultado);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Function<String, String> removerEspacos = r -> r.trim();
        Function<String, String> minusculo = m -> m.toLowerCase();
        Function<String, String> trocarEspacos = t ->
                t.replace(" ", "_");
        Function<String, String> adicionarExtensao = a -> a +
                ".pdf";

        List<Function<String, String>> etapas = new ArrayList<>();
        etapas.add(removerEspacos);
        etapas.add(minusculo);
        etapas.add(trocarEspacos);
        etapas.add(adicionarExtensao);

        List<String> nomesBrutos = new ArrayList<>();

        nomesBrutos.add("  Relatorio Final Marco  ");
        nomesBrutos.add("Contrato Cliente Novo");
        nomesBrutos.add("  ATA Reuniao Diretoria");

        nomesBrutos.forEach(nome -> System.out.println("[" +
                nome + "] -> " + aplicarEtapas(nome, etapas)));

        List<Function<String, String>> etapasDesordenadas =
                new ArrayList<>();
        etapasDesordenadas.add(adicionarExtensao);
        etapasDesordenadas.add(removerEspacos);
        etapasDesordenadas.add(minusculo);
        etapasDesordenadas.add(trocarEspacos);

        System.out.println("Ordem errada: " +
                aplicarEtapas("  Relatorio Final Marco  ",
                        etapasDesordenadas));
    }
}
