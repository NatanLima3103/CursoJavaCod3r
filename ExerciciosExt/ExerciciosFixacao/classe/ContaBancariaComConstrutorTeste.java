package classe;

import java.util.Scanner;

public class ContaBancariaComConstrutorTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ContaBancariaComConstrutor c1 = new ContaBancariaComConstrutor("Natan Lima", 12345);

        System.out.println("Segue o nome do titular da conta: " + c1.titular);
        System.out.println("Segue o número da conta: " + c1.numeroConta);

        System.out.println();

        ContaBancariaComConstrutor c2 = new ContaBancariaComConstrutor("Aline Beatriz", 12346);

        System.out.println("Segue o nome do titular da conta: " + c2.titular);
        System.out.println("Segue o número da conta: " + c2.numeroConta);

        System.out.println("Deseja depositar um valor em conta? ");
        c1.depositar(entrada.nextDouble());

        System.out.println("Saldo após o depósito: " + c1.saldo);

    }
}
