package ExerciciosFixacao.reforco1;

import java.util.Scanner;

public class ReforcoWhileLimiteExercicio {

    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = entrada.nextInt();
        int soma = 0;
        boolean continuar = true;

        while (num != 0 && continuar) {

            soma = soma + num;

            if (soma >= 100) {

                continuar = false;
            }else {

            System.out.println("Informe outro número: ");
            num = entrada.nextInt();
            }
        }
        if (num == 0) {

            System.out.println("O processo parou, pois o 0 foi digitado");
        } else if (soma >= 100) {

            System.out.println("O processo parou, pois o valor foi superior a 100");
        }
        System.out.println("A soma total dos números é: " + soma);
    }
}
