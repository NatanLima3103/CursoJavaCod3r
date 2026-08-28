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
            }
        }
    }
}
