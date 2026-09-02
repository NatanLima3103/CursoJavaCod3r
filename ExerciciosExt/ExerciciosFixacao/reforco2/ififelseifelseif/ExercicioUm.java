package ExerciciosFixacao.reforco2.ififelseifelseif;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idadeInf = entrada.nextInt();


        while(idadeInf != -1){
            if (idadeInf >= 0 && idadeInf <= 2) {
                System.out.println("Você é um bebê");
            } else if (idadeInf > 2 && idadeInf <= 11) {
                System.out.println("Você é uma criança");
            } else if (idadeInf > 11 && idadeInf <= 17) {
                System.out.println("Você é adolescente");
            } else if (idadeInf > 17 && idadeInf <= 59) {
                System.out.println("Você é um adulto");
            } else {
                System.out.println("Você é um idoso");
            }

            System.out.println("Informe outra idade: ");
            idadeInf = entrada.nextInt();
        }
    }
}
