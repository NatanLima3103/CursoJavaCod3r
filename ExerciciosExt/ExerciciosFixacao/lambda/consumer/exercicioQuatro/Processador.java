package lambda.consumer.exercicioQuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Processador {

    public static void processar(List<Pedido> pedidos, Consumer<Pedido> acao){
        for (Pedido pedido : pedidos){
            acao.accept(pedido);
        }
    }

    public static void main(String[] args) {
        ArrayList<Pedido>pedidos = new ArrayList<>();
        Pedido p1 = new Pedido("Natan", 150.0);
        Pedido p2 = new Pedido("Lima", 80.0);
        Pedido p3 = new Pedido("Fiori", 300.0);

        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);

        processar(pedidos, p ->
                System.out.println("Pedido de " + p.getCliente() + " - " + p.getStatus()));

        processar(pedidos, p -> {
            p.setStatus("ENVIADO");
        });

        processar(pedidos, p ->
                System.out.println("Pedido de " + p.getCliente() + " - " + p.getStatus()));
    }
}
