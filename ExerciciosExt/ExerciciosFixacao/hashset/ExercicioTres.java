package hashset;

import java.util.HashSet;

public class ExercicioTres {
    public static void main(String[] args) {
        HashSet<String> cursoA = new HashSet<>();
        HashSet<String> cursoB = new HashSet<>();

        cursoA.add("Natan");
        cursoA.add("Lima");
        cursoA.add("Aline");
        cursoA.add("Fiori");

        cursoB.add("Kety");
        cursoB.add("Souza");
        cursoB.add("Wellington");
        cursoB.add("Natan");

        cursoA.retainAll(cursoB);

        if(cursoA.isEmpty()){
            System.out.println("Não há alunos matriculados em ambos os cursos.");
        } else {
            System.out.println("Há alunos matriculados em ambos os cursos: " + cursoA);
        }
    }
}
