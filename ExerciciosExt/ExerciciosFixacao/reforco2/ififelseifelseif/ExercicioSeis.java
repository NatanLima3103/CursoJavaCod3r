package reforco2.ififelseifelseif;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um caracter: ");
        String letraDigitada = entrada.nextLine();

        char letra = letraDigitada.charAt(0);

        letra = Character.toLowerCase(letra);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){

            System.out.println("Essa letra é uma vogal.");
        } else {

            System.out.println("Essa letra é uma consoante");
        }
    }
}
