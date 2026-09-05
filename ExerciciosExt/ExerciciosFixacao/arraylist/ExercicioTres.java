package arraylist;

import java.util.ArrayList;

public class ExercicioTres {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(16);
        numeros.add(86);
        numeros.add(23);
        numeros.add(7);
        numeros.add(2);

        int soma = 0;

        for( int numPercorrido : numeros){

            if(numPercorrido % 2 ==0){
                soma = numPercorrido + soma;
            }
        }
        System.out.println("O valor total dos números pares é: " + soma);
    }
}
