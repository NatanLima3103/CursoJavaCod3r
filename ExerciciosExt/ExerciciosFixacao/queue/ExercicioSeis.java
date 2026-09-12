package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioSeis {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Natan");
        nomes.add("Lima");
        nomes.add("Aline");
        nomes.add("Fiori");
        nomes.add("Kety");

        while(!nomes.isEmpty()){

            System.out.println("Cliente " + nomes.poll() + ", atendido!");
        }
    }
}
