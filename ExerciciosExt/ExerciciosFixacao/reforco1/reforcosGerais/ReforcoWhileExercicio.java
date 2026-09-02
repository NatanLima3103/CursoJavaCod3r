package ExerciciosFixacao.reforco1.reforcosGerais;

import java.util.Scanner;

public class ReforcoWhileExercicio {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num = entrada.nextInt();
        int calc = 0;

        while (num >= 0){
            calc = calc + num;

            System.out.println("Informe outro número: ");
            num = entrada.nextInt();

        }

        System.out.println("O valor total é: " + calc);

    }
}
