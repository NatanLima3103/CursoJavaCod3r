/*package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main (String [] args) {
        Scanner salario = new Scanner(System.in);

        System.out.println("Informe o primeiro salário: ");
        double salario1 = salario.nextInt();

        System.out.println("Informe o segundo salário: ");
        double salario2 = salario.nextInt();

        System.out.println("Informe o terceiro salário: ");
        double salario3 = salario.nextInt();

        double  soma, media;

        soma = salario1 + salario2 + salario3;

        media = soma / 3;

        System.out.println("A soma dos salários é: " + soma);

        System.out.println("A média dos salários é: " + media);


    }
}*/

package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main (String [] args) {
        Scanner salario = new Scanner(System.in);

        System.out.println("Informe o primeiro salário: ");
        String salario1 = salario.nextLine().replace(",", ".");

        System.out.println("Informe o segundo salário: ");
        String salario2 = salario.nextLine().replace(",", ".");

        System.out.println("Informe o terceiro salário: ");
        String salario3 = salario.nextLine().replace(",", ".");

        double salarioDouble1 = Double.parseDouble(salario1);
        double salarioDouble2 = Double.parseDouble(salario2);
        double salarioDouble3 = Double.parseDouble(salario3);

        double  soma, media;

        soma = salarioDouble1 + salarioDouble2 + salarioDouble3;

        media = soma / 3;

        System.out.println("A soma dos salários é: " + soma);

        System.out.println("A média dos salários é: " + media);


    }
}
