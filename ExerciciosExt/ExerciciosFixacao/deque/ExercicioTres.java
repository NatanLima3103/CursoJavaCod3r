package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExercicioTres {
    public static void main(String[] args) {
        Deque<String> nomes = new ArrayDeque<>();

        nomes.push("Natan");
        nomes.push("Lima");
        nomes.push("Aline");
        nomes.push("Fiori");
        nomes.push("Lucca");

        System.out.println("Topo da pilha (sem remover): " + nomes.peek());

        System.out.println("Removendo o topo: " + nomes.pop());
    }
}
