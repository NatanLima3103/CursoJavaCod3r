import java.util.Scanner;

public class IfExercicio {

    //Peça um número. Se ele for maior que zero, imprima "Positivo!".

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe o número: ");
        int num = entrada.nextInt();

        if (num > 0) {
            System.out.println("Positivo!");
        }

    }
}
