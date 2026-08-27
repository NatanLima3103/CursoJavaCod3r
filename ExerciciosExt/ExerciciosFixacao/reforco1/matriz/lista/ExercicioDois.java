package reforco1.matriz.lista;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas: ");
        int linhas = entrada.nextInt();
        System.out.println("Informe a quantidade de colunas: ");
        int colunas = entrada.nextInt();

        int soma = 0;

        int [][] matriz = new int [linhas][colunas];

        for (int linha = 0; linha<matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){

                System.out.println("Informe um valor para a posição: ");
                int valorInf = entrada.nextInt();

                matriz[linha][coluna] = valorInf;
                soma = soma + valorInf;
            }
        }

        System.out.println(soma);
    }
}
