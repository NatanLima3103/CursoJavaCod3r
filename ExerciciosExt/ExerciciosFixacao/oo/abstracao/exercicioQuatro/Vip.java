package oo.abstracao.exercicioQuatro;

public class Vip extends Ingresso{

    double adicional;

    public Vip(String evento, double precoBase, double adicional){
        super(evento, precoBase);
        this.adicional = adicional;
    }

    @Override
    public double getPrecoBase() {
        return super.getPrecoBase();
    }

    @Override
    public String descrever() {
        return super.descrever() + " (VIP)";
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + adicional;
    }
}
