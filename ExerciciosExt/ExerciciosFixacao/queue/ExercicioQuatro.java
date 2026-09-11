package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Queue<String> nomes = new LinkedList<>();

        System.out.println("Informe um nome: ");
        String nomeInf = entrada.nextLine();

        while(!nomeInf.equalsIgnoreCase("fim")){
            nomes.add(nomeInf);

            System.out.println("Informe outro nome: ");
            nomeInf = entrada.nextLine();
        }

        while(!nomes.isEmpty()){
            System.out.println("Atendendo: " + nomes.poll());
        }
    }
}
