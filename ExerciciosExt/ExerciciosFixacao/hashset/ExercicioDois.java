package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(3);
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println("Informe um número: ");
        int numInf = entrada.nextInt();

        boolean encontrado = numeros.contains(numInf);

        if(encontrado){
            System.out.println("O número " + numInf + " está no conjunto");
        } else {
            System.out.println("O número " + numInf + " não está no conjunto");
        }
    }
}
