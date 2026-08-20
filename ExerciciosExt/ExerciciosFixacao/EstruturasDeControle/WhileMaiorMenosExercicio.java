package EstruturasDeControle;

import java.util.Scanner;

public class WhileMaiorMenosExercicio {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = entrada.nextInt();
        int maior = num1;
        int menor = num1;

        while (num1 != 0) {
            System.out.println("Informe outro número: ");
            num1 = entrada.nextInt();

            if (num1 > maior) {
                maior = num1;
            }

            if (num1 < menor) {
                menor = num1;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);


        }
    }

