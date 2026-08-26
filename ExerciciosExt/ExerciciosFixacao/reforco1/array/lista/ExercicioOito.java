package reforco1.array.lista;

import javax.print.DocFlavor;
import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [] numeros = {55, 83, 46, 14, 83, 9, 39, 83};

        System.out.println("Informe um número para verificar se está repetido: ");
        int numDigitado = entrada.nextInt();
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == numDigitado){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
