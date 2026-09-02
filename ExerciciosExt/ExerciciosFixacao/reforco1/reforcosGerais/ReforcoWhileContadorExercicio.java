package ExerciciosFixacao.reforco1.reforcosGerais;

import java.util.Scanner;

public class ReforcoWhileContadorExercicio {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = entrada.nextInt();
        int contador = 0;
        double soma = 0;
        double media;

        while ( num != 0) {
            contador++;
            soma = soma + num;

            System.out.println("Informe outro número: ");
            num = entrada.nextInt();
        }

        media = soma / contador;

        System.out.println("A quantidade de números escritos é: " + contador);
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
    }
}
