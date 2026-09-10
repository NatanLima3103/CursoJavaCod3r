package treeset;

import java.util.TreeSet;

public class ExercicioCinco {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(14);
        numeros.add(58);
        numeros.add(3);
        numeros.add(91);
        numeros.add(27);
        numeros.add(82);
        numeros.add(45);

        int soma = 0;
        for (int num : numeros){

            soma = soma + num;
        }
        double media = (double) soma / numeros.size();

        for(double num : numeros) {

            if(num > media){
                System.out.println(num);
            }
        }
    }
}
