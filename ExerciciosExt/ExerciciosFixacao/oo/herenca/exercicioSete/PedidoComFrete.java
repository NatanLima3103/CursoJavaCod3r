package oo.herenca.exercicioSete;

public class PedidoComFrete extends Pedido{

    double frete;

    PedidoComFrete(double valor, double frete){
        super(valor);
        this.frete = frete;
    }

    @Override
    double calcularTotal() {
        return super.calcularTotal() + frete;
    }

    @Override
    String resumo() {
        return super.resumo() + " | Frete: R$ " + frete;
    }
}
