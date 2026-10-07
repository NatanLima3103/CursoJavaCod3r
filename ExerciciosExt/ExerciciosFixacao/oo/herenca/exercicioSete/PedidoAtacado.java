package oo.herenca.exercicioSete;

public class PedidoAtacado extends Pedido{

    PedidoAtacado(double valor){

        super(valor);
    }

    @Override
    double calcularTotal() {
        double total = super.calcularTotal();
        return total - total * 10 / 100;
    }
}
