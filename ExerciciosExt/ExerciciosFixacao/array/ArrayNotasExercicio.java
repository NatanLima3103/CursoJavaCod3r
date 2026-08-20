package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNotasExercicio {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas gostaria de informar? ");

        int qtdeNotas = entrada.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < qtdeNotas; i++){
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        System.out.println(Arrays.toString(notas));

        double maior = notas[0];

        for (int i = 1; i < notas.length; i++){
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }

        System.out.println("A maior nota foi: " + maior);
    }
}
