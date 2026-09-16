package equalsHashcode;

import java.util.HashSet;

public class ExercicioDoisTeste {
    public static void main(String[] args) {
        HashSet<ExercicioDois> alunos = new HashSet<>();

        alunos.add(new ExercicioDois("Natan", 1234));
        alunos.add(new ExercicioDois("Natan", 1234));

        System.out.println(alunos.size());
    }
}
