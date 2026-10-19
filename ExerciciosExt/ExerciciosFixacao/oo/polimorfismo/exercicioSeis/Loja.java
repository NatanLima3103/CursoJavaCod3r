package oo.polimorfismo.exercicioSeis;

import java.util.List;

public class Loja {

    public Produto encontrarMaisCaro(List<Produto> produtos) {
        Produto maiorValor = produtos.get(0);
        for (Produto p : produtos) {
            if (p.calcularPrecoFinal() > maiorValor.calcularPrecoFinal()) {
                maiorValor = p;
            }
        }
        return maiorValor;
    }
}
