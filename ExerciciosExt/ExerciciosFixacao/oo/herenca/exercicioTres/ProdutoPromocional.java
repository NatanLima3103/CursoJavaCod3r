package oo.herenca.exercicioTres;

public class ProdutoPromocional extends Produto{

    double percentualDesconto;

    ProdutoPromocional(String nome, double preco, double percentualDesconto){

        super(nome, preco);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    double calcularPreco() {
        return preco - preco * percentualDesconto / 100;
    }
}
