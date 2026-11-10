package lambda.supplier.exercicioCinco;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Lanchonete {

    public static List<Comanda> abrirComandas(int quantidade, Supplier<Comanda> fabrica){
        List<Comanda> qtdComandasNovas = new ArrayList<>();

        for (int i = 1; i <= quantidade; i++){
            qtdComandasNovas.add(fabrica.get());
        }

        return qtdComandasNovas;
    }

    public static double taxaOuPadrao(double taxa, Supplier<Double> padrao){
        if (taxa <= 0){
            return padrao.get();
        } else {
            return taxa;
        }
    }

    public static void main(String[] args) {
        Supplier<Comanda> comandaBalcao = () -> new Comanda("Balcão", 0);
        Supplier<Comanda> comandaMesa = () -> {
            Comanda c = new Comanda("Cliente da mesa", 5);

            c.adicionar(10);

            return c;
        };

        List<Comanda> balcoes = abrirComandas(2, comandaBalcao);
        List<Comanda> mesas = abrirComandas(2, comandaMesa);

        List<Comanda> todos = new ArrayList<>();

        todos.addAll(balcoes);
        todos.addAll(mesas);

        for (Comanda comanda : todos){
            System.out.println(comanda.getCliente() + " - Mesa " + comanda.getMesa() +
                    " - Total: R$ " + comanda.getTotal());
        }

        System.out.println("Total de comandas: " + todos.size());

        System.out.println("Taxa: " + taxaOuPadrao(0.0, () -> 10.0));
        System.out.println("Taxa: " + taxaOuPadrao(15.0, () -> 10.0));

        todos.get(0).adicionar(50.0);
        todos.get(1).adicionar(0.0);

        System.out.println("Comanda 0: R$ " + todos.get(0).getTotal());
        System.out.println("Comanda 1: R$ " + todos.get(1).getTotal());
    }
}
