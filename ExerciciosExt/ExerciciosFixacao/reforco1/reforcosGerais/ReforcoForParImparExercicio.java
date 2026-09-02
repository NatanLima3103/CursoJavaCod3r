package ExerciciosFixacao.reforco1.reforcosGerais;

import java.util.Scanner;

public class ReforcoForParImparExercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = entrada.nextInt();
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }
        System.out.println("Total números pares: " + contadorPar);
        System.out.println("Total números ímpares: " + contadorImpar);
    }
}
