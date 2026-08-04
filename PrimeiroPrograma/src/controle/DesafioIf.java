package controle;

import java.util.Scanner;
import java.util.Locale;

public class DesafioIf {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Informe a nota: ");
        double nota = entrada.nextDouble();

        // Não usar ";" em estruturas de controle (tem uma exceção).
        if (nota >= 9.0) {
            System.out.println("Quadro de honra!");
            System.out.println("Você é fera!!!");
        }
    }
}
