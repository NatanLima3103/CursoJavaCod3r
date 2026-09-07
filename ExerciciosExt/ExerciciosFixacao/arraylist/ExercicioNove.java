package arraylist;

import java.util.ArrayList;

public class ExercicioNove {
    public static void main(String[] args) {
        ArrayList<String> alunosAprovados = new ArrayList<>();

        alunosAprovados.add("Natan");
        alunosAprovados.add("Lima");
        alunosAprovados.add("Aline");

        ArrayList<String> alunosReprovados = new ArrayList<>();

        alunosReprovados.add("Fiori");
        alunosReprovados.add("Kety");
        alunosReprovados.add("Souza");

        alunosAprovados.addAll(alunosReprovados);

        System.out.println(alunosAprovados);
    }
}
