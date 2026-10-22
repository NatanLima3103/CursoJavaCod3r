package oo.abstracao.exercicioQuatro;

public class Meia extends Ingresso{

    public Meia(String evento, double precoBase){
        super(evento, precoBase);
    }

    @Override
    public double getPrecoBase() {
        return super.getPrecoBase();
    }

    @Override
    public String descrever() {
        return super.descrever();
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() / 2;
    }
}
