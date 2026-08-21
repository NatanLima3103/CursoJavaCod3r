package ExerciciosFixacao.reforco1;

import java.util.Scanner;

public class ReforcoForSomaExercicio {

    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = entrada.nextInt();
        int soma = 0;

        for (int i = 1; i <= num; i++){
            soma = soma + i;
            System.out.println(i);
        }

        System.out.println("A soma dos números até o mencionado foi: " + soma);


    }
}
