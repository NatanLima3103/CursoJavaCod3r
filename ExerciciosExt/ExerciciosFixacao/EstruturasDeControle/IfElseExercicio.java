package EstruturasDeControle;

import java.util.Scanner;

public class IfElseExercicio {

    //Peça um número. Se for divisível por 3 e por 5 ao mesmo
    // tempo, imprima "FizzBuzz". Senão, imprima o próprio
    // número.

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int num = entrada.nextInt();

        boolean divisivelPor3 = num % 3 == 0;
        boolean divisivelPor5 = num % 5 == 0;

        if (divisivelPor3 && divisivelPor5) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(num);
        }
    }
}
