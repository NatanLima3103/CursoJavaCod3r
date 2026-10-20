package oo.interfaces.exercicioCinco;

public class Tv implements Dispositivo{
    boolean ligado;

    public Tv(){
        ligado = false;
    }

    @Override
    public String getNome() {
        return "TV";
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
