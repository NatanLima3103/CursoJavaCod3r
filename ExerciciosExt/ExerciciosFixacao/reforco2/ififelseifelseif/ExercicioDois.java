package ExerciciosFixacao.reforco2.ififelseifelseif;

import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma nota, de 1 até 100:");
        double notaInf = entrada.nextDouble();

        if (notaInf >= 90 && notaInf <= 100) {
            System.out.println("Nota A");
        } else if (notaInf < 90 && notaInf >= 75) {
            System.out.println("Nota B");
        } else if (notaInf < 75 && notaInf >= 60) {
            System.out.println("Nota C");
        } else if (notaInf < 60 && notaInf >= 40) {
            System.out.println("Nota D");
        } else {
            System.out.println("Nota F");
        }
    }
}
