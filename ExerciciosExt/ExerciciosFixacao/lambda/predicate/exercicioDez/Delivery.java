package lambda.predicate.exercicioDez;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Delivery {

    static List<Pedido> filtrar(List<Pedido> pedidos, Predicate<Pedido> regra){
        List<Pedido> filtrados = new ArrayList<>();
        for (Pedido p : pedidos){
            if (regra.test(p)){
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    static int contar(List<Pedido> pedidos, Predicate<Pedido> regra){
        int quantidade = 0;
        for (Pedido p : pedidos){
            if (regra.test(p)){
                quantidade++;
            }
        }
        return quantidade;
    }

    static boolean passarEmTodas(Pedido pedido, List<Predicate<Pedido>> regras){
        for (Predicate<Pedido> regra : regras){
            if (!regra.test(pedido)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido("Natan", 120.0, 3, true));
        pedidos.add(new Pedido("Lima", 45.0, 1, false));
        pedidos.add(new Pedido("Aline", 200.0, 5, true));
        pedidos.add(new Pedido("Fiori", 80.0, 2, true));
        pedidos.add(new Pedido("Ketney", 150.0, 2, false));

        List<Pedido> entregues = filtrar(pedidos, p -> p.isEntregue());
        System.out.println("Entregues:");
        entregues.forEach(p -> System.out.println(p.getCliente() + " - " + p.getValor()));

        int acimaDeCem = contar(pedidos, p -> p.getValor() > 100);
        System.out.println("Pedidos acima de 100: " + acimaDeCem);

        List<Predicate<Pedido>> regrasPromocao = new ArrayList<>();
        regrasPromocao.add(p -> p.getValor() >= 100);
        regrasPromocao.add(p -> p.getItens() >= 3);

        List<Pedido> promocao = filtrar(pedidos, p -> passarEmTodas(p, regrasPromocao));
        System.out.println("Promoção: ");
        promocao.forEach(p -> System.out.println(p.getCliente() + " - " + p.getValor()));
    }
}
