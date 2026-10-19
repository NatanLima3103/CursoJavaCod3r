package oo.polimorfismo.exercicioCinco;

public class Retangulo extends Forma{

    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        super("Retângulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
