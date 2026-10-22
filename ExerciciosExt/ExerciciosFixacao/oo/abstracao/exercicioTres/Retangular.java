package oo.abstracao.exercicioTres;

public class Retangular extends Comodo{
    double largura;
    double comprimento;

    public Retangular(String nome, double largura, double comprimento){
        super(nome);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public double calcularArea() {
        return largura * comprimento;
    }

    @Override
    public double calcularCusto(double precoM2) {
        return super.calcularCusto(precoM2);
    }
}
