package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adidionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Natan"); // Retorna false
        fila.offer("Lima"); // Lança uma exceção
        fila.add("Aline");
        fila.offer("Fiori");
        fila.add("Kety");
        fila.offer("Souza");

        // Peek e elemente -> vão obter o próximo elemento da fila (sem remover)
        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); // Retorna False
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        // Poll e remove -> vão obter o próximo elemento da fila (sem remover)
        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.poll()); // Retorna null
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // Lança uma exceção

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains(...);
    }
}
