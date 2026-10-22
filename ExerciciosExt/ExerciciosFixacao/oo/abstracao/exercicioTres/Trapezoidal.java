package oo.abstracao.exercicioTres;

public class Trapezoidal extends Comodo{

    double baseMaior;
    double baseMenor;
    double altura;

    public Trapezoidal(String nome, double baseMaior, double baseMenor, double altura){
        super(nome);
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (baseMaior + baseMenor) * altura / 2;
    }

    @Override
    public double calcularCusto(double precoM2) {
        return super.calcularCusto(precoM2);
    }
}