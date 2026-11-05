package lambda.function.exercicioTres;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExercicioTres {

    public static void main(String[] args) {

        Function<Produto, String> obterNome = nome -> nome.getNome();

        Function<Produto, Double> precoComDesconto = preco -> preco.getPreco() * 0.9;

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Camiseta", 50.0));
        produtos.add(new Produto("Calça", 120.0));
        produtos.add(new Produto("Tênis", 200.0));
        produtos.add(new Produto("Boné", 30.0));

        produtos.forEach(produto -> System.out.println("Etiqueta: " + obterNome.apply(produto) +
                " | De R$ " + produto.getPreco() + " por R$ " + precoComDesconto.apply(produto)));
    }
}
