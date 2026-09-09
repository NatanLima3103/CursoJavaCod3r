package hashset;

import java.util.HashSet;

public class ExercicioUm {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Natan");
        nomes.add("Lima");
        nomes.add("Aline");
        nomes.add("Fiori");
        nomes.add("Natan");

        for (String nome : nomes) {

            System.out.println(nome);
        }

        System.out.println("Tamanho da coleção: " + nomes.size());
    }
}
