package oo.polimorfismo.exercicioSeis;

public class Roupa extends Produto{

    public Roupa(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }
}
