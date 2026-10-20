package oo.interfaces.exercicioCinco;

public class Ventilador implements Dispositivo{
    int velocidade;
    boolean ligado;

    public Ventilador(){
        velocidade = 0;
        ligado = false;
    }

    @Override
    public String getNome() {
        return "Ventilador";
    }

    @Override
    public void ligar() {
        ligado = true;
        velocidade = 1;
    }

    @Override
    public void desligar() {
        ligado = false;
        velocidade = 0;
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }
}
