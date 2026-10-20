package oo.interfaces.exercicioCinco;

import java.util.ArrayList;
import java.util.List;

public class ExercicioCincoTeste {
    public static void main(String[] args) {
        List<Dispositivo> listas = new ArrayList<>();

        listas.add(new Lampada("Sala"));
        listas.add(new Ventilador());
        listas.add(new Tv());
        listas.add(new Lampada("Quarta"));

        for (Dispositivo d : listas){
            d.ligar();
        }

        listas.get(0).desligar();
        listas.get(2).desligar();

        int contadorLigados = 0;

        for (Dispositivo d : listas){
            if (d.estaLigado()){
                contadorLigados++;
                System.out.println(d.getNome() + " está ligado");
            } else {
                System.out.println(d.getNome() + " está desligado");
            }
        }

        System.out.println("Dispositivos ligados: " + contadorLigados);
    }
}
