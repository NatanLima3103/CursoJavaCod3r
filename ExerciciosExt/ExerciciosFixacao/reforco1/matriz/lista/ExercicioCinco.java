package reforco1.matriz.lista;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [][] matriz = new int [2][4];

        for(int linha = 0; linha < matriz.length; linha++){

            int soma = 0;

            for (int coluna = 0; coluna < matriz[linha].length; coluna ++){

                System.out.println("informe um valor: ");
                int valorInf = entrada.nextInt();

                matriz[linha][coluna] =  valorInf;

                soma = valorInf + soma;
            }
            System.out.println("Soma da linha " + linha + ": " + soma);
        }

    }
}
