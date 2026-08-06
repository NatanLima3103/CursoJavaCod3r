import java.util.Scanner;

public class IfElseIfExercicio {

    //Peça a idade do usuário e classifique em faixa etária:
    // "Criança" (até 12), "Adolescente" (13 a 17), "Adulto"
    // (18 a 59), "Idoso" (60+).

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        if (idade <= 12) {
            System.out.println("Você é uma crinça!");
        } else if (idade > 12 && idade <= 17) {
            System.out.println("Você é um adolescente!");
        } else if (idade > 17 && idade <= 59) {
            System.out.println("Você é um adulto!");
        } else if (idade >= 60) {
            System.out.println("você é um idoso!");
        } else {
            System.out.println("Informe uma idade válida!");
        }
    }
}
