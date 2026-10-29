package lambda.consumer.exercicioCinco;

import arrays.Foreach;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Papelaria {

    public static void main(String[] args) {
        ArrayList<Item> itens = new ArrayList<>();

        itens.add(new Item("Caderno", 15.0, 3));
        itens.add(new Item("Caneta", 2.5, 10));
        itens.add(new Item("Mochila", 120.0, 1));

        Carrinho carrinho = new Carrinho();

        Consumer<Item> exibir = i -> System.out.println(i.getNome() + ": " + i.getQuantidade() + " X R$ " + i.getPreco() + " = R$ " + i.getSubtotal());

        Consumer<Item> somarNoCarrinho = i -> carrinho.adicionar(i.getSubtotal());

        itens.forEach(exibir);

        itens.forEach(somarNoCarrinho);

        System.out.println("Total do carrinho: R$ " + carrinho.getTotal());
    }
}
