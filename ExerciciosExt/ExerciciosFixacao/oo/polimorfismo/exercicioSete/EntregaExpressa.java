package oo.polimorfismo.exercicioSete;

public class EntregaExpressa extends Entrega{
    @Override
    public double calcularFrete(double valorPedido) {
        return 25.00;
    }
}
