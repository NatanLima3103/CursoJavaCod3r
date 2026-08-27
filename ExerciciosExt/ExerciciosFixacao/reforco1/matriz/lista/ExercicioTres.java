package reforco1.matriz.lista;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas: ");
        int linhas = entrada.nextInt();
        System.out.println("Informe a quantidade de colunas: ");
        int colunas = entrada.nextInt();

        int maiorValor = 0;

        int [][] matriz = new int[linhas][colunas];

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){

                System.out.println("Informe um valor para armazenar: ");
                int valorInf = entrada.nextInt();

                matriz[linha][coluna] = valorInf;

                if (valorInf > maiorValor){

                    maiorValor = valorInf;
                }
            }
        }
        System.out.println(maiorValor);
    }
}
