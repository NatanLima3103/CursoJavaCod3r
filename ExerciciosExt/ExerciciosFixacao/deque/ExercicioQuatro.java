package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Deque<String> nomes = new ArrayDeque<>();

        System.out.println("Infome um nome: ");
        String nomeInf = entrada.nextLine();

        while(!nomeInf.equalsIgnoreCase("Fim")){
            nomes.push(nomeInf);
            System.out.println("Informe outro nome: ");
            nomeInf = entrada.nextLine();
        }
        while(!nomes.isEmpty()){

            System.out.println(nomes.pop());
        }
    }
}
