package reforco1.matriz.lista;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [][] matriz = new int[3][3];

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int linha = 0; linha <matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){

                System.out.println("Informe o número: ");
                int numInf = entrada.nextInt();

                matriz[linha][coluna] = numInf;

                if(matriz[linha][coluna] % 2 == 0) {
                    contadorPar++;
                }else {
                    contadorImpar++;
                }

            }
        }

        System.out.println(contadorPar);
        System.out.println(contadorImpar);
    }
}
