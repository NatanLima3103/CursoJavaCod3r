package reforco1.forAninhado.lista;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String [] nomes = {"Natan", "Aline", "Kety"};

        for(int i = 0; i < nomes.length; i++){

            int [] notas = new int[4];
            boolean notasValidas = true;

            for(int j = 0; j < notas.length; j++) {

                System.out.println("Informe uma nota: ");
                notas[j] = entrada.nextInt();

                if (notas[j] < 0 || notas[j] > 10) {
                    notasValidas = false;
                    System.out.println("Nota inválida, tente novamente.");

                }
            }
            if(notasValidas){
                int soma = notas[0] + notas[1] + notas[2] + notas[3];
                double media = soma / 4.0;
                System.out.println(nomes[i] + " - Média: " + media);
            } else{

                System.out.println(nomes[i] + " tem dados inválidos, média não calculada");
            }
        }
    }
}
