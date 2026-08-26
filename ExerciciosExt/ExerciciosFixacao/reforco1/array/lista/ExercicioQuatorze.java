package reforco1.array.lista;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int [] numeros = {2, 4, 16, 20, 35, 36, 53, 69};

        System.out.println("Informe um número: ");
        int numInf = entrada.nextInt();
        boolean numEncontrado = false;

        for(int i = 0; i < numeros.length; i++){

            if(numInf == numeros[i]){
                numEncontrado = true;
            }
        }
        if(!numEncontrado){
            System.out.println("Numero não encontrado");
        } else {
            System.out.println("Numero encontrado");
        }
    }
}
