package lambda.function.exercicioCinco;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioCinco {

    public static List<String> transformar(List<Aluno> alunos, Function<Aluno, String> regra) {
        List<String> resultado = new ArrayList<>();

        for (Aluno aluno : alunos) {
            resultado.add(regra.apply(aluno));
        }

        return resultado;
    }

    public static void main(String[] args) {
        List<Aluno> turma = new ArrayList<>();
        turma.add(new Aluno("Natan", 8.5));
        turma.add(new Aluno("Lima", 6.0));
        turma.add(new Aluno("Aline", 9.5));
        turma.add(new Aluno("Fiori", 4.0));

        Function<Aluno, String> apenasNome = aluno -> aluno.getNome();
        Function<Aluno, String> boletim = aluno -> aluno.getNome().toUpperCase() + ": " + aluno.getNota();

        List<String> nomes = transformar(turma, apenasNome);
        List<String> boletins = transformar(turma, boletim);

        System.out.println("--- Nomes ---");
        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("--- Boletim ---");
        boletins.forEach(linha -> System.out.println(linha));

        List<String> comBonus = transformar(turma,
                aluno -> aluno.getNome() + " -> " + (aluno.getNota() + 0.5));

        System.out.println("--- Com bônus ---");
        comBonus.forEach(linha -> System.out.println(linha));

        System.out.println("Tamanho da turma: " + turma.size() + " | Tamanho de nomes: " + nomes.size());
    }
}