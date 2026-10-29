package lambda.interfacesProprias.exercicioNove;

import java.util.ArrayList;

public class ExercicioNoveTeste {
    static void listar(String titulo, ArrayList<Produto> produtos, FiltroProduto filtro){
        System.out.println(titulo);
        int total = 0;

        for (Produto produto : produtos){
            if (filtro.aceitar(produto)){
                System.out.println("- " + produto.getNome() + ", R$ " + produto.getPreco() + ", Qtud: " + produto.getQuantidade());
                total++;
            }
        }
        System.out.println("Total: " + total + " produtos(s)");
    }

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mouse", 50.0, 10));
        produtos.add(new Produto("Teclado", 120.0, 0));
        produtos.add(new Produto("Monitor", 900.0, 3));
        produtos.add(new Produto("Cabo HDMI", 25.0, 0));
        produtos.add(new Produto("Headset", 100.0, 5));

        listar("--- Em estoque ---", produtos, produto -> produto.getQuantidade() > 0);

        listar("--- Baratos e disponíveis (até R$ 100", produtos, produto -> {
            if (produto.getQuantidade() == 0){
                return false;
            }
            return produto.getPreco() <= 100;
        });
    }
}
