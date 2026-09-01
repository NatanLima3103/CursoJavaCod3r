package reforco1.forAninhado.lista;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String [] nomesProdutos = {"Caneta", "Caderno", "Borracha"};

        for (int i = 0; i < nomesProdutos.length; i++){
            int [] qtdeVendida = new int[4];

            for(int j = 0; j < qtdeVendida.length; j++){

                System.out.println("Informe a quantidade vendida: ");
                qtdeVendida[j] = entrada.nextInt();
            }

            int soma = qtdeVendida[0] + qtdeVendida[1] + qtdeVendida[2] + qtdeVendida[3];
            double media = soma / 4.0;

            System.out.println("A média mensal foi: " + media + " , o total somado foi: " + soma);
        }
    }
}
