package oo.abstracao.exercicioQuatro;

public abstract class Ingresso {
    private String evento;
    private double precoBase;

    public Ingresso(String evento, double precoBase){
        this.evento = evento;
        this.precoBase = precoBase;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public String descrever(){
        return "Ingresso para: " + evento;
    }

    public abstract double calcularPreco();
}
