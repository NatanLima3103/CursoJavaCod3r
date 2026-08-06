import java.util.Scanner;

public class WhileMultiplosDeTresExercicio {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int num = entrada.nextInt();
        int nM = 0;
        int m = 0;

        while (num != 0) {

            if (num % 3 == 0){

                System.out.println("O número é múltiplo de 3!");
                nM = nM + 1;
            } else {

                System.out.println("O número não é múltiplo de 3!");
                m = m + 1;
            }

            num--;


        }

        System.out.println("Total de números múltimplos" + nM);
        System.out.println("Total de números não múltimplos" + m);

    }
}
