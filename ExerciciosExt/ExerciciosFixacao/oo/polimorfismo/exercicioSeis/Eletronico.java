package oo.polimorfismo.exercicioSeis;

public class Eletronico extends Produto{

    public Eletronico(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() + 30.0;
    }
}
