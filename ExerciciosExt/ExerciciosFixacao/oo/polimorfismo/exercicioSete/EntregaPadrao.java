package oo.polimorfismo.exercicioSete;

public class EntregaPadrao extends Entrega{
    @Override
    public double calcularFrete(double valorPedido) {
        if (valorPedido >= 100.0){
            return 0.0;
        }
        return 15.00;
    }
}
