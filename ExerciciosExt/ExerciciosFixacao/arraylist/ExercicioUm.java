package arraylist;

import java.util.ArrayList;

public class ExercicioUm {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Natan");
        nomes.add("Lima");
        nomes.add("Aline");
        nomes.add("Fiori");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Quantidade de nomes: " + nomes.size());
    }
}
