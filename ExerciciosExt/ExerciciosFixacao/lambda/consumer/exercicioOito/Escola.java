package lambda.consumer.exercicioOito;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Escola {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Natan", 8.5));
        alunos.add(new Aluno("Lima", 5.0));
        alunos.add(new Aluno("Aline", 7.0));
        alunos.add(new Aluno("Fiori", 6.5));

        Resumo resumo = new Resumo();

        Consumer<Aluno> exibir = a -> System.out.println(a.getNome() + " (nota " + a.getNota() + "): " + a.getSituacao());
        Consumer<Aluno> definirSituacao = a -> {
            if (a.getNota() >= 7){
                a.setSituacao("APROVADO");
            } else {
                a.setSituacao("REPROVADO");
            }
        };
        Consumer<Aluno> contar = a-> {
            if (a.getSituacao().equals("APROVADO")){
                resumo.registrarAprovados();
            }else {
                resumo.registrarReprovados();
            }
        };

        alunos.forEach(exibir);
        alunos.forEach(definirSituacao);
        alunos.forEach(exibir);
        alunos.forEach(contar);

        System.out.println("Aprovados: " + resumo.getAprovados() + " | Reprovados: " + resumo.getReprovados());
    }
}
