package EstruturasDeControle;

import java.util.Scanner;

public class ForExercicio {

    //Use um for para imprimir a tabuada de um número que
    // o usuário digitar (de 1 a 10).

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número para realizar a tabuada");
        int num = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
