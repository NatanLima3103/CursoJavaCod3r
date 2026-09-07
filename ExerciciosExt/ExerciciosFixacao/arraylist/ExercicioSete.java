package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ExercicioSete {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(23);
        numeros.add(45);
        numeros.add(16);
        numeros.add(35);
        numeros.add(17);
        numeros.add(46);

        Iterator<Integer> it = numeros.iterator();

        while(it.hasNext()){

            int num = it.next();
            if(num % 2 == 0){
                it.remove();
            }
        }
        System.out.println(numeros);
    }
}
