package oo.polimorfismo.exercicioNove;

public class IngressoMeia extends Ingresso{

    public IngressoMeia(String cliente){
        super(cliente);
    }

    @Override
    public double calcularPreco() {
        return super.calcularPreco() / 2;
    }
}
