package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExercicioCinco {
    public static void main(String[] args) {
        Deque<Integer> numeros = new ArrayDeque<>();

        numeros.push(5);
        numeros.push(45);
        numeros.push(61);
        numeros.push(36);
        numeros.push(85);
        numeros.push(17);

        int maiorNumero = numeros.pop();

        while(!numeros.isEmpty()){
            int numeroAtual = numeros.pop();

            if(maiorNumero < numeroAtual){
                maiorNumero = numeroAtual;
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
    }
}
