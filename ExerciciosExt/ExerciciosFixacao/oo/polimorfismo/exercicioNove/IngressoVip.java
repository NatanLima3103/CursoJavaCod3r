package oo.polimorfismo.exercicioNove;

public class IngressoVip extends Ingresso{

    public IngressoVip(String cliente){
        super(cliente);
    }

    @Override
    public double calcularPreco() {
        return super.calcularPreco() + 25.0;
    }
}
