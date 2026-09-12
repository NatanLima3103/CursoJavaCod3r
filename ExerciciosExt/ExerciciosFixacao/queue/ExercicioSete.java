package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioSete {
    public static void main(String[] args) {
        Queue<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(5);
        numeros.add(3);
        numeros.add(9);
        numeros.add(4);
        numeros.add(7);

        int contadorPares = 0;

        while(!numeros.isEmpty()){

            if(numeros.poll() % 2 == 0){
                contadorPares++;
            }
        }
        System.out.println(contadorPares + " número(s) é(são) par(es).");
    }
}
