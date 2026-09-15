package hashmap;

import java.util.HashMap;

public class ExercicioTres {
    public static void main(String[] args) {
        HashMap<String, Integer> alunos = new HashMap<>();

        alunos.put("Natan", 10);
        alunos.put("Lima", 8);
        alunos.put("Aline", 9);
        alunos.put("Fiori", 7);
        alunos.put("Kety", 6);

        int soma = 0;
        double media = 0;

        for (int notaAluno : alunos.values()){

            soma = notaAluno + soma;
        }
        media = (double) soma / alunos.size();

        System.out.println("A média é: " + media);
    }
}
