package EstruturasDeControle;

import java.util.Scanner;

public class WhileExercicio {

    //Some todos os números que o usuário digitar, um por vez,
    // até ele digitar 0 (zero) — aí você para e imprime a soma
    // total.

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o número: ");
        int num = entrada.nextInt();
        int soma = 0;

        while (num != 0) {
            soma = soma + num;

            System.out.println("Informe outro número: ");
            num = entrada.nextInt();
        }

        System.out.println("A soma total foi: " + soma);
    }
}
