package oo.polimorfismo.exercicioSeis;

import java.util.ArrayList;
import java.util.List;

public class ExercicioSeisTeste {
    public static void main(String[] args) {
        Loja l1 = new Loja();

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Alimento("Leite", 10.0, 2));
        produtos.add(new Eletronico("Fone", 190.0));
        produtos.add(new Roupa("Camisa", 220.0));
        produtos.add(new Alimento("Queijo", 40.0, 10));

        double somaPrecosFinais = 0;

        for (Produto p : produtos){
            System.out.println("Nome: " + p.getNome() + ", preço final: R$ " + p.calcularPrecoFinal());

            somaPrecosFinais += p.calcularPrecoFinal();
        }

        System.out.println("A soma de todos os preços foi de: R$ " + somaPrecosFinais);

        Produto produtoMaisCaro = l1.encontrarMaisCaro(produtos);

        System.out.println("O item mais caro é: " +produtoMaisCaro.getNome());
    }
}
