package oo.interfaces.exercicioCinco;

import java.util.logging.LogManager;

public class Lampada implements Dispositivo{
    String comodo;
    boolean ligado;

    public Lampada(String comodo){
        this.comodo = comodo;
        ligado = false;
    }

    @Override
    public String getNome() {
        return "Lâmpada da " + comodo;
    }

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }
}
