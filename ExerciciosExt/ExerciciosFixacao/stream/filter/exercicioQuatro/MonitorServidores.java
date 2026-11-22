package stream.filter.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MonitorServidores {
    public static void main(String[] args) {
        List<Servidor> servidores = new ArrayList<>();

        servidores.add(new Servidor("web-01", 92, true));
        servidores.add(new Servidor("db-01", 45, true));
        servidores.add(new Servidor("web-02", 30, false));
        servidores.add(new Servidor("cache-01", 85, true));
        servidores.add(new Servidor("backup-01", 12, false));

        Predicate<Servidor> sobrecarregado = s -> s.getUsoCpu() >= 80;
        Predicate<Servidor> foraDoAr = s -> !s.isOnline();
        Predicate<Servidor> estavel = s -> s.isOnline() && s.getUsoCpu() < 50;

        System.out.println("=== SOBRECARGA ===");
        servidores.stream()
                .filter(sobrecarregado)
                .forEach(s -> System.out.println(s.getNome() + " - CPU " + s.getUsoCpu() + "%"));

        System.out.println("=== FORA DO AR ===");
        servidores.stream()
                .filter(foraDoAr)
                .forEach(s -> System.out.println("OFFLINE: " + s.getNome()));

        System.out.println("=== ESTAVEIS ===");
        long qtdEstaveis = servidores.stream()
                .filter(estavel)
                .count();

        System.out.println("Servidores estaveis: " + qtdEstaveis);
    }
}
