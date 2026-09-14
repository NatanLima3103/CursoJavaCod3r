package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExercicioUm {
    public static void main(String[] args) {
        Deque<String> nomes = new ArrayDeque<>();

        nomes.push("Natan");
        nomes.push("Lima");
        nomes.push("Aline");
        nomes.push("Fiori");

        while(!nomes.isEmpty()){

            System.out.println(nomes.pop());
        }
    }
}
