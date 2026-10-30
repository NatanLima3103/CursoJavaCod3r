package lambda.predicate.exercicioTres;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Loja {

    public static void main(String[] args) {
        Predicate<Produto> emEstoque = e -> e.getEstoque() > 0;
        Predicate<Produto> caro = e -> e.getPreco() >= 100;

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Teclado", 150.0, 5));
        produtos.add(new Produto("Mouse", 80.0, 0));
        produtos.add(new Produto("Monitor", 900.0, 2));

        produtos.forEach(produto -> System.out.println(produto.getNome() + ": em estoque: " + emEstoque.test(produto) + " | Caro: " + caro.test(produto)));
    }
}
