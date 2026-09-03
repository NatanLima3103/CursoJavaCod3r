package ExerciciosFixacao.reforco2.ififelseifelseif;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int numUm = entrada.nextInt();

        System.out.println("Informe o segundo número: ");
        int numDois = entrada.nextInt();

        System.out.println("Informe o terceiro número: ");
        int numTres = entrada.nextInt();

        if (numUm > numDois && numUm > numTres){
            System.out.println("O primeiro número é o maior, sendo ele: " + numUm);
        } else if (numDois > numUm && numDois > numTres) {
            System.out.println("O segundo número é o maior, sendo ele: " + numDois);
        } else if (numTres > numUm && numTres > numDois) {
            System.out.println("O terceiro número é o maior, sendo ele: " + numTres);
        }
    }
}
