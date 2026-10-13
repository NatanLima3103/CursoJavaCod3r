package oo.gettersESetters.exercicioUm;

import java.util.ArrayList;

public class Estoque {
    public static void main(String[] args) {

        Produto caderno = new Produto();
        caderno.setNome("Caderno");
        caderno.setPreco(15.0);
        caderno.setQuantidade(10);

        Produto caneta = new Produto();
        caneta.setNome("Caneta");
        caneta.setPreco(2.5);
        caneta.setQuantidade(100);

        Produto mochila = new Produto();
        mochila.setNome("Mochila");
        mochila.setPreco(120.0);
        mochila.setQuantidade(4);

        mochila.setPreco(99.90);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(caderno);
        produtos.add(caneta);
        produtos.add(mochila);

        double total = 0;

        for(Produto p : produtos){
            System.out.println(p.getNome() + " - R$ " + p.getPreco() + " x " + p.getQuantidade());
            total += p.getPreco() * p.getQuantidade();
        }

        System.out.println("Total: R$ " + total);
    }
}
