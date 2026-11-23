package stream.filter.exercicioOito;

import java.util.ArrayList;
import java.util.List;

public class FilaSuporte {

    public static void main(String[] args) {
        List<Chamado> chamados = new ArrayList<>();

        chamados.add(new Chamado("Impressora offline", "BAIXA", 70, false));
        chamados.add(new Chamado("VPN caiu", "ALTA", 12, false));
        chamados.add(new Chamado("Email lento", "MEDIA", 50, true));
        chamados.add(new Chamado("Servidor fora", "ALTA", 96, false));
        chamados.add(new Chamado("Teclado quebrado", "BAIXA", 30, true));

        System.out.println("=== ABERTOS HA 2 DIAS OU MAIS ===");
        chamados.stream()
                .filter(c -> {
                    int diasAbertos = c.getHorasAberto() / 24;
                    return diasAbertos >= 2 && !c.isResolvido();
                })
                .forEach(c -> System.out.println(c.getTitulo() + " - " + c.getHorasAberto() / 24 + " dia(s)"));

        System.out.println("=== PRIORIDADE ALTA PENDENTE ===");
        chamados.stream()
                .filter(c -> {
                    if (c.isResolvido()) {
                        return !c.isResolvido();
                    }
                    return c.getPrioridade().equals("ALTA");
                })
                .forEach(c -> System.out.println("[ALTA] " + c.getTitulo()));

        System.out.println("=== CRITICOS ===");
        long criticos = chamados.stream()
                .filter(c -> {
                    boolean antigo = c.getHorasAberto() > 48;
                    boolean pendente = !c.isResolvido();
                    return antigo && pendente;
                })
                .count();

        System.out.println("Chamados criticos: " + criticos);
    }
}
