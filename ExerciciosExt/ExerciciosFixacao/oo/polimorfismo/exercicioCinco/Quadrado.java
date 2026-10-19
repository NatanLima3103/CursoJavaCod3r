package oo.polimorfismo.exercicioCinco;

public class Quadrado extends Forma{

    private double lado;

    public Quadrado(double lado){
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
