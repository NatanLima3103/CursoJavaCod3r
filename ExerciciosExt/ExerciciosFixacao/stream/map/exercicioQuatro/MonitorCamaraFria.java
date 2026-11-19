package stream.map.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;

public class MonitorCamaraFria {

    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();

        temperaturas.add(-22.0);
        temperaturas.add(-5.0);
        temperaturas.add(3.0);

        System.out.println("=== TEMPERATURAS ===");

        temperaturas.stream()
                .map(t -> {
                    String status;
                    if (t <= -18){
                        status = "OK";
                    } else if (t <= 0){
                        status = "ATENCAO";
                    } else {
                        status = "CRITICO";
                    }
                    return t + " -> " + status;
                })
                .forEach(System.out::println);

        List<Integer> minutosPortaAberta = new ArrayList<>();

        minutosPortaAberta.add(2);
        minutosPortaAberta.add(15);
        minutosPortaAberta.add(40);

        System.out.println("=== MULTAS DE PORTA ABERTA ===");
        minutosPortaAberta.stream()
                .map(m -> {
                    double multa;

                    if (m <= 5){
                        multa = 0;
                    } else {
                        multa = (m - 5) * 1.5;
                    }
                    return "Multa: R$ " + multa;
                })
                .forEach(System.out::println);
    }
}
