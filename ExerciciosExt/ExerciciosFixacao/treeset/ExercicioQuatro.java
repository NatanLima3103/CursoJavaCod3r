package treeset;

import java.util.TreeSet;

public class ExercicioQuatro {
    public static void main(String[] args) {
        TreeSet<String> nomes = new TreeSet<>();

        nomes.add("Natan");
        nomes.add("Lima");
        nomes.add("Aline");
        nomes.add("Fiori");
        nomes.add("Kety");
        nomes.add("Souza");

        System.out.println("O nome a ser removido é: " + nomes.pollFirst());
        System.out.println("O nome a ser removido é: " + nomes.pollLast());
    }
}
