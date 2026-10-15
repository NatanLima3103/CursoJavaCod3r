package oo.gettersESetters.exercicioDez;

import java.util.ArrayList;

public class Hotel {
    public static void main(String[] args) {
        Reserva natan = new Reserva("Natan", 3, 200.0);
        Reserva lima = new Reserva("Lima", 7, 300.0);
        Reserva aline = new Reserva("Aline", 45, 150.0);
        Reserva fiori = new Reserva("Fiori", 5, -100);
        Reserva lucca = new Reserva("Lucca", 10, 250.0);

        natan.setConfirmada(true);
        lima.setConfirmada(true);
        aline.setConfirmada(true);

        ArrayList<Reserva> reservas = new ArrayList<>();

        reservas.add(natan);
        reservas.add(lima);
        reservas.add(aline);
        reservas.add(fiori);
        reservas.add(lucca);

        double somaConfirmadas = 0;
        int contadorConfirmadas = 0;
        double maiorTotal = 0;
        String hospedeMaior = "Não foi possível verificar";

        for (Reserva r : reservas){

            System.out.println("Hóspede: " + r.getHospede() + ", noites: " + r.getNoites() + ", total: " + r.getTotal() + ", está confirmada? " + r.isConfirmada());

            if (r.isConfirmada()){
                somaConfirmadas = somaConfirmadas + r.getTotal();
                contadorConfirmadas++;
            }

            if (r.getTotal() > maiorTotal){
                maiorTotal = r.getTotal();
                hospedeMaior = r.getHospede();
            }
        }
        System.out.println("Receita das confirmadas: " + somaConfirmadas);
        System.out.println("Quantidade das confirmadas: " + contadorConfirmadas);
        System.out.println("Maior receita: " + maiorTotal + ", hóspede: " + hospedeMaior);
    }
}
