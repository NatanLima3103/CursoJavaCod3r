package classe;

import java.util.Scanner;

public class IngressoTeste {


    public static void main (String[] args) {

    Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do ingresso: ");
        double valorIngresso = entrada.nextDouble();

        Ingresso i1 = new Ingresso();
        i1.ingresso = "Metallica";
        i1.precoBase = 150.00;

        System.out.println(i1.calcularPrecoComTaxa(10));
    }
}
