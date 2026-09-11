package queue;

import java.util.Queue;
import java.util.LinkedList;

public class ExercicioCinco {
    public static void main(String[] args) {
        Queue<Integer> numeros = new LinkedList<>();

        numeros.add(5);
        numeros.add(1);
        numeros.add(4);
        numeros.add(9);
        numeros.add(2);
        numeros.add(8);

        int maiorNum = numeros.poll();

        while(!numeros.isEmpty()){
            int numeroAtual = numeros.poll();
            if(numeroAtual > maiorNum){
                maiorNum = numeroAtual;
            }
        }
        System.out.println(maiorNum);
    }
}
