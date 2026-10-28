package lambda.consumer.exercicioTres;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Loja {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Teclado", 100));
        produtos.add(new Produto("Mouse", 50.0));
        produtos.add(new Produto("Monitor", 800.0));
        produtos.add(new Produto("Headset", 200.0));

        Consumer<Produto> exibir = produto ->
                System.out.println(produto.getNome() + ": R$ " + produto.getPreco());

        Consumer<Produto> aplicarDesconto = produto -> produto.setPreco(produto.getPreco() * 0.9);

        produtos.forEach(exibir);

        produtos.forEach(aplicarDesconto);

        System.out.println(" ");

        produtos.forEach(exibir);
    }
}
