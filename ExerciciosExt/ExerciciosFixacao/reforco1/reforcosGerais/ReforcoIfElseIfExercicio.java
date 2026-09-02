package ExerciciosFixacao.reforco1.reforcosGerais;

import java.util.Scanner;

public class ReforcoIfElseIfExercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número do dia: ");
        int num = entrada.nextInt();

        if (num == 1) {
            System.out.println("Domingo");
        }else if (num == 2) {
            System.out.println("Segunda-feira");
        }else if (num == 3) {
            System.out.println("Terça-feira");
        }else if (num == 4) {
            System.out.println("Quarta-feira");
        }else if (num == 5) {
            System.out.println("Quinta-feira");
        }else if (num == 6) {
            System.out.println("Sexta-feira");
        }else if (num == 7) {
            System.out.println("Sábado");
        }else {
            System.out.println("Dia inválido!");
        }
    }
}
