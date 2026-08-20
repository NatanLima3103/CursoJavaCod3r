package EstruturasDeControle;

import java.util.Scanner;

public class WhileMediaNotasExercicio {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas, para fazer a média: ");
        int qtdNotas = entrada.nextInt();

        double soma = 0;
        int contador = qtdNotas;

        while (contador != 0) {

            System.out.println("Informa a nota: ");
            double nota = entrada.nextDouble();
            soma = soma + nota;
            contador--;

        }

        double media = soma / qtdNotas;

        System.out.println("A soma das médias foi: " + soma);
        System.out.println("A média das médias foi: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}
