package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Natan", 7.8);
        Aluno a2 = new Aluno("Jonatan", 5.8);
        Aluno a3 = new Aluno("Lima", 9.8);
        Aluno a4 = new Aluno("Aline", 6.8);
        Aluno a5 = new Aluno("Beatriz", 7.1);
        Aluno a6 = new Aluno("Fiori", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";

        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
