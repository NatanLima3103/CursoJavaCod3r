package EstruturasDeControle;

import java.util.Scanner;

public class ForSomaParesExercicio {

    public static void main (String[] args) {

        // 1. cria uma variável "soma", começando em 0, fora do for
        // 2. o for percorre de 1 até 100
        // 3. dentro do for, verifica: esse número é par?
        // 4. se for, soma ele na variável "soma"
        // 5. depois que o for terminar, imprime a soma

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
        }

        System.out.println("A soma dos números foi: " + soma);

    }
}
