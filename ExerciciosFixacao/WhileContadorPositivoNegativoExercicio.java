import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileContadorPositivoNegativoExercicio {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número");
        int num = entrada.nextInt();
        int positivo = 0;
        int negativo = 0;

        while (num != -999) {

            System.out.println("Informe outro número: ");
            num = entrada.nextInt();

            if (num > 0) {
                positivo = positivo + 1;
            } else {
                negativo = negativo + 1;
            }
        }

        System.out.println("Quantidade de números positivos: " + positivo);
        System.out.println("Quantidade de números negativos: " + negativo);
    }
}
