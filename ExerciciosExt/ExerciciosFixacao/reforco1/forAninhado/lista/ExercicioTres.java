package reforco1.forAninhado.lista;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String [] nomes = {"Natan", "Aline", "Kety"};

        for(int i = 0; i < nomes.length; i++){
            double [] notas = new double[3];

            for(int j = 0; j < notas.length; j++){

                System.out.println("Informe uma nota");
                notas[j] = entrada.nextDouble();
            }

            double media = (notas[0] + notas[1] + notas[2]) / 3;

            System.out.println("A média é: " + media);

            if(media >= 7) {

                System.out.println("Você foi aprovado, sua média é: " + media);
            }else if (media >= 4) {

                System.out.println("Você está de recuperação, sua média é: " + media);
            } else {

                System.out.println("Você está reprovado, sua média é: " + media);
            }
        }
    }
}
