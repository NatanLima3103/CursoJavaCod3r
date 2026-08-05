import java.util.Scanner;

public class AritmeticosExercicio {

    //Peça três notas de um aluno. Calcule a média e o "resto" da
    // média dividida por 2 usando % (só pra praticar o operador,
    // não tem significado real aqui).

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = ((nota1 + nota2 + nota3) / 3);

        System.out.println("A média do aluno foi de: " + media);

        double calcResto = (media % 2);

        System.out.println("Resto da média: " + calcResto);
    }
}
