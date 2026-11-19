package stream.map.exercicioCinco;

import java.util.ArrayList;
import java.util.List;

public class CentralCoworking {

    public static void main(String[] args) {
        List<Reserva> reservas = new ArrayList<>();

        reservas.add(new Reserva("Natan", 3, 25.0));
        reservas.add(new Reserva("Lima", 8, 25.0));
        reservas.add(new Reserva("Aline", 2, 40.0));

        System.out.println("=== RECIBOS ===");
        reservas.stream()
                .map(r ->
                        new Recibo(r.getCliente(), r.getHoras() * r.getValorHora()))
                .forEach(System.out::println);

        System.out.println("=== TOTAIS COM DESCONTO ===");
        reservas.stream()
                .map(r ->
                        new Recibo(r.getCliente(), r.getHoras() * r.getValorHora()))
                .map(r -> "Com desconto: R$ " + r.getTotal() * 0.9)
                .forEach(System.out::println);
    }
}
