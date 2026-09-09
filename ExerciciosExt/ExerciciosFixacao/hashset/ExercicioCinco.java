package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        HashSet<String> nomes = new HashSet<>();

        System.out.println("Informe um nome: ");
        String nomeInf = entrada.nextLine();

        while(!nomeInf.equals("fim")){
            nomes.add(nomeInf);

            System.out.println("Informe outro nome: ");
            nomeInf = entrada.nextLine();
        }

        System.out.println("Nomes cadastrados: " + nomes);
        System.out.println("Quantidade de nomes: " + nomes.size());
    }
}
