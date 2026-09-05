package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Informe um nome: ");
        String nomeInf = entrada.nextLine();

        while(!nomeInf.equalsIgnoreCase("Sair")) {
            nomes.add(nomeInf);

            System.out.println("Informe outro nome (ou 'sair' para terminar): ");
            nomeInf = entrada.nextLine();
        }

        System.out.println("Quantidade total de nomes informados: " + nomes.size());

        for(String nome : nomes){

            System.out.println(nome);
        }
    }
}
