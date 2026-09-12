package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioDez {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Natan");
        nomes.add("Lima");
        nomes.add("Aline");
        nomes.add("Fiori");
        nomes.add("Wellington");

        String nomeMaisLongo = nomes.poll();

        while(!nomes.isEmpty()){
            String nomeAtual = nomes.poll();

            if(nomeAtual.length() > nomeMaisLongo.length()){

                nomeMaisLongo = nomeAtual;
            }
        }
        System.out.println("O nome mais longo é: " + nomeMaisLongo);
    }
}
