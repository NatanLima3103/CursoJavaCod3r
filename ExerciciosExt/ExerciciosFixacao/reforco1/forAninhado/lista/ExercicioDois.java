package reforco1.forAninhado.lista;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String [] nomes = {"Natan", "Aline", "Ketney"};

        for(int i = 0; i < nomes.length; i++){
            double [] valores = new double[2];

            for(int j = 0; j < valores.length; j++) {
                System.out.println("Informe uma nota: ");
                valores[j] = entrada.nextDouble();

            }

            double soma = valores[0] + valores[1];

            System.out.println(nomes[i] + " - Total de pedidos: " + soma);
        }

    }
}
