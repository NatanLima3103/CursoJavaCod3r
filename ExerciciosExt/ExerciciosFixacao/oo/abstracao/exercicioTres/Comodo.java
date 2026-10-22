package oo.abstracao.exercicioTres;

public abstract class Comodo {
    String nome;

    public Comodo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularArea();

    public double calcularCusto(double precoM2){
        double custo = calcularArea() * precoM2;

        if (calcularArea() > 15){
            custo -= custo * 10 /100;
        }

        return custo;
    }
}
