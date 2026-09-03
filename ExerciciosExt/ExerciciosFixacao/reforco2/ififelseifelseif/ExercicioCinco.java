package ExerciciosFixacao.reforco2.ififelseifelseif;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número, simbolizando o lado do triângulo : ");
        int numUm = entrada.nextInt();

        System.out.println("Informe o primeiro número, simbolizando o lado do triângulo : ");
        int numDois = entrada.nextInt();

        System.out.println("Informe o primeiro número, simbolizando o lado do triângulo : ");
        int numTres = entrada.nextInt();

        if(numUm == numDois && numDois == numTres){
            System.out.println("É um Equilátero");
        } else if (numUm == numDois || numDois == numTres || numUm == numTres) {
            System.out.println("É um Isósceles");
        } else {
            System.out.println("É um escaleno");
        }
    }
}
