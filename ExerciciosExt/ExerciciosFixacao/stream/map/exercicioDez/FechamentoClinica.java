package stream.map.exercicioDez;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FechamentoClinica {

    public static void imprimirFaturas(List<Consulta> consultas, Function<Consulta, Fatura> regra){
        consultas.stream()
                .map(regra)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Consulta> consultas = new ArrayList<>();

        consultas.add(new Consulta("Marcos", "Ortodontia", 300.0, false));
        consultas.add(new Consulta("Patricia", "Limpeza", 200.0, true));
        consultas.add(new Consulta("Eduardo", "Canal", 1200.0, false));
        consultas.add(new Consulta("Sofia", "Clareamento", 800.0, true));

        Function<Consulta, Fatura> gerarFatura = g -> {
            double valorFinal;
            if (g.isRetorno()){
                valorFinal = g.getValorBase() * 0.5;
            } else {
                valorFinal = g.getValorBase();
            }
            return new Fatura(g.getPaciente(), valorFinal);
        };

        System.out.println("=== FATURAS ===");
        imprimirFaturas(consultas, gerarFatura);

        System.out.println("=== ETIQUETAS ===");
        consultas.stream()
                .map(gerarFatura)
                .map(f -> f.getPaciente().toUpperCase() + ": R$ " + f.getValorFinal())
                .forEach(System.out::println);

        System.out.println("=== CONTAGEM ===");
        long faturas = consultas.stream()
                .map(c -> c.getPaciente())
                .count();

        System.out.println("Faturas geradas: " + faturas);
    }
}
