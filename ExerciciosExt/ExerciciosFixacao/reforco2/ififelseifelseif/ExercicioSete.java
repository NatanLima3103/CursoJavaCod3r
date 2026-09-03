package reforco2.ififelseifelseif;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double notaUm = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double notaDois = entrada.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double notaTres = entrada.nextDouble();

        double media = (notaUm + notaDois + notaTres) /3;

        if (media >= 7){
            System.out.println("Você foi aprovado!");
        } else if (media >= 4){
            System.out.println("Você está de recuperação!");
        } else{
            System.out.println("Você está reprovado!");
        }
    }
}
