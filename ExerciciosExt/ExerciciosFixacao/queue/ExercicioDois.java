package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioDois {
    public static void main(String[] args) {
        Queue<Integer> numeros = new LinkedList<>();

        numeros.add(4);
        numeros.add(2);
        numeros.add(5);
        numeros.add(6);
        numeros.add(1);

        int soma = 0;

        while (!numeros.isEmpty()){
            soma = soma + numeros.poll();
        }
        System.out.println("Soma total: " + soma);
    }
}
