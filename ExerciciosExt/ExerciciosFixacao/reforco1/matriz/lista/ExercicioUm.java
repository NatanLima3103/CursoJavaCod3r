package reforco1.matriz.lista;

import javax.print.DocFlavor;

public class ExercicioUm {

    public static void main(String[] args){

        int [][] matriz = new int [2][3];

        matriz [0][0] = 10;
        matriz [0][1] = 20;
        matriz [0][2] = 30;
        matriz [1][0] = 40;
        matriz [1][1] = 50;
        matriz [1][2] = 60;

        for (int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){

                System.out.println(matriz[linha][coluna]);
            }
        }
    }
}
