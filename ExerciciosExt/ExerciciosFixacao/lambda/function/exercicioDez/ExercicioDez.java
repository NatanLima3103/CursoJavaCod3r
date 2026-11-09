package lambda.function.exercicioDez;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioDez {

    public static List<String> transformar(List<Reserva> reservas, Function<Reserva, String> regra){
        List<String> resultado = new ArrayList<>();
        for (Reserva reserva : reservas){
            resultado.add(regra.apply(reserva));
        }
        return resultado;
    }

    public static Double somar(List<Reserva> reservas, Function<Reserva, Double> regra){
        double total = 0.0;

        for (Reserva reserva : reservas){
            total += regra.apply(reserva);
        }
        return total;
    }

    public static void main(String[] args) {
        List<Reserva> reservas = new ArrayList<>();

        reservas.add(new Reserva("Natan", 2, 200.0));
        reservas.add(new Reserva("Lima", 4, 150.0));
        reservas.add(new Reserva("Aline", 7, 300.0));
        reservas.add(new Reserva("Fiori", 10, 100.0));

        Function<Reserva, Double> totalBruto = t -> t.getDiarias() * t.getValorDiaria();

        Function<Reserva, Double> totalFinal = t -> {
            if (t.getDiarias() >= 7) {
                return totalBruto.apply(t) * 0.85;
            } else if (t.getDiarias() >= 3 && t.getDiarias() <= 6) {
                return totalBruto.apply(t) * 0.95;
            } else {
                return totalBruto.apply(t);
            }
        };

        Function<Reserva, String> comprovante = t -> t.getHospede() + ": R$ " + totalFinal.apply(t);

        System.out.println("--- Comprovantes ---");
        transformar(reservas, comprovante).forEach(linha -> System.out.println(linha));

        System.out.println("Total faturado: R$ " + somar(reservas, totalFinal));
        System.out.println("Total bruto: R$ " + somar(reservas, totalBruto));
        System.out.println("Total de diárias: " + somar(reservas, reserva -> reserva.getDiarias() * 1.0));
    }
}
