package treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(56);
        numeros.add(66);
        numeros.add(65);
        numeros.add(64);
        numeros.add(31);
        numeros.add(61);
        numeros.add(85);
        numeros.add(1);

        System.out.println("Informe um valor de referência: ");
        int valorRferencia = entrada.nextInt();

        System.out.println("Valores abaixo da referência: " + numeros.headSet(valorRferencia));
        System.out.println("Valores acima da referência: " + numeros.tailSet(valorRferencia));
    }
}
