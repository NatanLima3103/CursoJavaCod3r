import java.util.Scanner;

public class ForContagemRegressivaExercicio {

    public static void main (String[] args) {

        // Peça ao usuário um número inicial (inteiro, positivo). Usando
        // um for, imprima uma contagem regressiva desse número até 1,
        // e ao final imprima "Fim da contagem!".
        //
        // Exemplo, se o usuário digitar 5:
        // 5
        // 4
        // 3
        // 2
        // 1
        // Fim da contagem!

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número para realizar a contagem regressiva: ");
        int num = entrada.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
            System.out.println("Fim da contagem!");

    }
}
