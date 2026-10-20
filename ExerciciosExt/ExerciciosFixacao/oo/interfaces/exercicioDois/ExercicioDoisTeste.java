package oo.interfaces.exercicioDois;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDoisTeste {
    public static void main(String[] args) {
        List<Reproduzivel> lista = new ArrayList<>();

        lista.add(new Musica("Evidências", "Chitãozinho e Xororó", 4));
        lista.add(new Podcast("Flow", 120, 55));
        lista.add(new Musica("Estrada da vida", "Milionário e José Rico", 5));

        int duracaoTotal = 0;

        for (Reproduzivel r : lista){
            System.out.println(r.reproduzir());
            duracaoTotal += r.getDuracaoMinutos();
        }

        System.out.println("Duração total: " + duracaoTotal + " minutos");
    }
}
