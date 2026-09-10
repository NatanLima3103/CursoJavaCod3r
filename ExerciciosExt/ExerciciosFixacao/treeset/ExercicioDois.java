package treeset;

import java.util.TreeSet;

public class ExercicioDois {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

         numeros.add(9);
         numeros.add(3);
         numeros.add(8);
         numeros.add(2);
         numeros.add(7);
         numeros.add(1);
         numeros.add(4);

        System.out.println(numeros.first());
        System.out.println(numeros.last());
    }
}
