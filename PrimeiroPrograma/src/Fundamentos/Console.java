package Fundamentos;

import java.util.Scanner;

public class Console {

    public static void main (String[] args) {

        System.out.print("Bom");
        System.out.print(" dia\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.println("Megasena: %d %d %d %d %d %d, 1, 2, 3, 4, 5, 6");

        //System.out.printf("Salário: %.if", 1234.5678);
        //System.out.printf("Nome: %s%s", "João");

        int a = 3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe o seu sobrenomenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("\nNome e sobrenome = " + nome + sobrenome);

        System.out.println("\nSua idade é: " + idade);

        entrada.close();
    }

}
