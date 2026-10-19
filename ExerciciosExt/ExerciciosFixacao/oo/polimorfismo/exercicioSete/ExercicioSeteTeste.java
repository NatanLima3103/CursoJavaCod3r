package oo.polimorfismo.exercicioSete;

import java.util.ArrayList;
import java.util.List;

public class ExercicioSeteTeste {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido("Natan", 80.0, new EntregaPadrao()));
        pedidos.add(new Pedido("Lima", 150.0, new EntregaPadrao()));
        pedidos.add(new Pedido("Aline", 60.0, new EntregaExpressa()));
        Pedido pFiori = new Pedido("Fiori", 40.0, new Retirada());
        pedidos.add(pFiori);

        double totalGeral = 0;
        int contadorTotalGeral = 0;

        for (Pedido p : pedidos){
            totalGeral += p.calcularTotal();
            contadorTotalGeral++;
            System.out.println("Cliente: " + p.getCliente() + ", total: " + p.calcularTotal());
        }

        pFiori.setEntrega(new EntregaExpressa());

        System.out.println();

        System.out.println("Cliente: " + pFiori.getCliente() + ", total: " + pFiori.calcularTotal());

        System.out.println();

        System.out.println("Total geral das entregas: " + totalGeral);
        System.out.println("Número de entregas realizadas: " + contadorTotalGeral);
    }
}
