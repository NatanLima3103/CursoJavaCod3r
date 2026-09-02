package colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;

public class ConjuntoComportado {

    public static void main(String[] args) {

        // HashSet<String> listaAprovados = new HashSet<String>();
        TreeSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Natan");
        listaAprovados.add("Aline");
        listaAprovados.add("Lucca");
        listaAprovados.add("Kety");

        for(String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n: nums) {

            System.out.println(n);
        }
    }
}
