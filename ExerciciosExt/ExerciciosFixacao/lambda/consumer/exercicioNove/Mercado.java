package lambda.consumer.exercicioNove;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Mercado {

    public static void aplicar(List<Produto> produtos, Consumer<Produto> acao){

        produtos.forEach(acao);
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 12));
        produtos.add(new Produto("Feijão", 3));
        produtos.add(new Produto("Macarrão", 4));
        produtos.add(new Produto("Açúcar", 20));

        Relatorio relatorio = new Relatorio();

        Consumer<Produto> exibir = p -> System.out.println(p.getNome() + ": " + p.getQuantidade() + " un.");
        Consumer<Produto> repor = p -> {
            if (p.getQuantidade() < 5){
                p.setQuantidade(p.getQuantidade() + 10);
                relatorio.registrarReposicoes();
            }
        };

        aplicar(produtos, exibir);
        aplicar(produtos, repor);
        aplicar(produtos, exibir);

        System.out.println("Reposições feitas: " + relatorio.getReposicoes());
    }
}
