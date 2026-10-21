package oo.interfaces.exercicioOito;

public class Panfleto implements Imprimivel{
    String campanha;

    public Panfleto(String campanha){
        this.campanha = campanha;
    }

    @Override
    public String imprimir() {
        return "Imprimindo panfleto: " + campanha;
    }
}
