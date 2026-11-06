package lambda.function.exercicioSeis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioSeis {

    public static double somar(List<Item> itens, Function<Item, Double> regra){
        double total = 0.0;

        for (Item item : itens){
            total += regra.apply(item);
        }

        return total;
    }

    public static void main(String[] args) {
        List<Item> estoque = new ArrayList<>();

        estoque.add(new Item("Arroz", 10, 5.0));
        estoque.add(new Item("Feijão", 8, 7.5));
        estoque.add(new Item("Óleo", 5, 6.0));
        estoque.add(new Item("Café", 4, 15.0));

        Function<Item, Double> valorEmEstoque = item -> item.getQuantidade() *
                item.getPrecoUnitario();
        Function<Item, Double> valorEmLiquidacao = item -> item.getQuantidade() *
                item.getPrecoUnitario() * 0.5;

        System.out.println("Valor em estoque: R$ " + somar(estoque, valorEmEstoque));
        System.out.println("Valor em liquidação: R$ " + somar(estoque, valorEmLiquidacao));

        System.out.println("Total de unidades: " + somar(estoque, item -> item.getQuantidade() * 1.0));
    }
}
