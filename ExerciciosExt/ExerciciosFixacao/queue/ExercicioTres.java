package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioTres {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        System.out.println(nomes.isEmpty());

        nomes.add("Natan");
        nomes.add("Lima");
        nomes.add("Aline");
        nomes.add("Fiori");
        nomes.add("Kety");

        System.out.println(nomes.peek());

        while(!nomes.isEmpty()){
            System.out.println(nomes.poll());
        }

        System.out.println(nomes.isEmpty());
    }
}
