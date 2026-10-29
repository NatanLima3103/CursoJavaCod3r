package lambda.consumer.exercicioSete;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Rh {

    public static void main(String[] args) {
        Funcionario natan = new Funcionario("Natan", "natan@email.com", "Analista");
        Funcionario lima = new Funcionario("Lima", "lima@email.com", "Desenvolvedor");
        Funcionario aline = new Funcionario("aline", "aline@email.com", "Gerente");

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(natan);
        funcionarios.add(lima);
        funcionarios.add(aline);

        List<Consumer<Funcionario>> acoes = new ArrayList<>();

        acoes.add(f -> System.out.println("Parabéns, " + f.getNome() + "! Obrigado pelo trabalho como " + f.getCargo()));
        acoes.add(f -> System.out.println("[PONTO] Registrado para " + f.getNome()));
        acoes.add(f -> System.out.println("Holerite enviado para " + f.getEmail()));

        funcionarios.forEach(funcionario -> acoes.forEach(acao -> acao.accept(funcionario)));

        acoes.add(f -> System.out.println("[RH] Pasta atualizada de " + f.getNome()));

        funcionarios.forEach(funcionario -> acoes.forEach(acao -> acao.accept(funcionario)));
    }
}
