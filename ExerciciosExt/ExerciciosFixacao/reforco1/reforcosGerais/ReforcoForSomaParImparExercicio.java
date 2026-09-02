package ExerciciosFixacao.reforco1.reforcosGerais;

import java.util.Scanner;

public class ReforcoForSomaParImparExercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = entrada.nextInt();
        int numPar = 0;
        int numImpar = 0;

        for (int i = 1; i <= num; i++){

            if (i % 2 == 0){
                numPar = i + numPar;
            } else {
                numImpar = i + numImpar;
            }
        }

        System.out.println("A soma dos números pares é: " + numPar);
        System.out.println("A soma dos números ímpares é: " + numImpar);
    }
}
