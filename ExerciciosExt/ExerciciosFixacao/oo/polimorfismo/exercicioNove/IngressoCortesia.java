package oo.polimorfismo.exercicioNove;

public class IngressoCortesia extends Ingresso{

    public IngressoCortesia(String cliente){
        super(cliente);
    }

    @Override
    public double calcularPreco() {
        return 0.0;
    }
}
