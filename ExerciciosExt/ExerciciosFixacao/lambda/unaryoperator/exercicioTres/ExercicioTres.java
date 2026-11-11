package lambda.unaryoperator.exercicioTres;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ExercicioTres {

    public static List<String> tratarLista(List<String> nomes, UnaryOperator<String> regra){
        List<String> nova = new ArrayList<>();

        for (String nome : nomes){
            nova.add(regra.apply(nome));
        }

        return nova;
    }

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("  natan  ");
        nomes.add("aline beatriz fiori");
        nomes.add(" lima ");

        UnaryOperator<String> limpar = nome -> nome.trim().toUpperCase();
        UnaryOperator<String> abreviar = nome -> {
            if (nome.length() > 8){
                return nome.substring(0,8) + ".";
            }
            return nome;
        };

        List<String> limpos = tratarLista(nomes, limpar);
        List<String> curtos = tratarLista(limpos, abreviar);

        System.out.println("--- Nomes Limpos ---");
        limpos.forEach(nome -> System.out.println(nome));

        System.out.println("--- Nomes Abreviados ---");
        curtos.forEach(nome -> System.out.println(nome));
    }
}
