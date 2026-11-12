package lambda.unaryoperator.exercicioCinco;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ExercicioCinco {

    public static List<String> moderar(List<String> comentarios,
                                       List<UnaryOperator<String>> etapas){

        List<String> nova = new ArrayList<>();

        for (String comentario : comentarios){
            String  comentarioDaVolta = comentario;

            for (UnaryOperator<String> etapa : etapas){
                comentarioDaVolta = etapa.apply(comentarioDaVolta);
            }
            nova.add(comentarioDaVolta);
        }

        return nova;
    }

    public static void main(String[] args) {
        UnaryOperator<String> limpar = comentario -> comentario.trim().toLowerCase();
        UnaryOperator<String> censurar = comentario -> {
            if (comentario.contains("spam")){
                return "[removido]";
            }
            return comentario;
        };
        UnaryOperator<String> limitar = comentario -> {
            if (comentario.length() > 20){
                return comentario.substring(0, 20) + "...";
            }
            return comentario;
        };
        List<UnaryOperator<String>> etapas = new ArrayList<>();

        etapas.add(limpar);
        etapas.add(censurar);
        etapas.add(limitar);

        List<String> comentarios = new ArrayList<>();

        comentarios.add("  Muito bom o artigo");
        comentarios.add(" COMPRE AGORA, SPAM GRATIS");
        comentarios.add("Gostei muito, vou compartilhar com todo mundo");

        List<String> moderados = moderar(comentarios, etapas);

        for (String comentario : moderados){
            System.out.println(comentario);
        }
    }
}
