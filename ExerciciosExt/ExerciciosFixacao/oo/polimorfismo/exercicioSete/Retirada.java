package oo.polimorfismo.exercicioSete;

public class Retirada extends Entrega{
    @Override
    public double calcularFrete(double valorPedido) {
        return 0.0;
    }
}
