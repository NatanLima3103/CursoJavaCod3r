package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ExercicioDez {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(8);
        numeros.add(6);
        numeros.add(2);
        numeros.add(4);
        numeros.add(1);
        numeros.add(7);
        numeros.add(3);
        numeros.add(5);

        System.out.println("Antes da organização: " + numeros);

        Collections.sort(numeros);

        System.out.println("Depois da organização: " + numeros);
    }
}
