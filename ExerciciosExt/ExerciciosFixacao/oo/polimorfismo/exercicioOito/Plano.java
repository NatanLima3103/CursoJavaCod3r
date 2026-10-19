package oo.polimorfismo.exercicioOito;

public class Plano {
    private String titular;
    private double mensalidadeBase;

    public Plano(String titular, double mensalidadeBase){
        this.titular = titular;
        this.mensalidadeBase = mensalidadeBase;
    }

    public String getTitular() {
        return titular;
    }

    public double getMensalidadeBase() {
        return mensalidadeBase;
    }

    public double calcularMensalidade(){
        return mensalidadeBase;
    }
}
