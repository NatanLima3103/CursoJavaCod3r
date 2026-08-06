import java.util.Scanner;

public class TernarioExercicio {

    //Peça a idade do usuário. Usando ternário (sem if), imprima
    // "Maior de idade" ou "Menor de idade".

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = entrada.nextInt();

        String eMaiorDeidade = idade >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println("Você é " + eMaiorDeidade);


    }
}
