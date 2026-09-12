package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Queue<Integer> numeros = new LinkedList<>();

        System.out.println("Informe o primeiro número: ");
        int numInf = entrada.nextInt();
        int soma = 0;
        int contador = 0;

        while(numInf != -1) {
            numeros.add(numInf);
            System.out.println("Informe outro número: ");
            numInf = entrada.nextInt();
        }
        while(!numeros.isEmpty()){
            int numeroAtual = numeros.poll();
            soma = soma + numeroAtual;
            contador++;
        }
        double media = (double) soma / contador;
        System.out.println("A média foi: " + media);
    }
}
