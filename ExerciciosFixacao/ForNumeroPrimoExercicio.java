import java.util.Scanner;

public class ForNumeroPrimoExercicio {

    //1. cria uma variável booleana "ehPrimo", começando como true
    //2. o for percorre de 2 até (número - 1)
    //3. dentro do for, verifica: o número é divisível por esse i? (resto == 0)
    //4. se for divisível por algum desses, então NÃO é primo → ehPrimo = false
    //5. depois do for, se ehPrimo continuar true, imprime "é primo", senão "não é primo"

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean ehPrimo = true;

        System.out.println("Informe um número:");
        int num = entrada.nextInt();

        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                ehPrimo = false;
            }

        }
        if (ehPrimo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
