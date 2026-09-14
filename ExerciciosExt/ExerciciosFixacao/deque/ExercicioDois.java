package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExercicioDois {
    public static void main(String[] args) {
        Deque<Integer> numeros = new ArrayDeque<>();

        numeros.push(5);
        numeros.push(6);
        numeros.push(1);
        numeros.push(7);
        numeros.push(4);

        int soma = 0;

        while(!numeros.isEmpty()){
            int numeroAtual = numeros.pop();

            soma = numeroAtual + soma;
        }
            System.out.println(soma);
    }
}
