package string;

import java.util.Scanner;

public class ExercicioString {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        String nomeDigitado = entrada.nextLine();

        String nomeProcessado = nomeDigitado.trim().toUpperCase();
        boolean sobrenomeLima = nomeProcessado.toLowerCase().contains("lima");

        System.out.println(nomeProcessado);
        System.out.println("Sobrenome encontrado? " + sobrenomeLima);
    }
}
