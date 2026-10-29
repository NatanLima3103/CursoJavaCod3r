package lambda.interfacesProprias.exercicioDoze;

import java.util.ArrayList;

public class ExercicioDozeTeste {

    public static void imprimirEtiquetas(String titulo, ArrayList<String> nomes, FormatoEtiqueta formato){
        System.out.println(titulo);

        for (String nome : nomes){

            System.out.println("Etiqueta: " + formato.formatar(nome));

        }
    }

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Arroz");
        nomes.add("Feijao Carioca");
        nomes.add("Leite");
        nomes.add("Macarrao Espaguete");

        imprimirEtiquetas("--- Maiúsculas ---", nomes, nome -> nome.toUpperCase());

        imprimirEtiquetas("--- Resumida ---", nomes, nome -> {
            if (nome.length() <= 8){
                return "[" + nome + "]";
            }
            return "[" + nome.substring(0, 8) + "...]";
        });

    }
}
