package stream.match.exercicioTres;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MonitorAr {

    public static void main(String[] args) {
        List<Sala> salas = new ArrayList<>();

        salas.add(new Sala("Sala 101", 850, 23.0, true));
        salas.add(new Sala("Sala 102", 1600, 25.0, false));
        salas.add(new Sala("Sala 103", 900, 28.0, true));
        salas.add(new Sala("Sala 104", 1100, 24.0, true));

        Predicate<Sala> arPesado = s -> s.getCo2() > 1000 && !s.isJanelaAberta();
        Predicate<Sala> confortavel = s -> s.getTemperatura() >= 20.0 && s.getTemperatura() <= 26.0;
        Predicate<Sala> critico = s -> s.getCo2() > 1500 || s.getTemperatura() > 30.0;
        Predicate<Sala> naoCritico = s -> s.getCo2() <= 1500.0 && s.getTemperatura() <= 30.0;

        System.out.println("=== MONITOR DE QUALIDADE DO AR ===");

        boolean temArPesado = salas.stream()
                .anyMatch(arPesado);
        System.out.println("Existe sala com ar pesado? " + temArPesado);

        boolean todasConfortaveis = salas.stream()
                .allMatch(confortavel);
        System.out.println("Todas em temperatura confortavel? " + todasConfortaveis);

        boolean nenhumaCritica = salas.stream()
                .noneMatch(critico);
        System.out.println("Nenhuma em estado critico? " + nenhumaCritica);

        boolean todasForaDoCritico = salas.stream()
                .allMatch(naoCritico);
        System.out.println("Todas fora do estado critico? " + todasForaDoCritico);
    }
}
