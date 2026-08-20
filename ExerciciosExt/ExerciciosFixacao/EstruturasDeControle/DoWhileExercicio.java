package EstruturasDeControle;

import java.util.Scanner;

public class DoWhileExercicio {

    //Peça uma senha ao usuário repetidamente até ele acertar a senha correta (defina uma senha
    // fixa no código, tipo "1234"). Use do/while, já que ele precisa digitar pelo menos uma vez
    // antes de checar.

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        int senha = 1234;
        int verificadorSenha = senha;

        do {
            System.out.println("Informe sua senha: ");
            senha = entrada.nextInt();

            if (verificadorSenha != senha) {
                System.out.println("Sua senha está incorreta");
            } else {
                System.out.println("Sua senha está correta!");
            }

        } while (verificadorSenha != senha);
    }
}
