package reforco1.matriz.lista;

import java.util.Scanner;

public class ExercicioSeis {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [][] matriz = new int [3][3];

        for (int linha = 0; linha < matriz.length; linha++){

            for(int coluna = 0; coluna < matriz[linha].length; coluna++){

                System.out.println("Informe um valor de coluna:");
                int valorInf = entrada.nextInt();
                matriz[linha][coluna] = valorInf;
            }
        }

        for (int coluna = 0; coluna < matriz[0].length; coluna++) {

            int somaColuna = 0;
            for(int linha = 0; linha < matriz.length; linha++){

                somaColuna = somaColuna + matriz[linha][coluna];
            }

            System.out.println("Soma da coluna " + coluna + ": " + somaColuna);
        }
    }
}
