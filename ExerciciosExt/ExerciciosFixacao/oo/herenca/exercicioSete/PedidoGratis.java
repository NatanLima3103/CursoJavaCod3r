package oo.herenca.exercicioSete;

public class PedidoGratis extends Pedido{

    PedidoGratis(double valor){
        super(valor);
    }

    @Override
    double calcularTotal() {
        return 00.0;
    }

    @Override
    String resumo() {
        return "Pedido grátis (valor original: R$ " + valor + ")";
    }
}
