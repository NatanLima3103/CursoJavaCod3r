package hashset;

import java.util.HashSet;

public class ExercicioQuatro {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(65);
        numeros.add(10);
        numeros.add(49);
        numeros.add(80);
        numeros.add(23);
        numeros.add(30);

        int contador = 0;

        for (int numero : numeros) {

            if (numero > 50){
                contador++;
            }
        }
        System.out.println(contador + " número(s) é(são) maior(es) de 50");
    }
}
