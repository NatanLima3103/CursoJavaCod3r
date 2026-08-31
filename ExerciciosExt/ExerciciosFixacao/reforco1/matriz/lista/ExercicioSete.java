package ExerciciosFixacao.reforco1.matriz.lista;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] matriz = new int[3][3];

        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("Informe um valor: ");
                int valorInf = entrada.nextInt();
                matriz[linha][coluna] = valorInf;
            }
        }

        for(int linha = 0; linha < matriz.length; linha++){

            int contadorPar = 0;

            for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if(matriz[linha][coluna] % 2 == 0){
                    contadorPar++;
                }
            }

            System.out.println("Linha " + linha + " tem " + contadorPar + " números pares.");
        }
    }
}
