package ExerciciosFixacao.reforco1.array;

import java.util.Scanner;

public class ArrayBuscaExercicio {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int [] numeros = {19, 52, 31, 5, 29, 87, 90, 63};

        boolean encontrado = false;
        int posicaoEncontrada = 0;

        System.out.println("Informe um número para fazer a busca");
        int numeroProcura = entrada.nextInt();

        for (int i =0; i < numeros.length; i++){

            if (numeros[i] == numeroProcura){
                posicaoEncontrada = i;
                encontrado = true;
            }
        }
        if(encontrado){

            System.out.println("Posição encontrada: " + posicaoEncontrada);
        } else {
            System.out.println("Número não encontrado no array. ");
        }
    }
}
