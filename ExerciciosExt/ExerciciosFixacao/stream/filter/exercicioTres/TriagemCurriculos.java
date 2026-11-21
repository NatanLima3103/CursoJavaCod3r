package stream.filter.exercicioTres;

import java.util.ArrayList;
import java.util.List;

public class TriagemCurriculos {

    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();

        candidatos.add(new Candidato("Ana", 1, 9.5, true));
        candidatos.add(new Candidato("Bruno", 4, 7.0, false));
        candidatos.add(new Candidato("Carla", 6, 6.0, true));
        candidatos.add(new Candidato("Diego", 3, 8.5, false));
        candidatos.add(new Candidato("Elena", 2, 5.0, true));

        System.out.println("=== PERFIL IDEAL ===");
        candidatos.stream()
                .filter(c -> c.getAnosExperiencia() >= 3 && c.getNota() >= 7.0)
                .forEach(c -> System.out.println(c.getNome() + " - " + c.getAnosExperiencia() + " anos | nota " + c.getNota()));

        System.out.println("=== DESTAQUES ===");
        candidatos.stream()
                .filter(c -> c.getAnosExperiencia() >= 5 || c.getNota() >= 9.0)
                .forEach(c -> System.out.println(c.getNome() + " (destaque)"));

        System.out.println("=== ENTREVISTA PRESENCIAL OU NOTA ALTA ===");
        long aprovados = candidatos.stream()
                .filter(c -> !c.isRemoto() || c.getNota() >= 9.0)
                .count();

        System.out.println("Aprovados para entrevista: " + aprovados);
    }
}
