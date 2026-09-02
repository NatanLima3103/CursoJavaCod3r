package ExerciciosFixacao.reforco1.reforcosGerais;

import java.util.Scanner;

public class ReforcoIfExercicio {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double num = entrada.nextDouble();

        if (num % 4 == 0) {
            System.out.println("O número é múltiplo de 4. ");
        } else {
            System.out.println("O número não é múltiplo de 4. ");
        }
    }
}
