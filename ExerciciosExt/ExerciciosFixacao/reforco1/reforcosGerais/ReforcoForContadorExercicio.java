package ExerciciosFixacao.reforco1.reforcosGerais;

import java.util.Scanner;

public class ReforcoForContadorExercicio {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = entrada.nextInt();
        int contador = 0;

        for (int i = 1; i <= num; i++){
            if (i % 3 == 0) {
                contador++;
                System.out.println(i);
            }
        }

        System.out.println("Contador:" + contador);
    }
}
