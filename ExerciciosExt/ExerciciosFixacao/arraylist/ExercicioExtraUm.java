package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioExtraUm {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        numeros.add(6);

        System.out.println("Informe um número de referência: ");
        int valorReferencia = entrada.nextInt();

        int numeroMaisProximo = numeros.get(0);
        int menorDiferenca = Math.abs(numeros.get(0) - valorReferencia);

        for(int num : numeros) {
            int diferencaAtual = Math.abs(num - valorReferencia);

            if(diferencaAtual < menorDiferenca) {

                menorDiferenca = diferencaAtual;
                numeroMaisProximo = num;
            }
        }
            System.out.println("O número mais próximo de " + valorReferencia + " é: " + numeroMaisProximo);
    }
}
