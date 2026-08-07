package EstruturasDeControle;

import java.util.Scanner;

public class WhileContadorExercicio {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num = entrada.nextInt();

        int soma = 0;
        int contagem = 0;

        while (num != -1) {
            soma = soma = num;
            contagem = contagem + 1;

            System.out.println("Informe outro número:");
            num = entrada.nextInt();
        }

        double media = (double) soma / contagem;

        System.out.println("Quantidade de números: " + contagem);
        System.out.println("A média entre os números foi: " + media);
    }
}
