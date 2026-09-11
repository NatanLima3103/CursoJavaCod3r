package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioUm {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        System.out.println(nomes.isEmpty());

        nomes.add("Natan");
        nomes.add("Lima");
        nomes.add("Aline");
        nomes.add("Fiori");

        while(!nomes.isEmpty()){
            System.out.println(nomes.poll());
        }

        System.out.println(nomes.isEmpty());
    }
}
