package stream.match.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ValidadorImportacao {

    public static boolean existeAlgum(List<Inscricao> inscricoes, Predicate<Inscricao> regra){
        return inscricoes.stream()
                .anyMatch(regra);
    }

    public static boolean todasAtendem(List<Inscricao> inscricoes, Predicate<Inscricao> regra){
        return inscricoes.stream()
                .allMatch(regra);
    }

    public static boolean nenhumaAtende(List<Inscricao> inscricoes, Predicate<Inscricao> regra){
        return inscricoes.stream()
                .noneMatch(regra);
    }

    public static void main(String[] args) {
        List<Inscricao> inscricoes = new ArrayList<>();

        inscricoes.add(new Inscricao("anta@mail.com", 25, true));
        inscricoes.add(new Inscricao("bruno@mail.com", 17, true));
        inscricoes.add(new Inscricao("carla@mail.com", 34, false));
        inscricoes.add(new Inscricao("diego@mail.com", 41, true));

        System.out.println("=== IMPORTACAO DE INSCRICOES ===");
        boolean existeMenor = existeAlgum(inscricoes, i -> i.getIdade() < 18);

        System.out.println("Existe menor de idade? " + (existeMenor? "SIM": "NAO"));

        Predicate<Inscricao> pagamentoOk = i -> i.isPagamentoConfirmado();

        boolean todosPagaram = todasAtendem(inscricoes, pagamentoOk);

        System.out.println("Todos os pagamentos confirmados? " + (todosPagaram? "SIM":"NAO"));

        boolean nenhumEmailVazio = nenhumaAtende(inscricoes, i -> i.getEmail().isEmpty());

        System.out.println("Nenhum email em branco? " + (nenhumEmailVazio? "SIM":"NAO"));

        boolean importacaoLiberada = !existeMenor && todosPagaram && nenhumEmailVazio;

        System.out.println("STATUS DA IMPORTACAO: " + (importacaoLiberada? "LIBERADA":"BLOQUEADA"));
    }
}
