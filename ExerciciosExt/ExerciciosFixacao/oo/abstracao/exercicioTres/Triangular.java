package oo.abstracao.exercicioTres;

public class Triangular extends Comodo{

    double base;
    double altura;

    public Triangular(String nome, double base, double altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public double calcularCusto(double precoM2) {
        return super.calcularCusto(precoM2);
    }
}
