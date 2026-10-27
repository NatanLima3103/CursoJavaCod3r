package lambda.exercicioDozeMaisUm;

import java.util.ArrayList;

public class ExercicioDozeMaisUmTeste {

    public static void mostrarTaxas(String titulo, ArrayList<Pedido> pedidos, TaxaEntrega taxa){
        System.out.println(titulo);

        double somaTaxas = 0;

        for (Pedido pedido : pedidos){
            double valorTaxa = taxa.calcular(pedido);
            System.out.println(pedido.getCliente() + " | " + pedido.getDistanciaKm() + " km | " + pedido.getPesoKg() + " kg | " + valorTaxa);
            somaTaxas += taxa.calcular(pedido);
        }

        System.out.println("Soma das taxas: " + somaTaxas);
    }

    public static void main(String[] args) {

        ArrayList<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido("Natan", 5.0, 2.0));
        pedidos.add(new Pedido("Lima", 12.0, 10.0));
        pedidos.add(new Pedido("Aline", 3.0, 1.0));
        pedidos.add(new Pedido("Fiori", 8.0, 5.0));

        mostrarTaxas("--- Taxa por distância ---", pedidos, pedido -> pedido.getDistanciaKm() * 2.0);

        mostrarTaxas("--- Taxa com peso ---", pedidos, pedido -> {

            double taxa = pedido.getDistanciaKm() * 2.0;

            if (pedido.getPesoKg() > 5.0){
                return taxa + 8.0;
            }
            return taxa;
        });
    }
}
