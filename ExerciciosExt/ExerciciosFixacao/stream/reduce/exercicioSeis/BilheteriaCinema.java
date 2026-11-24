package stream.reduce.exercicioSeis;

import java.util.ArrayList;
import java.util.List;

public class BilheteriaCinema {

    public static void main(String[] args) {
        List<Sessao> sessoes = new ArrayList<>();

        sessoes.add(new Sessao("Duna 3", 120, 25.0, false));
        sessoes.add(new Sessao("Infantil", 40, 20.0, true));
        sessoes.add(new Sessao("Acao Total", 80, 30.0, true));
        sessoes.add(new Sessao("Drama Leve", 60, 22.0, false));

        System.out.println("=== BILHETERIA ===");

        double faturametoCheias = sessoes.stream()
                .filter(s -> s.getIngressos() > 50)
                .map(s -> s.getIngressos() * s.getValorIngresso())
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("Faturamento das sessoes cheias: R$ " + faturametoCheias);

        int ingressosDublados = sessoes.stream()
                .filter(s -> s.isDublado())
                .map(s -> s.getIngressos())
                .reduce(0, (a, b) -> a + b);

        System.out.println("Ingressos dublados: " + ingressosDublados);

        double repasse = sessoes.stream()
                .filter(s -> !s.isDublado())
                .map(s -> s.getIngressos() * s.getValorIngresso())
                .reduce(0.0, (a, b) -> {
                    double repassada;
                    if (b > 1000.0){
                        repassada =  b * 0.9;
                    } else {
                        repassada = b;
                    }
                    return a + repassada;
                });

        System.out.println("Repasse das legendadas: R$ " + repasse);
    }
}
