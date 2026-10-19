package oo.polimorfismo.exercicioSeis;

public class Alimento extends Produto{

    private int diasParaVencer;

    public Alimento(String nome, double preco, int diasParaVencer){
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcularPrecoFinal() {
        if (diasParaVencer <= 3){
            return getPreco() * 0.5;
        }
        return getPreco();
    }
}
