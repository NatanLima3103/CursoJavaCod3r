package oo.herenca.exercicioSete;

import java.util.ArrayList;

public class ExercicioSeteTeste {
    public static void main(String[] args) {

        ArrayList<Pedido> p1 = new ArrayList<>();

        p1.add(new Pedido(100));
        p1.add(new PedidoComFrete(120, 10));
        p1.add(new PedidoGratis(125));
        p1.add(new PedidoAtacado(1400));

        for(Pedido pedido : p1){

            System.out.println(pedido.resumo() + " -> total: " + pedido.calcularTotal());
        }
    }
}