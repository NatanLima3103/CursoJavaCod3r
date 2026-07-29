package Fundamentos;

import java.util.Scanner;

public class CalculoBasicoSoma {
    public static void main (String[] args) {
        Scanner conta = new Scanner(System.in);

        int soma;

        System.out.println("Informe o primeiro número:");
        int num1 = conta.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = conta.nextInt();

        soma = (num1 + num2);

        System.out.println("O resultado foi: " + soma);
    }
}
