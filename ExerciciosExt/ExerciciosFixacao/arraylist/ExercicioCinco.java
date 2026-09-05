package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Informe um número: ");
        int numInf = entrada.nextInt();

        while (numInf != -1) {
            numeros.add(numInf);

            System.out.println("Informe outro número: ");
            numInf = entrada.nextInt();
        }

        int numMaior = numeros.get(0);
        int numMenor = numeros.get(0);

        for(int num : numeros) {

            if(num > numMaior){
                numMaior = num;
            } else if (num < numMenor) {
                numMenor = num;
            }
        }

        System.out.println("O menor número foi: " + numMenor);
        System.out.println("O maior número foi: " + numMaior);

    }
}
