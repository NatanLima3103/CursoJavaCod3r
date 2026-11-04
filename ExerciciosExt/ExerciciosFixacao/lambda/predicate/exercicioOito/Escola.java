package lambda.predicate.exercicioOito;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Escola {

    public static List<Aluno> filtrar(List<Aluno> alunos, Predicate<Aluno> regra){
        List<Aluno> filtrar = new ArrayList<>();
        for (Aluno a : alunos){
            if (regra.test(a)){
                filtrar.add(a);
            }
        }
        return filtrar;
    }

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Natan", 8.5, 90));
        alunos.add(new Aluno("Lima", 9.0, 60));
        alunos.add(new Aluno("Aline", 6.0, 80));
        alunos.add(new Aluno("Fiori", 4.0, 95));
        alunos.add(new Aluno("Ketney", 7.0, 75));

        List<Aluno> aprovados = filtrar(alunos, a-> a.getNota() >= 7 && a.getFrequencia() >= 75);
        List<Aluno> recuperacao = filtrar(alunos, a -> a.getNota() >= 5 && a.getNota() < 7);
        List<Aluno> reprovados = filtrar(alunos, a -> a.getNota() < 5 || a.getFrequencia() < 75);

        System.out.println("Alunos aprovados: ");
        aprovados.forEach(a -> System.out.println(a.getNome() + " - " + a.getNota()));

        System.out.println("Alunos em recuperação: ");
        recuperacao.forEach( a -> System.out.println(a.getNome() + " - " + a.getNota()));

        System.out.println("Alunos reprovados: ");
        reprovados.forEach( a -> System.out.println(a.getNome() + " - " + a.getNota()));
    }
}
