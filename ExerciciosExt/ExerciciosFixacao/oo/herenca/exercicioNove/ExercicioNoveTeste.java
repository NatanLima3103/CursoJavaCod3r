package oo.herenca.exercicioNove;

import java.util.ArrayList;

public class ExercicioNoveTeste {
    public static void main(String[] args) {

        ArrayList<Reserva> reservas = new ArrayList<>();

        reservas.add(new Reserva("Natan", 3, 200));
        reservas.add(new ReservaLuxo("Lima", 3, 200, 100));
        reservas.add(new ReservaLongaEstadia("Aline", 10, 200));

        double total = 0;

        for(Reserva reserva : reservas){
            total = total + reserva.calcularTotal();

            System.out.println(reserva.resumo());
        }

        System.out.println("Total geral: " + total);
    }
}
