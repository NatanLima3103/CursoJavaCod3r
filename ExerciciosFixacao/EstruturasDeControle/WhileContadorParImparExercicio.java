package EstruturasDeControle;

import java.util.Scanner;

public class WhileContadorParImparExercicio {

    public static void main (String[] args) {

        //Peça números ao usuário, um de cada vez, até ele digitar
        // 0. Ao final, imprima quantos números pares e quantos números
        // ímpares foram digitados.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num = entrada.nextInt();
        int par = 0;
        int impar = 0;

        while (num != 0){

            System.out.println("Informe outro número:");
            num = entrada.nextInt();

            if (num % 2 == 0) {
                par = par + 1;

            } else {
                impar = num + 1;
            }
        }
    }
}
