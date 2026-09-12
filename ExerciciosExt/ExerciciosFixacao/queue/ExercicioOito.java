package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioOito {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Natan");
        nomes.add("Lima");
        nomes.add("Aline");
        nomes.add("Fiori");
        nomes.add("Kety");
        nomes.add("Souza");

        System.out.println("O primeiro da lista é: " + nomes.peek());

        System.out.println("O nomes ainda está lá? " + nomes.contains(nomes.peek()));


    }
}
